package com.zerock.prg.todo.controller;


import com.zerock.prg.todo.dto.TodoDTO;
import com.zerock.prg.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "modifyController", urlPatterns = "/todo/modify")
public class ModifyController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("modifyController....doGet");

        Long num = Long.parseLong(request.getParameter("num"));

        TodoDTO dto = TodoService.instance.get(num);

        request.setAttribute("todo", dto);

        request.getRequestDispatcher("/WEB-INF/todo/modify.jsp").forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // 1. 요청(Request) 데이터를 UTF-8로 읽겠다고 선언 (이게 없으면 로그가 깨짐)
        request.setCharacterEncoding("UTF-8");

        // 2. 응답(Response) 데이터를 UTF-8로 보내겠다고 선언
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        System.out.println("modifyController....doPost");

        TodoDTO dto = new TodoDTO();

        dto.setNum(Long.parseLong(request.getParameter("num")));
        dto.setName(request.getParameter("name"));
        dto.setDay(LocalDate.parse(request.getParameter("day")));

        TodoService.instance.update(dto);

        response.sendRedirect("/todo/list");
    }
}
