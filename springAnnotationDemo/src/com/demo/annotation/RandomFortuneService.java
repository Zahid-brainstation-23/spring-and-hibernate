package com.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements DailyFortune{

	@Override
	public String getDailyFortune() {
		return "random service";
	}

}
