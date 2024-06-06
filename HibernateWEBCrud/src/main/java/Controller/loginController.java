package Controller;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/login")
public class loginController extends HttpServlet {
	
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		
		Student s = new Student();
		
		s.setEmail(email);
		s.setPass(pass);
		
		StudentDao dao = new StudentDao();
		
		 Student std = dao.loginchk(s);
		 
		 System.out.println(std);
		
		if(std == null)
		{
			req.setAttribute("err", "Invalid Crendentials");
			req.getRequestDispatcher("Login.jsp").forward(req, resp);
		}
		else
		{
			req.getRequestDispatcher("display").forward(req, resp);
		}
	}

}
