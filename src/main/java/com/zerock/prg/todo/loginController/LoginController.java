package com.zerock.prg.todo.loginController;

import com.zerock.prg.todo.dto.MemberDTO;
import com.zerock.prg.todo.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "loginController", urlPatterns = "/member/login")
public class LoginController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("LoginContoller....doGet");
        req.getRequestDispatcher("/WEB-INF/member/login.html").forward(req,resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("LoginController....doPost");

        String mid = req.getParameter("mid");
        String mpw = req.getParameter("mpw");

        MemberDTO dto = MemberService.INSTANCE.login(mid, mpw);

        if (dto != null) {
            HttpSession session = req.getSession();
            session.setAttribute("loginInfo", dto);

            System.out.println("로그인 성공: " + dto.getName());
            resp.sendRedirect("/main");
        } else {
            System.out.println("로그인 실패");
            resp.sendRedirect("/member/login?error=fail");
        }
    }
}
