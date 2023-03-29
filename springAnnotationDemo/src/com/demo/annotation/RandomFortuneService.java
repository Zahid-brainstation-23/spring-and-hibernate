package com.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements DailyFortune{
	RandomFortuneService(){
		System.out.println("inside random fortune constructor");
	}

	@Override
	public String getDailyFortune() {
		return "random service";
	}

}
