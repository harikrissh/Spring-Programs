package demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam("user") String user, @RequestParam("pwd") String pass, Model m){
		
		if(user.equals("hk")&&pass.equals("123")){
			String msg="Welcome "+user;
			m.addAttribute("op",msg);
			return "success";
		}
		else{
			String msg="Invalid Username or password";
			m.addAttribute("op",msg);
			return "error";
		}
	}
}
