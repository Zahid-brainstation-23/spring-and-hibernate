package com.demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class TennisCoach implements Coach{
	@Autowired
	@Qualifier("randomFortuneService")
	private DailyFortune dailyFortune;


	@Override
	public String getDailyWorkOut() {
		return "practice tennis";
	}

	@Override
	public String getDailyFortune() {
		return dailyFortune.getDailyFortune();
	}
	
	@PostConstruct
	public void afterConstruct() {
		System.out.println("construct");
	}
	
	@PreDestroy
	public void beforeDestroy() {
		System.out.println("destroy");
	}
	

}
