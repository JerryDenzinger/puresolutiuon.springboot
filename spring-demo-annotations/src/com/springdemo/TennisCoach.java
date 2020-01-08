package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;

	//Define default constructor
    public TennisCoach() {
    	System.out.println(">> TennisCoach: inside default constructor");
	}
    
    //Define setter method
    @Autowired
    @Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService thefortuneService) {
    	System.out.println(">> TennisCoach:inside setFortuneService() method");
		this.fortuneService = thefortuneService;
	}


    /*
	@Autowired
	public TennisCoach(FortuneService thefortuneService) {
	     fortuneService = thefortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune() ;
	}

}
