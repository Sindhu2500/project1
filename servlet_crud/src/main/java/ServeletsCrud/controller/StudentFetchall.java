package ServeletsCrud.controller;

import javax.servlet.http.HttpServlet;
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

@WebServlet("/fetchall")
public class StudentFetchall extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//	super.doGet(req, resp);
		Studentdao dao=new Studentdao();
		List<StudentDto> list=dao.fetchAll();
		
		
		req.setAttribute("Studentlist", list);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("/download.jsp");
		dispatcher.forward(req, resp);
		
		
		for(StudentDto a:list) {
			resp.getWriter().print(a.getStd_name());
			resp.getWriter().print(a.getStd_id());
			resp.getWriter().print(a.getGender());
			resp.getWriter().print(a.getPh_no());
			
		}
	}
   
}
