package com.neotech.lesson02;

public class PrimitiveDataTypes {
	
	public static void main(String[] args) {
		
		        // Data Type name/identifier operator(=) value;
				// byte can have a value between -128 and 127
				byte age = 29;
				byte temprature = -15;

				short distance = 1500;
				// 3 can also fit in byte, but if i want to assign something
				// more than 127 later, byte wont work!
				short seconds = 3;
				System.out.println(seconds);

				int number = 85000;
				int number2 = 5;

				// if you know the number will be more than 2 billion, use long
				long longNumber = 434554523343243L;
				long longNumber2 = 6L;

				// how would i decide between any of these data types for number?
				// what are the possible values(ranges) of your variables?

				// what about storing decimals?
				// for this we have: double and float
				double doubleNumber = 25.546554445454;
				float floatNumber = 25.54655566545F;

				System.out.println(floatNumber);
				System.out.println(doubleNumber);

				// character definition
				char firstCharacter = 'R';// do not use " for character. It should be single quote(')
				char dollar = '$';
				char three = '3';
				char space = ' ';

				// boolean accepts true or false
				boolean isRaining = false;

				System.out.println(firstCharacter);
				System.out.println(dollar);
				System.out.println(three);
				System.out.println(space);
				System.out.println(isRaining);

		
	}

}
