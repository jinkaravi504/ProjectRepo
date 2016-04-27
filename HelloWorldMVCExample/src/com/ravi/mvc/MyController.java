package com.ravi.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("welcome")
	public String sayHello(){
		return "welcome";
		
	}
	

}
