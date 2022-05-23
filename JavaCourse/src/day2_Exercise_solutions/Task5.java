package day2_Exercise_solutions;

public class Task5 {

	// Write a Java program that concatenates two strings
	// First string should be your first name, and second string should be your last name
	// Try different ways of concatenating
	public static void main(String[] args) {

		String firstName = "Pera";
		String lastName = "Peric";
		
		
		// this will just concatenate two strings
		// there is no white-space between two variables
		String fullNameConcatenated = firstName.concat(lastName);
		System.out.println("concat method: " + fullNameConcatenated);
		
		// with String.format(..)
		String fullNameFormatted = String.format("%s %s", firstName, lastName);
		System.out.println("Formatted: " + fullNameFormatted);
		
		// inline
		System.out.println("Inline concatenation: " + firstName + " " + lastName);
		
		// or like this
		String fullNameManually = firstName + " " + lastName;
		System.out.println("Full name manual concatenation: " + fullNameManually);
	}

}
