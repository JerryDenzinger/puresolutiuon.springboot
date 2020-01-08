package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class 
		AnnotationConfigApplicationContext context = 
			new	AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach" , Coach.class);
		
		
		// call getDailyWorkout() method on the TennisCoach bean 
		System.out.println(tennisCoach.getDailyWorkout());
		
		// call getDailyFortune() method on the TennisCoach bean
		System.out.println(tennisCoach.getDailyFortune());
		
		
		
		// close the context
		context.close();

	}

}
