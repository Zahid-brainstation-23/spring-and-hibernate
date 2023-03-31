package com.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/studentform")
	public String getForm(Model model) {
		Student student = new Student();
		model.addAttribute("student",student);
		return "student-form";
	}
	
	@RequestMapping("proccessform")
	public String proccessForm(@Valid @ModelAttribute("student") Student student
			,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "student-form";
		}
		return "confirmstudent";
	}
}
