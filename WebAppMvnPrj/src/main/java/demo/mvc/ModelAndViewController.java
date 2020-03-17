package demo.mvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ModelAndViewController {
	
	@RequestMapping(value="/modelview", method=RequestMethod.GET)
	public ModelAndView getData(){
		List<String> myList=myList();
		Map<String, String> country=myMap();
		ModelAndView mv=new ModelAndView("modelview");
		mv.addObject("myList", myList);
		mv.addObject("map", country);
		return mv;
	}
	
	List<String> myList(){
		List<String> list=new ArrayList<>();
		list.add("Ind");
		list.add("Aus");
		list.add("Eng");
		return list;
	}
	
	Map<String, String> myMap(){
		Map<String, String> country=new LinkedHashMap<String, String>();
		
		country.put("US", "United States");
		country.put("UK", "United Kingdom");
		country.put("IND", "India");
		country.put("AUS", "Australia");
		return country;
	}
}
