package com.controller;

import java.io.IOException;
import java.util.List;

import com.dao.Empdao;
import com.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class DisplayController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Empdao dao = new Empdao();
		List<Employee> e = dao.viewAllEmp();
		
		req.setAttribute("data", e);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}
}
