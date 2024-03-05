package Controller;

import java.io.IOException;

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
		
		
		String id = req.getParameter("id");
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
		
		if(id.equals(null) || id.equals(""))
		{	
			boolean b = dao.isEmailExist(e);
			
			 if(b)
			 {
				 req.setAttribute("err", "Email Already exist");
				 req.getRequestDispatcher("Registration.jsp").forward(req, resp);
			 }
			 else
			 {
				 int i = dao.registration(e);
				 if(i>0)
				 {
				 req.setAttribute("msg", "Registration successfull");
				 req.getRequestDispatcher("Registration.jsp").forward(req, resp);
				 }
				
			 }
			 
		}
		else
		{
			int uid = Integer.parseInt(id);
			e.setId(uid);
			boolean b = dao.isEmailExist(e);
			
			if(b)
			{
				req.setAttribute("err","Email Already exist!!!");
				req.getRequestDispatcher("Registration.jsp").forward(req,resp);
			}
			else
			{
				int i = dao.UpdateEmp(e);
				if(i>0)
				{
					req.setAttribute("msg", "Update success!!!");
					req.getRequestDispatcher("Registration.jsp").forward(req, resp);
				}

			}
		}
		
		
	}
}

