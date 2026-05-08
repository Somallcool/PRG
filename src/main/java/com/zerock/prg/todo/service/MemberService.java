package com.zerock.prg.todo.service;

import com.zerock.prg.todo.dto.MemberDTO;

import java.util.ArrayList;
import java.util.List;

public enum MemberService {
    INSTANCE;
    private List<MemberDTO> memberlist = new ArrayList<>();

    MemberService() {
        MemberDTO admin = new MemberDTO();
        admin.setMid("admin");
        admin.setMpw("1111");
        admin.setName("관리자");
        memberlist.add(admin);
    }

    // 회원가입
    public void register(MemberDTO dto) {
        memberlist.add(dto);
        System.out.println("회원가입 완료: "+dto);
    }

    // 로그인 확인 (ID/PW 일치 여부 체크)
    public MemberDTO login(String mid, String mpw) {
        return memberlist.stream()
                .filter(member -> member.getMid().equals(mid))
                .filter(member -> member.getMpw().equals(mpw))
                .findFirst()
                .orElse(null); //일치하는 회원이 없으면 null 반환
    }

}
