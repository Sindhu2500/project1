package controller;


	import java.io.IOException;

	import javax.servlet.GenericServlet;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import javax.servlet.annotation.WebServlet;

	import dao.Studentdao;

	@WebServlet("/update")
	public class Studentupdate  extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	// TODO Auto-generated method stub
		
	String std =req.getParameter("sid");
	int sid1=Integer.parseInt(std); //convert id into integer
	
	String ph_no=req.getParameter("sphno");
	long ph_no1=Long.parseLong(ph_no);

	Studentdao studentdao=new Studentdao();
	studentdao.update(sid1,ph_no1); //convert phone number into long
	}

}
