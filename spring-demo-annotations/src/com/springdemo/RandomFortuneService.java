package com.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of strings 
		private String[] data = 
			{
				               "Beware of the wolf in sheep�s clothing!!",
				               "Diligence is the mother of luck!!",
				               "The journey is the reward!!",
				               "Today is your lucky day buy lotto!!",
				               "Don�t go out today its not your day!!"
			};
		
		// create a random number generator
			private Random myRandom = new Random();

		@Override
		public String getFortune() {
			// pick a random string from the array
			int index = myRandom.nextInt(data.length);
			
			String theFortune = data[index];
			
			return theFortune;
		}


}
