package day2_Literals;

import day5_OOP1.Car;

public class Strings {

	public static void main(String[] args) {
		
		// string variable
		String greet = "Hello World!";
		System.out.println(greet);
		
		Car c = new Car();
		
		
		
		//			======  GET LENGTH OF STRING   ======
		int lengthOfGreet = greet.length();
		System.out.println("Length: " + lengthOfGreet);
		
		
		
		//			======  toUpperCase & toLowerCase  ======
		String upperCaseGreet = greet.toUpperCase();
		String lowerCaseGreet = greet.toLowerCase();
		
		System.out.println(upperCaseGreet);
		System.out.println(lowerCaseGreet);
		
		// be careful with strings
		// strings are IMMUTABLE
		// that means string value cannot be changed once it's set
		// for example:
		
		greet.toLowerCase();
		System.out.println(greet);			// value of greet variable hasn't changed!
		
		// so the change is not done in-place
		// instead, new string is returned
		
		
		
		//			======  TRIM  ======
		// remove all trailing whitespaces
		
		String greetWithWhitespaces = "      HELLO!      ";
		System.out.println(greetWithWhitespaces);
		System.out.println(greetWithWhitespaces.trim());
		
		
		//			======   SPLIT  ======
		// split all string characters into an array
		
		
		String vehicles = "car,truck,bike";
		// split method receives a regex around which splitting is done
		// in this case, we are spliting around comma 
		String[] vehicleArray = vehicles.split(",");
		System.out.println(vehicleArray);		// prints memory location of array because array is an object
		System.out.println(vehicleArray[0]);
		System.out.println(vehicleArray[1]);
		System.out.println(vehicleArray[2]);
		
		
		
		//			======   CONCAT  ======
		// concatenate two strings
		
		String firstName = "Marko";
		String lastName = "Markovic";
		String fullName = firstName.concat(lastName);
		
		System.out.println(fullName);
		
		// we can concatenate strings with plus sign as well
		
		System.out.println(firstName + lastName);
		System.out.println(firstName + " " + lastName);
		
		
		//          ======  EQUALS   =======
		// compare if two strings are equal
		
		String firstString = "Apple";
		String secondString = "apple";
		String thirdString = "orange";
		
		System.out.println("Apple and apple are equal? " + firstString.equals(secondString));
		System.out.println("Apple and apple are equal (ignore case)? " + firstString.equalsIgnoreCase(secondString));
		System.out.println("Apple and orange are equal (ignore case)?" + firstString.equalsIgnoreCase(thirdString));
		
		// be careful, strings are ALWAYS compared with equals/equalsIgnoreCase!!!!
		System.out.println("Apple == Apple? " + (firstString == "Apple"));
		
		String oneMoreAppleString = "Apple";
		System.out.println("Are oneMoreAppleString and firstString the same? " + oneMoreAppleString == firstString);
		
		
		//          ======  SUBSTRING   =======
		// get substring of a string 
		
		String word = "Letter";
		String subString = word.substring(0, 2);
		System.out.println(subString);
		
		
		//          ======  String format()   =======
		String myName = "Pera";
		
		String formattedString = String.format("My name is %s", myName);
		System.out.println(formattedString);
		
		int myAge = 25;
		String formattedString2 = String.format("My name is %s and I am %d years old", myName, myAge);
		System.out.println(formattedString2);
		
		

		
		
		
	}
}
