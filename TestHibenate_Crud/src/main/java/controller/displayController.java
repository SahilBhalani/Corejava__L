package controller;

import java.io.IOException;
import java.util.List;

import dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.User;

@WebServlet("/display")
public class displayController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		UserDao u = new UserDao();
		List<User> u1 = u.viewalluser();
		
		req.setAttribute("data", u1);
		req.getRequestDispatcher("display").forward(req, resp);
		
	}
	
}
