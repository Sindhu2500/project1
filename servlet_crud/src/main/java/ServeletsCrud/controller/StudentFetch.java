package ServeletsCrud.controller;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import ServeletsCrud.dao.Studentdao;
import ServeletsCrud.dto.StudentDto;

@WebServlet("/fetch")
public class StudentFetch extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sid=req.getParameter("sid");
		int sid1=Integer.parseInt(sid);
		
		StudentDto studentdto1=new StudentDto();
		studentdto1.setStd_id(sid1);
		
		Studentdao Studentdao=new Studentdao();
		String str=Studentdao.fetch(sid1);
		res.getWriter().print(str);
	}


}
