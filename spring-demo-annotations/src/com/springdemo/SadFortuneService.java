package com.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Stay home today its not your lucky day :(";
	}

}
