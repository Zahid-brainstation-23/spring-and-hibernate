package com.demo.java;

import org.springframework.beans.factory.annotation.Value;

public class TennisCoach implements Coach{

	private DailyFortune dailyFortune;
	
	@Value("${name}")
	private String name;
	

	public TennisCoach(DailyFortune dailyFortune) {
	
		this.dailyFortune = dailyFortune;
	}

	@Override
	public String getDailyWorkOut() {
		return "practice tennis";
	}

	@Override
	public String getDailyFortune() {
		return dailyFortune.getDailyFortune();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
