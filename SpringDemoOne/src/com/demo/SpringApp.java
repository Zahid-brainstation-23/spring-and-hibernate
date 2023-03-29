package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext  applicationContext
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		CricketCoach coach = applicationContext.getBean("myCoach",CricketCoach.class);
		System.out.println(coach.getDailyWork());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getName());
		applicationContext.close();
		
		
	}
}
