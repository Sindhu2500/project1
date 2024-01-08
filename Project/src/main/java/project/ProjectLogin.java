package project;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.ProjectDao;
import Dto.ProjectDto;

@WebServlet("/login")
public class ProjectLogin extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		String email=req.getParameter("emailid");
		String pwd=req.getParameter("pwd");
		int fpassword=Integer.parseInt(pwd);
		
		
		
		ProjectDao dao=new ProjectDao();
		ProjectDto d1=dao.login(email);
		
		
		if(d1!=null) {
			if(d1.getPwd()==fpassword) {
				resp.getWriter().print("<h1>account not found,please signup</h1><a href='http://localhost:8080/Project/marks.html'>click here for signup</a>");
//				resp.getWriter().print("<h1>welcome to home page</h1>");
			}
			else {
				resp.getWriter().print("<h1>enter proper password</h1>");
			}
//			
//		}
//		else {
			 
		}
	
		}
	}

	


