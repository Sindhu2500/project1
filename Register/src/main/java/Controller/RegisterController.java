package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Dao.RegisterDao;
import Dto.RegisterDto;


@Controller
public class RegisterController {

	@RequestMapping("/insert")
	public ModelAndView insertMvc(@ModelAttribute RegisterDto dto,RegisterDao dao) {
		
		System.out.println(dto.getName());
		System.out.println(dto.getEmail());
		System.out.println(dto.getPassword());
		
		
		ModelAndView andView=new ModelAndView("insert.jsp");
		andView.addObject("msg", "data inserted");
		return andView;
	}
}


