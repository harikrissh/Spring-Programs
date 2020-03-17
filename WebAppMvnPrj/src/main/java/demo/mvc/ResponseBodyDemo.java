package demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ResponseBodyDemo {
	
	@RequestMapping(value="/a", method = RequestMethod.GET)
	public @ResponseBody Country disp(){
		return new Country("Greenland", "Cold");
	}
	
}
