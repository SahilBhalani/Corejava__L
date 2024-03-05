package Controller;

import java.io.IOException;
import java.util.ArrayList;

import Model.Employee;
import dao.EmployeeDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class DisplayController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		EmployeeDao dao = new EmployeeDao();
		ArrayList<Employee> e = dao.getEmpData();
		
		req.setAttribute("data", e);
		req.getRequestDispatcher("display.jsp").forward(req, resp);
	}

}
