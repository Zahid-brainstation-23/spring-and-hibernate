package com.demo.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.demo.annotation")
public class JavaConfig {
	@Bean
	public DailyFortune dailyFortune() {
		return new HappyDailyfortune();
	}
	
	@Bean
	public Coach tennisCoach() {
		return new TennisCoach(dailyFortune());
	}
}
