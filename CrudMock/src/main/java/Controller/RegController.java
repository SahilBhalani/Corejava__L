package Controller;

import java.io.IOException;

import Dao.UserDao;
import Model.Model;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse; 

@WebServlet("/reg")
public class RegController  extends HttpServlet{
	
 @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 
	 String id = req.getParameter("id");
	 String uname = req.getParameter("uname");
	 String email = req.getParameter("email");
	 String pass = req.getParameter("pass");
	 
	 Model m = new Model();
	 m.setUname(uname);
	 m.setEmail(email);
	 m.setPass(pass);

	UserDao dao = new UserDao();
	

	int i = dao.registration(m);
	if(i>0)
	{
		req.setAttribute("msg", "data inserted !!!");
		req.getRequestDispatcher("reg.jsp").forward(req, resp);
	}
	 
	 
	 
	 
	 
	 
}
	
	
}
	

