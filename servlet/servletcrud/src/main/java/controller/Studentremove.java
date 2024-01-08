package controller;

	import java.io.IOException;

	import javax.servlet.GenericServlet;
	import javax.servlet.ServletException;
	import javax.servlet.ServletRequest;
	import javax.servlet.ServletResponse;
	import javax.servlet.annotation.WebServlet;

	import dao.Studentdao;
	@WebServlet("/remove")
	public class Studentremove  extends GenericServlet{

		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
		String std	=req.getParameter("sid");
		int sid1=Integer.parseInt(std);
		
		Studentdao studentdao=new Studentdao();
		String msg=studentdao.delete(sid1);
		res.getWriter().print(msg);
			
		}
}
