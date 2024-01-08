package Controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.StudentDao;
import dto.StudentDto;

@WebServlet("/insert")
public class StudentController extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sid=req.getParameter("sid");
		String sname=req.getParameter("sname");
		String phno=req.getParameter("phno");
		String gender=req.getParameter("gender");
		
		int sid1=Integer.parseInt(sid);
		long pho1=Long.parseLong(phno);
		
		StudentDto dto=new StudentDto();
		dto.setSid(sid1);
		dto.setSname(sname);
		dto.setPhno(pho1);
		dto.setGender(gender);
		
		
		StudentDao dao=new StudentDao();
	    String a1=dao.create(dto);
	    res.getWriter().print(a1);
	
		}
	

}
