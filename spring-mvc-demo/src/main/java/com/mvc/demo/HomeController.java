package com.mvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.env.AbstractEnvironment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String hello(@RequestParam("name") String name,Model model) {

		name = name.toUpperCase();
		model.addAttribute("msg", name);
		return "hellow";
	}
}
