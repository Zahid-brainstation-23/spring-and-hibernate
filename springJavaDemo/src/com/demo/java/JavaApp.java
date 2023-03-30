package com.demo.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(JavaConfig.class);
		Coach coach = applicationContext.getBean("tennisCoach",Coach.class);
		System.out.println(coach.getDailyFortune());
		
	}
}
