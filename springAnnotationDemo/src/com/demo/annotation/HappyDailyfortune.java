package com.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class HappyDailyfortune implements DailyFortune{

	@Override
	public String getDailyFortune() {
		return "Good day";
	}

}
