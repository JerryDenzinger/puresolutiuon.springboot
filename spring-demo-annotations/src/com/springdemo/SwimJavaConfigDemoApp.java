package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class 
		AnnotationConfigApplicationContext context = 
			new	AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach tennisCoach = context.getBean("swimCoach" , SwimCoach.class);
		SwimCoach theCoach = context.getBean("swimCoach" , SwimCoach.class);
		
		
		// call getDailyWorkout() method on the TennisCoach bean 
		System.out.println(tennisCoach.getDailyWorkout());
		
		// call getDailyFortune() method on the TennisCoach bean
		System.out.println(tennisCoach.getDailyFortune());
		
		// call the new methods in our SwimCoach class with the props values injected
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());
		
		
		
		// close the context
		context.close();

	}

}
