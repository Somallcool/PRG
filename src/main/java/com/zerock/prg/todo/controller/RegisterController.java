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

@WebServlet(name = "registerController", urlPatterns = "/todo/register")
public class RegisterController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("registerController....doGet");

        request.getRequestDispatcher("/WEB-INF/todo/register.jsp").forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("registerController....doPost");

        TodoDTO dto = new TodoDTO();

        dto.setName(request.getParameter("name"));
        dto.setDay(LocalDate.parse(request.getParameter("day")));

        TodoService.instance.register(dto);

        response.sendRedirect("/todo/list");
    }
}
