package com.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.tags.BindErrorsTag;



@Controller
@RequestMapping("/student")
public class StudentController {
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = 
				new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}
	
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
