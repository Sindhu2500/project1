package ServeletsCrud.controller;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ServeletsCrud.dao.Studentdao;
@WebServlet("/delete1")
public class StudentDelete extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String id=req.getParameter("Std_id");
		int cid=Integer.parseInt(id);
		
		Studentdao dao=new Studentdao();
		dao.delete1(cid);



			
			
			
		}
		}



