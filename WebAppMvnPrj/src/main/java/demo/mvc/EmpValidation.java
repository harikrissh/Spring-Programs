package demo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmpValidation {

	@RequestMapping("/empform")
	public String empForm(Model m){
		
		m.addAttribute("emp1", new Employee());
		return "EmpValidation";
	}
	
	@RequestMapping("/callvalid")
	public String checkForm(@Valid @ModelAttribute("emp1") Employee e, BindingResult br){
		if(br.hasErrors())
			return "EmpValidation";
		else
			return "EmpValidationSuccess";
	}
}
