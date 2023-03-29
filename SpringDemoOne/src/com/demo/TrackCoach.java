package com.demo;

public class TrackCoach implements Coach{

	FortuneService fortuneService;
	TrackCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWork() {
		return "run daily 5k";
	}
	
	@Override
	public String getDailyFortune() {
		return "Best Of luck: "+fortuneService.getFortune();
	}
	
	

}
