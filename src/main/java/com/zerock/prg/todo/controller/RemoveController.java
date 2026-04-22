package com.zerock.prg.todo.controller;


import com.zerock.prg.todo.service.TodoService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "removeController", urlPatterns = "/todo/remove")
public class RemoveController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("RemoveController....doPost");

        Long num = Long.parseLong(request.getParameter("num"));

        TodoService.instance.remove(num);

        response.sendRedirect("/todo/list");
    }
}
