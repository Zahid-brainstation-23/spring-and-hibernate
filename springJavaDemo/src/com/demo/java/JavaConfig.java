package com.demo.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.demo.annotation")
@PropertySource("classpath:sport.properties")
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
