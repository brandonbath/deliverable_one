package JavaDeliverableOne;
import java.util.Scanner;
public class WhatToEat{
	
public static void main(String [] args) {
	Scanner scnr = new Scanner(System.in);
	String eventType;
	int partySize;
	String result;
	String mealSuggestion;
	String prepSuggestion;
	
	
	System.out.println("What type of event are you having? (casual, semi-formal, or formal)");
	
	// user inputs type of event
	eventType = "formal"; //replace with scnr.next();
	
	System.out.println("What is the party size?");
	
	// user inputs party size
	partySize = 4; //replace with scnr.nextInt();
	
	// make conditional statement about event types to meal suggestion
	if (eventType.equals("casual")) {
		mealSuggestion = "sandwiches";
	}
	else if (eventType.equals("semi-formal")) {
		mealSuggestion = "fried chicken";
	}

	else {
		mealSuggestion = "chicken parmesan";
	}
	
	
	
	
	
	
	
	
	
	prepSuggestion = "hot";
	

	//testing output
	System.out.print("Since you're hosting " + eventType + " event for " + partySize + " participants, you should serve " + mealSuggestion + " prepared " + prepSuggestion + " .");
	
	
}
}


