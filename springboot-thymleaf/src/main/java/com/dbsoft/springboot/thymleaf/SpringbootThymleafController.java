package com.dbsoft.springboot.thymleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SpringbootThymleafController {
	
	@RequestMapping("/show")
	public String showName(Model model, @RequestParam(value="name", required=false,defaultValue="Deb") String name){
		model.addAttribute("name", name);
		return "showname";
		
	}

}
