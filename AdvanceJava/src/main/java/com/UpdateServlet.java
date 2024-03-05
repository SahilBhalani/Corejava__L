package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/update")
public class UpdateServlet  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Connection cn=null;
		String action = req.getParameter("action");
		int uid = Integer.parseInt(req.getParameter("uid"));
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjava","root","");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		if(action.equals("delete"))
		{
			try {
				PreparedStatement ps = cn.prepareStatement("delete from Registration where id=?");
				ps.setInt(1, uid);
				int i = ps.executeUpdate();
				if(i>0)
				{
					req.getRequestDispatcher("display.jsp").forward(req, resp);
				}
				
			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(action.equals("edit"))
		{
			try {
				PreparedStatement ps = cn.prepareStatement("select * from Registration where id=?");
				ps.setInt(1, uid);
				
				HashMap<String, String> m1 = new HashMap<String, String>();
				
				ResultSet rs = ps.executeQuery();
				while(rs.next())
				{
					m1.put("id", rs.getInt(1)+"");
					m1.put("name", rs.getString(2));
					m1.put("email", rs.getString(3));
					m1.put("phone", rs.getString(4));
					m1.put("pass", rs.getString(5));
				}
				
				req.setAttribute("data", m1);
				req.getRequestDispatcher("update.jsp").forward(req, resp);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
}
