package com.neotech.lesson02;

public class VariableDecleration {
	public static void main(String[] args) {
		
		// 1st way of creating a variable
		int number1 = 5; 
		
		// 2nd way
		// Java allows us to declare a variable without assigning an initial value
		
		int number2; // declaration
		number2 = 10; // assigning a value
		
		/*	char c1;
		    char c2;
		    char c3;*/

	    char c1, c2, c3;

	    c1 = '@';
	    c2 = '#';
	    c3 = '&';

	System.out.println(number2);
	System.out.println(c3);
	
	
	// value reassignment
			System.out.println(number1); // this will print the current value (5)

			number1 = 15; // this is value reassignment
							// after this statement, Java knows that the new value is 15
			System.out.println(number1); // new value (15) will be printed

			// number1 = "55";//this is not allowed since number1 is an integer and "55" is
			// a string

			number1 = 55;
			System.out.println(number1);

			number1 = 40;
			number1 = 100;
			System.out.println(number1);
   
	// Console Her zaman en sondaki degeri baz alir. 		

	}

}
