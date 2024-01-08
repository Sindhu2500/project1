package Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.StudentDao;
import dto.StudentDto;

@WebServlet("/remove")
public class StudentDelete extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid=req.getParameter("sid");
		int sid1=Integer.parseInt(sid);
		
		StudentDto dto=new StudentDto();
		dto.setSid(sid1);
		
		
		StudentDao dao=new StudentDao();
		String a1=dao.delete(dto);
		res.getWriter().print(a1);
	}
	

}
