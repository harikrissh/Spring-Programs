package demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/first")
	public String Hello(){
		return "MyJsp";
	}
	@RequestMapping("/second")
	public String Hi(Model m){
		m.addAttribute("hi", "MVC");
		return "Jsp2";
	}
}
