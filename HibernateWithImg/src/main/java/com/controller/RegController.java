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
		
		Employee e = new Employee();
		String id = req.getParameter("id");
		if(id.equals("") || id.equals(null))
		{
			
		}
		else
		{
			e.setId(Integer.parseInt(id));
		}
		String name= req.getParameter("name");
		Part file = req.getPart("img");

		String filename = Paths.get(file.getSubmittedFileName()).getFileName().toString();
	
		
		
		e.setName(name);
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
		
		if(id.equals("") || id.equals(null))
		{
			req.setAttribute("msg", "reg successFulll!!!!");
		}
		else
		{
			req.setAttribute("msg", "update SuccessFull!!!");
		}
				req.getRequestDispatcher("index.jsp").forward(req, resp);
		
		

		
	}
}
