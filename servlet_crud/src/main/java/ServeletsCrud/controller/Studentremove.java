package ServeletsCrud.controller;

import javax.servlet.GenericServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import ServeletsCrud.dao.Studentdao;


@WebServlet("/remove")
public class Studentremove extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String sid=req.getParameter("sid");
		int sid1=Integer.parseInt(sid);
		
		Studentdao studentdao = new Studentdao();
		String msg=studentdao.delete(sid1);
		res.getWriter().print(msg);
	}
}
