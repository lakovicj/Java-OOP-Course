package day10_Exceptions;

public class UncheckedExceptionExample {

	public static void main(String[] args) {
		
		// we initialize a String variable with null value
		String firstName = null;
		
		// and then try to upper-case it
		// because variable does not have a reference to a String value,
		// instead it has the value of null - it cannot be uppercased
		
		// this is why we get an unchecked Exception here - NullPointerException
		// we can wrap it with try-catch to handle this Exception
		try {
			String firstNameUppercased = firstName.toUpperCase();
			System.out.println(firstNameUppercased);			
		} catch (NullPointerException e) {
			System.out.println("Cannot uppercase NULL value!");
		}
		
	}

}
