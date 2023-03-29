package com.demo.java;




public class TennisCoach implements Coach{

	private DailyFortune dailyFortune;
	

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
	
	

}
