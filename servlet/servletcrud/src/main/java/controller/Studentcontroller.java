package controller;

	import java.io.IOException;

import javax.servlet.GenericServlet;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import javax.servlet.annotation.WebServlet;

	import dao.Studentdao;
	import dto.Studentdto;
	@WebServlet("/insert")
	public class Studentcontroller extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String id=req.getParameter("sid");
	int id1=Integer.parseInt(id);
	String name=req.getParameter("sname");
	String mail=req.getParameter("smail");
	String ph_no=req.getParameter("sphno");
	long ph_no1=Long.parseLong(ph_no);
	   String gender=req.getParameter("gender");

	Studentdto studentdto=new Studentdto();
	studentdto.setSid(id1);
	studentdto.setSname(name);
	studentdto.setSmail(name);
	studentdto.setSphno(ph_no1);
	studentdto.setGender(gender);

	Studentdao studentdao=new Studentdao();
	String msg=studentdao.create(studentdto);
	res.getWriter().print(msg);
	}
	}



