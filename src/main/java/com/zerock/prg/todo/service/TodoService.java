package com.zerock.prg.todo.service;

import com.zerock.prg.todo.dto.TodoDTO;

import java.util.ArrayList;
import java.util.List;

public enum TodoService {
    instance;

    private List<TodoDTO> todolist = new ArrayList<>();

    public void register(TodoDTO dto) {

        long nextNum = todolist.isEmpty() ? 1L : todolist.get(todolist.size() - 1).getNum() + 1;

        dto.setNum(nextNum);

        System.out.println("DEBUG..." +dto);

        todolist.add(dto);
    }

    public List<TodoDTO> getList() {
        return todolist;
    }

    public TodoDTO get(Long num) {

        // todolist.stream(): 리스트에 담긴 데이터들을 하나씩 꺼내어 파이프라인(흐름)에 흘려보내 데이터 가공 or 필터링 준비 완료된 것.
        return todolist.stream()
                // 조건에 맞는 것만 걸러내고 나머지는 버림.
                .filter(todo -> todo.getNum() == num)
                // 필터를 통과한 데이터들 중 가장 첫 번째로 발견된 객체
                .findFirst()
                // 필터링을 통과한 데이터가 하나도 없다면 걍 null로 반환
                .orElse(null);
    }


    public void update(TodoDTO dto) {
        // 수정 대상이 몇 번째에 있는지 찾기
        for (int i = 0; i < todolist.size(); i++) {
            if (todolist.get(i).getNum() == dto.getNum()) {
                // 찾았다면 새로운 데이터(dto)로 그 칸을 갈아끼운다.
                todolist.set(i, dto);
                break;
            }
        }
    }

    public void remove(Long num) {
        todolist.removeIf(todo -> todo.getNum() == num);
        System.out.println("삭제 완료. 현재 개수: " + todolist.size());
    }
}
