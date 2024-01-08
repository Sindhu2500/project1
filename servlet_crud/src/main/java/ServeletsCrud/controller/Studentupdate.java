package ServeletsCrud.controller;

import javax.servlet.GenericServlet;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import ServeletsCrud.dao.Studentdao;
import ServeletsCrud.dto.StudentDto;

@WebServlet("/update")
public class Studentupdate extends GenericServlet{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String std_id = req.getParameter("sid");
		int id = Integer.parseInt(std_id);
		String ph_no = req.getParameter("sphno");
		long no = Long.parseLong(ph_no);// to convert String to long

		Studentdao studentdao = new Studentdao();
		studentdao.update(id, no);

		//StudentDto dto = new StudentDto();
		

	}

}
