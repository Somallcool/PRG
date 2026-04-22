package com.zerock.prg.todo.controller;


import com.zerock.prg.todo.dto.TodoDTO;
import com.zerock.prg.todo.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "listController", urlPatterns = "/todo/list")
public class ListController extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("listController....doGet");

        List<TodoDTO> dtoList = TodoService.instance.getList();

        request.setAttribute("list", dtoList);

        request.getRequestDispatcher("/WEB-INF/todo/list.jsp").forward(request, response);
    }
}
