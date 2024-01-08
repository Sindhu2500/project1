package ServeletsCrud.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import ServeletsCrud.dto.StudentDto;
import ServeletsCrud.dao.Studentdao;


@WebServlet("/insert")

public class StudentController extends GenericServlet{
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		String std_id=arg0.getParameter("sid");//the name is given here is which is in the frontend name
		String std_name=arg0.getParameter("sname");//the name is given here is which is in the frontend name
        String ph_no=arg0.getParameter("ph_no");
        String gender=arg0.getParameter("gender");
        
        long no=Long.parseLong(ph_no);//to convert String to long
		int sid=Integer.parseInt(std_id);// to convert String to int

        
		//		System.out.println(std_id);
//		System.out.println(std_name);
		
		
		StudentDto dto=new StudentDto();
		
		dto.setStd_id(sid);
		dto.setStd_name(std_name);
		dto.setGender(gender);
		dto.setPh_no(no);
		
		Studentdao studentdao=new Studentdao();
		String msg=studentdao.create(dto);
		arg1.getWriter().print(msg);
		
	}

	

}
