package com.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/hellowForm")
	public String hellowForm() {
		return "hellowForm";
	}
	
	@RequestMapping("/hellow")
	public String hello() {
		return "hellow";
	}
}
