package Controller;

import java.io.IOException;

import dao.StudentDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;

@WebServlet("/update")
public class UpdateController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String action = req.getParameter("action");
		int id = Integer.parseInt(req.getParameter("id"));
		
		StudentDao dao = new StudentDao();
		if(action.equals("edit"))
		{
			Student st = dao.getByid(id);
			req.setAttribute("edata", st);
			req.getRequestDispatcher("index.jsp").forward(req, resp);
			req.setAttribute("msg", "update Successful!!!!!");
			
		}
		else if(action.equals("delete"))
		{
			int i = dao.deleteById(id);
			if(i>0)
			{
				req.getRequestDispatcher("display").forward(req, resp);
				
			}
			
		}
		
	}
	
}
