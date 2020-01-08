package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		// read spring config file 
		ClassPathXmlApplicationContext context = 
			new	ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach" , Coach.class);
		
		Coach pingpongCoach = context.getBean("pingpongCoach" , Coach.class);
		
		// call a method on the TennisCoach bean 
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(pingpongCoach.getDailyFortune());
		
		// call a method on the PingpongCoach bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(pingpongCoach.getDailyFortune());
		
		
		// close the context
		context.close();

	}

}
