package demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathVariableController {

	@RequestMapping("/path/{name}/{age}")
	public ModelAndView disp(@PathVariable("name") String name, @PathVariable("age") int age){
		ModelAndView mv= new ModelAndView("PathDemo");
		mv.addObject(name);
		mv.addObject(age);
		return mv;
	}
}
