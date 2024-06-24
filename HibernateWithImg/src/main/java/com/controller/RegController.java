package com.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import com.dao.Empdao;
import com.model.Employee;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/reg")
@MultipartConfig
public class RegController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		String name= req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		Part file = req.getPart("img");

		String filename = Paths.get(file.getSubmittedFileName()).getFileName().toString();
		
		
	
		Employee e = new Employee();
		
		e.setName(name);
		e.setEmail(email);
		e.setPass(pass);
		e.setImg(filename);
		
		
		String basepath = req.getServletContext().getRealPath("")+File.separator+"img";
		
		
		
		File f = new File(basepath);
		
		if(!f.exists())
		{
			f.mkdir();
		}
		
		file.write(basepath+File.separator+filename);
		
		Empdao dao = new Empdao();
		
		dao.AddorUpdate(e);
		
		req.setAttribute("msg", "reg successFulll!!!!");
		req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		

		
	}
}
