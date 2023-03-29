package com.demo.annotation;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach1 = applicationContext.getBean("tennisCoach",Coach.class);
		Coach coach2 = applicationContext.getBean("tennisCoach",Coach.class);
		System.out.println("Same object? "+(coach1==coach2));
	}
}
