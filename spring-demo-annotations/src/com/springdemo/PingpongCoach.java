package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PingpongCoach implements Coach {
	
	// Field injection
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	/*
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	//Define default constructor
	public PingpongCoach() {
		System.out.println(">> PingpongCoach: inside default constructor");
	}

	
	//Define setter method For setter injection 
    @Autowired
	public void setFortuneService(FortuneService thefortuneService) {
    	System.out.println(">> PingpongCoach: inside setFortuneService() method");
		this.fortuneService = thefortuneService;
	}

    
	@Autowired
	public PingpongCoach(FortuneService thefortuneService) {
	     fortuneService = thefortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice using both hands";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() ;
	}

}
