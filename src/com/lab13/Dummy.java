package com.lab13;

public class Dummy extends Player {
	
	public Dummy()  {
		super();
	}

	@Override
	public Roshambo genereateRoshambo() {
		// TODO Auto-generated method stub
		return Roshambo.ROCK;
	}

	@Override
	public Roshambo generateRoshambo(String userInput) {
		// TODO Auto-generated method stub
		return null;
	}

}
