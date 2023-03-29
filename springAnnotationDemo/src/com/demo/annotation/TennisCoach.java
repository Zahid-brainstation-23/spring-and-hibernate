package com.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
	@Autowired
	private DailyFortune dailyFortune;


	@Override
	public String getDailyWorkOut() {
		return "practice tennis";
	}

	@Override
	public String getDailyFortune() {
		return dailyFortune.getDailyFortune();
	}

}
