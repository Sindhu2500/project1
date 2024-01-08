package ServeletsCrud.controller;
import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ServeletsCrud.dao.Studentdao;
import ServeletsCrud.dto.StudentDto;

@WebServlet("/update1")
public class StudentUpdate1 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String id=req.getParameter("Std_id");
		int cid=Integer.parseInt(id);
		String name=req.getParameter("Std_name");
		String num=req.getParameter("ph_no");
		long cnum=Long.parseLong(num);
		String gender=req.getParameter("Gender");
		
		StudentDto dto=new StudentDto();
		dto.setStd_id(cid);
		dto.setGender(gender);
		dto.setPh_no(cnum);
		dto.setStd_name(name);
		
		Studentdao dao=new Studentdao();
		dao.update1(dto);
		List<StudentDto> l1=dao.fetchAll();
		
		req.setAttribute("studentlist",l1);
		
		//resp.setContentType("text/html");
		resp.getWriter().print("<h1>data updated sucessfully</h1>");
		RequestDispatcher dispatcher=req.getRequestDispatcher("download.jsp");
		dispatcher.include(req, resp);
	}

}
