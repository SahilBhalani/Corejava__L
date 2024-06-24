package controller;

import java.io.IOException;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;


@WebServlet("/reg")
public class RegController extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		User u = new User();
		
		String id = req.getParameter("id");
		u.setUname(req.getParameter("uname"));
		u.setEmail(req.getParameter("email"));
		u.setPass(req.getParameter("pass"));
		
		
		UserDao dao = new UserDao();
		
		int i = dao.addOrUpdate(u);
		
		req.setAttribute("msg", "Registration SuccessFull!!!");
		req.getRequestDispatcher("Index.jsp").forward(req, resp);
		
		
		
	}
}
