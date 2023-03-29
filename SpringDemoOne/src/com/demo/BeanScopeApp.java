package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext  applicationContext
		= new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");
		HappyFortuneService fortuneService1 = applicationContext.getBean("fortune",HappyFortuneService.class);
		HappyFortuneService fortuneService2 = applicationContext.getBean("fortune",HappyFortuneService.class);
		System.out.println("Compare object ref: "+(fortuneService1==fortuneService2));
		System.out.println("Memory address for fortuneService1: "+fortuneService1);
		System.out.println("Memory address for fortuneService2: "+fortuneService2);
		applicationContext.close();
	}
}
