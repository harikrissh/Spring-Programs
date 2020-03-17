package demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class I18NController {
	
	@RequestMapping(value="/i18n", method=RequestMethod.GET)
	public ModelAndView greeting(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "Internationalization");
		mv.setViewName("I18NView");
		return mv;
	}
}
