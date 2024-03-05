package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/edit")
public class EditServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		String uname = req.getParameter("uname");
		String Email = req.getParameter("Email");
		String Phone = req.getParameter("Phone");
		String pass = req.getParameter("Pass");
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","");
			
			PreparedStatement ps = cn.prepareStatement("update Registration set uname=?,Email=?,Phone=?,Pass=? where id=?");
			
			ps.setInt(5, id);
			ps.setString(1, uname);
			ps.setString(2, Email);
			ps.setString(3, Phone);
			ps.setString(4, pass);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				
				req.getRequestDispatcher("display.jsp").forward(req, resp);
			}
			
		}
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}
}
