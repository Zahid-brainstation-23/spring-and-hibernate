package com.demo;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {
		return "The day is lucky";
	}
	
	public void init() {
		System.out.println("init happyfortuneservice");
	}
	public void destroy() {
		System.out.println("destroy happyfortuneservice");
	}


}
