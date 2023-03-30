package com.mvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("silly")
public class SillyController {
	
	@RequestMapping("/hellowForm")
	public String hellowForm() {
		return "silly/silly";
	}
}
