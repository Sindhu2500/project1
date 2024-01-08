package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ProjectDao;
import Dto.ProjectDto;

@WebServlet("/result")
public class ProjectResult extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String us=req.getParameter("USN");
		String date=req.getParameter("date");
		
		int usn=Integer.parseInt(us);
		

		ProjectDto dto=new ProjectDto();
		dto.setUSN(usn);
		dto.setDate(date);
		
		ProjectDao dao=new ProjectDao();
		dao.result(dto);
		

}
}
