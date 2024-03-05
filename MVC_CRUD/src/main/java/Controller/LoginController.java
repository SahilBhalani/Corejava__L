package Controller;

import java.io.IOException;

import Model.Employee;
import dao.EmployeeDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Employee e = new Employee();
		e.setEmail(email);
		e.setPass(pass);
		
		EmployeeDao dao = new EmployeeDao();
		String uname = dao.logincheck(e);
		

		if(uname==null)
		{
			req.setAttribute("err", "Invalid credentials !!!");
			req.getRequestDispatcher("login.jsp").forward(req, resp);
		}
		else
		{
			req.setAttribute("uname", uname);
			req.getRequestDispatcher("Home.jsp").forward(req, resp);
		}
		
	}
	
}
