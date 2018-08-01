package com.lab13;

import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Player human = new User();
		Player computer = null;
		String username;
		String userChoice;
		String userInput;
		Roshambo value = null;
		Roshambo userValue;
		String userAnswer = null;
		
		do{
		username = Validator.getString(scnr, "Please enter a name: ");
		human.setName(username);
		userChoice = Validator.getString(scnr, "Would you like to play against TheJets or TheSharks(j/s)");

		userInput = Validator.getString(scnr, "R, P, or S");
		if (userChoice.equalsIgnoreCase("J")) {
			computer = new Dummy();
			computer.setName("TheJets: " + computer.generateRoshambo());
			computer.generateRoshambo();
			value = computer.generateRoshambo();

			System.out.println(human.generateRoshambo());
		} else if (userChoice.equalsIgnoreCase("S")) {
			computer = new RandomUser();
			computer.setName("TheSharks");
			value = computer.generateRoshambo();

			computer.generateRoshambo();
		}

		userValue = human.generateRoshambo(userInput);
		System.out.println(username + ": " + human.generateRoshambo(userInput));
		
		System.out.println(displayResults(computer, human, userValue, value));
		System.out.println("Play again? y/n");
		userAnswer = scnr.next();
		}while(userAnswer.equalsIgnoreCase("y"));
		
		System.out.println("Thanks for playing! Goodbye!");

		scnr.close();
	}

	public static String displayResults(Player computer, Player human, Roshambo userValue, Roshambo value) {
		if (userValue == value) {
			return "It's a draw!";
		} else if (userValue == Roshambo.ROCK && value == Roshambo.PAPER
				|| userValue == Roshambo.PAPER && value == Roshambo.SCISSORS
				|| userValue == Roshambo.SCISSORS && value == Roshambo.ROCK) {
			return computer.getName() + " wins!";
		} else {
			return human.getName() + " wins!";
		}

	}
}
