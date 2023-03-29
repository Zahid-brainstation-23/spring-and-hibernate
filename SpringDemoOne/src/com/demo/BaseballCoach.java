package com.demo;

public class BaseballCoach implements Coach{
	FortuneService fortuneService;
	BaseballCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWork() {
		return "practice 2hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
