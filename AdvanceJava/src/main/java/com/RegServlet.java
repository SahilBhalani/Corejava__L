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

@WebServlet("/Reg")
public class RegServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String phone = req.getParameter("phone");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","");
			
			
			PreparedStatement ps = cn.prepareStatement("insert into Registration values(?,?,?,?,?)");
			ps.setInt(1, 0);
			ps.setString(2, uname);
			ps.setString(3, email);
			ps.setString(4, pass);
			ps.setString(5, phone);
			
			int i = ps.executeUpdate();
			
			if(i>0)
			{
				req.setAttribute("msg", "Registration successfull....");
				req.getRequestDispatcher("Registration.jsp").forward(req, resp);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
