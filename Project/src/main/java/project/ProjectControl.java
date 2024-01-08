package project;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import Dao.ProjectDao;
import Dto.ProjectDto;

@WebServlet("/insert")
public class ProjectControl extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String us=req.getParameter("USN");
		String mon=req.getParameter("mon");
		String medium=req.getParameter("medium");
		String type=req.getParameter("type");
		String name=req.getParameter("name");
		String fname=req.getParameter("fname");
		String mname=req.getParameter("mname");
		String gender=req.getParameter("gender");
		String total=req.getParameter("total_marks");
		
		int usn=Integer.parseInt(us);
		int mon1=Integer.parseInt(mon);
		
		
		
		String ab=req.getParameter("ab");
		int ab1=Integer.parseInt(ab);
		String ad=req.getParameter("ad");
		int ad1=Integer.parseInt(ad);
		String ae=req.getParameter("ae");
		int ae1=Integer.parseInt(ae);
		
		String af=req.getParameter("af");
		
		String ag=req.getParameter("ag");
		int ag1=Integer.parseInt(ag);
		String ai=req.getParameter("ai");
		int ai1=Integer.parseInt(ai);
		String aj=req.getParameter("aj");
		int aj1=Integer.parseInt(aj);
		
		String ak=req.getParameter("ak");
		
		String al=req.getParameter("al");
		int al1=Integer.parseInt(al);
		String an=req.getParameter("an");
		int an1=Integer.parseInt(an);
		String ao=req.getParameter("ao");
		int ao1=Integer.parseInt(ao);
		
		String ap=req.getParameter("ap");
		
		String aq=req.getParameter("aq");
		int aq1=Integer.parseInt(aq);
		String as=req.getParameter("as");
		int as1=Integer.parseInt(as);
		String at=req.getParameter("at");
		int at1=Integer.parseInt(at);
		
		String au=req.getParameter("au");
		
		String av=req.getParameter("av");
		int av1=Integer.parseInt(av);
		String ax=req.getParameter("ax");
		int ax1=Integer.parseInt(ax);
		String ay=req.getParameter("ay");
		int ay1=Integer.parseInt(ay);
		
        String az=req.getParameter("az");
		
		String ba=req.getParameter("ba");
		int ba1=Integer.parseInt(ba);
		String bd=req.getParameter("bd");
		int bd1=Integer.parseInt(bd);
		String be=req.getParameter("be");
		int be1=Integer.parseInt(be);
		
        String bf=req.getParameter("bf");
		
		String bg=req.getParameter("bg");
		int bg1=Integer.parseInt(bg);
		String bi=req.getParameter("bi");
		int bi1=Integer.parseInt(bi);
		String bj=req.getParameter("bj");
		int bj1=Integer.parseInt(bj);
		
		String bk=req.getParameter("bk");
		
		
		
		
		
		
		
		
		ProjectDto dto=new ProjectDto();
		dto.setUSN(usn);
		dto.setDate1(mon1);
		dto.setMedium(medium);
		dto.setType(type);
		dto.setName(name);
		dto.setFname(fname);
		dto.setMname(mname);
		dto.setGender(gender);
		dto.setTotal_marks(total);
		dto.setAb(ab1);
	    dto.setAd(ad1);
	    dto.setAe(ae1);
	    dto.setAg(ag1);
	    dto.setAi(ai1);
	    dto.setAj(aj1);
	    dto.setAl(al1);
	    dto.setAn(an1);
	    dto.setAo(ao1);
	    dto.setAq(aq1);
	    dto.setAs(as1);
	    dto.setAt(at1);
	    dto.setAv(av1);
	    dto.setAx(ax1);
	    dto.setAy(ay1);
	    dto.setBa(ba1);
	    dto.setBd(bd1);
	    dto.setBe(be1);
	    dto.setBg(bg1);
	    dto.setBi(bi1);
	    dto.setBj(bj1);
	    
	    
		
		
		
		ProjectDao dao=new ProjectDao();
		String a1=dao.create(dto);
		res.getWriter().print(a1);
		
		
	}

}
