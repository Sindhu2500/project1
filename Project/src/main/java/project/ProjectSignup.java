package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ProjectDao;
import Dto.ProjectDto;

@WebServlet("/signup")
public class ProjectSignup extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String pwd=req.getParameter("pwd");
		int pwd1=Integer.parseInt(pwd);
		
		
		ProjectDto dto=new ProjectDto();
		dto.setEmail(email);
		dto.setName(name);
		dto.setPwd(pwd1);
		
		
		ProjectDao dao=new ProjectDao();
		dao.signup(dto);
		
	}	
}
