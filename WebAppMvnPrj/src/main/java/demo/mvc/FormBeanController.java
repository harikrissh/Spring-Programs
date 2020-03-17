package demo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormBeanController {
	@RequestMapping("/page1")
	public String firstPage(Model m){
		FormBean fb=new FormBean();
		
		Map<String, String> country=new LinkedHashMap<String, String>();
		country.put("", "Select");
		country.put("US", "United States");
		country.put("UK", "United Kingdom");
		country.put("IND", "India");
		country.put("AUS", "Australia");
		
		m.addAttribute("countryList", country);
		m.addAttribute("fb", fb);
		
		return "FormPage1";
	}
	
	@RequestMapping("/FormBeanSuccess")
	public String secondPage(@ModelAttribute("res") FormBean fb1){
		return "FormPage2";
		
	}
}
