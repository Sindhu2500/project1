package controller;

import java.io.IOException;

import javax.persistence.AssociationOverride;
import javax.persistence.EntityManager;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Studentdao;
import dto.Studentdto;

@WebServlet("/fetchbyid")
public class Studentfetch extends GenericServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String std=req.getParameter("sid");
		int sid1=Integer.parseInt(std);
		
		Studentdao studentdao=new Studentdao();
		Studentdto sid11=studentdao.fetchById(sid1);
		 res.getWriter().print(sid11);
		 
		 
		
	}

		

}
