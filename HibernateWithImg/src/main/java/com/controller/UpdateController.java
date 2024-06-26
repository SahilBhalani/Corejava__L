package com.controller;

import java.io.IOException;

import com.dao.Empdao;
import com.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateController  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
		String action = req.getParameter("action");
		int id = Integer.parseInt(req.getParameter("id"));
		
		
		Empdao dao = new Empdao();
		if(action.equals("edit"))
		{
			Employee e = dao.GetEmpBYID(id);
			req.setAttribute("edata", e);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			
		}
		
		else if(action.equals("delete"))
		{
			int i = dao.DeleteEmp(id);
			if(i>0)
			{
				req.getRequestDispatcher("display").forward(req, resp);
			}
		}
	}
	
}
