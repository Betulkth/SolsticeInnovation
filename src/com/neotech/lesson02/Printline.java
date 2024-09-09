package com.neotech.lesson02;

public class Printline {
	public static void main(String[]args) {
		System.out.println("What's up everyone");
		
		// println -> prints the statement and moves the cursor into the next line
		// print   -> prints the statments and keeps the cursor in line
		
		System.out.print("1"); // after printing 1, cursor stays in the same line
		System.out.print("2"); // this is printed where the cursor is
		System.out.print("3"); // this is also printed where the cursor is
		
		System.out.println("4");// this will print next to 3, the cursor will move to the next line
		System.out.println("5");// this will print in new line and the cursor moves to the next line
		System.out.println("6");// this will print in new line and the cursor moves to the next line
		
		// \n --> same as hitting Enter
		System.out.println("Do you like Java? \nYes I do!");
		
		System.out.println("\n");  // Her seferinde 2 kez asagi ilerlenir. 
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("\n");
		
		// we can also have several \n in a single statement
		System.out.print("\n\n\n");
		System.out.println("Something else");
		
		
		/*			comment line 1
		comment line 2
		comment line 3
		comment line 4*/
		
		
	}

}
