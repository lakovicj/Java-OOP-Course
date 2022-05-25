package day10_Exceptions;

public class Main {

	public static void main(String[] args) {
		
		// try to run commented code
		// it will generate java.lang.ArithmeticException
		// because division by zero is not possible!
		
		// int result = 5 / 0;
		
		// if we want to catch and handle the error,
		// wrap it with try-catch block
		
		try {
			
			int result = 5 / 0;
			System.out.println("Result: " + result);
			
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is not possible!");
		} finally {
			System.out.println("This is printed anyways");
		}
		
		
		try {
			divideByZero();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void divideByZero() throws Exception {
		throw new ArithmeticException("Trying to divide by zero");
	}
}
