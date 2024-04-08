package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import Model.Employee;
import dao.EmployeeDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class RegistrationController extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw = resp.getWriter();
		
		
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String phone = req.getParameter("phone");
		
		Employee e = new Employee();
		e.setFname(fname);
		e.setLname(lname);
		e.setEmail(email);
		e.setPass(pass);
		e.setPhone(phone);
		
		EmployeeDao dao = new EmployeeDao();

		int i = dao.registration(e);
		if (i > 0) {
			pw.append("Registration successfully !!");
		}
		
		}
}



