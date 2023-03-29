package com.demo.annotation;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = applicationContext.getBean("tennisCoach",Coach.class);
		
		applicationContext.close();
		
	}
}
