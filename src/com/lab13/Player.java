package com.lab13;

public abstract class Player {
	private String name;
	private Roshambo value;
	
	
	
	public Player() {
		super();		
			}
	
	public abstract Roshambo genereateRoshambo();	
	public abstract Roshambo generateRoshambo(String userInput);
	
	
	public Player(String name, Roshambo value) {
		super();
		this.name = name;
		this.value = value;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Roshambo getValue() {
		return value;
	}
	public void setValue(Roshambo value) {
		this.value = value;
	}

	public Roshambo generateRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}
}
	
	
