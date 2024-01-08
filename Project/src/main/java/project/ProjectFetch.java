package project;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import Dao.ProjectDao;
import Dto.ProjectDto;

@WebServlet("/fetch")
public class ProjectFetch extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String us=req.getParameter("usn");
		int usn=Integer.parseInt(us);
		
		ProjectDto dto=new ProjectDto();
		dto.setUSN(usn);
		
		ProjectDao dao=new ProjectDao();
		String str=dao.fetch(usn);
		res.getWriter().print(str);
	}
	

}
