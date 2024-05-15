package Controller;

import java.io.IOException;
import java.util.ArrayList;

import Dao.UserDao;
import Model.Model;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class DisplayController extends HttpServlet {

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		UserDao dao = new UserDao();
		ArrayList<Model> m = dao.getusrdata();
		
		req.setAttribute("data", m);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
		
	}
}
