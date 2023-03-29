package com.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyDailyfortune implements DailyFortune{
	
	HappyDailyfortune(){
		System.out.println("inside HappyDailyfortune constructor");
	}

	@Override
	public String getDailyFortune() {
		return "Good day";
	}

}
