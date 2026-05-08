package com.zerock.prg.todo.loginController;

import com.zerock.prg.todo.dto.MemberDTO;
import com.zerock.prg.todo.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "joinController", urlPatterns = "/member/join")
public class MemberController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("JoinController....doGet");

        req.getRequestDispatcher("/WEB-INF/member/join.html").forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("JoinController....doPost");
        req.setCharacterEncoding("UTF-8");

        MemberDTO dto = new MemberDTO();
        dto.setMid(req.getParameter("mid"));
        dto.setMpw(req.getParameter("mpw"));
        dto.setName(req.getParameter("mname"));

        MemberService.INSTANCE.register(dto);

        resp.sendRedirect("/member/login");
    }
}
