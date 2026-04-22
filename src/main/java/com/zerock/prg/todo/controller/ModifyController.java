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

        System.out.println("modifyController....doPost");

        TodoDTO dto = new TodoDTO();

        dto.setNum(Long.parseLong(request.getParameter("num")));
        dto.setName(request.getParameter("name"));
        dto.setDay(LocalDate.parse(request.getParameter("day")));

        TodoService.instance.update(dto);

        response.sendRedirect("/todo/list");
    }
}
