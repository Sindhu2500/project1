package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ProjectDao;


@WebServlet("/update")
public class ProjectUpdate extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String us = req.getParameter("USN");
		int usn= Integer.parseInt(us);
		String name=req.getParameter("name");
		
		ProjectDao dao=new ProjectDao();
		dao.update(usn,name);

	}

}
