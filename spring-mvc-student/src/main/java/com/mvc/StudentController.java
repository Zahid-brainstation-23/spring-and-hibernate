package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/studentform")
	public String getForm(Model model) {
		Student student = new Student();
		student.setFirstName("First Name");
		student.setLastName("Last Name");
		model.addAttribute("student",student);
		return "student-form";
	}
	
	@RequestMapping("proccessform")
	public String proccessForm(@ModelAttribute("student") Student student) {

		return "confirmstudent";
	}
}
