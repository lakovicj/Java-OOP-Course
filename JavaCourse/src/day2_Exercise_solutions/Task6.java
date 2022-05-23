package day2_Exercise_solutions;

public class Task6 {
	
	// Write a Java program that writes appropriate message based on the
	// comparison of two integers:
	// Numbers are equal
	// Number1 is greater than Number2
	// Number1 is lower than Number2

	public static void main(String[] args) {

		int number1 = 10;
		int number2 = 20;
		
		if (number1 > number2) {
			System.out.println("Number1 is greater than number2");
			System.out.println(String.format("%d > %d", number1, number2));
		} else if (number1 < number2) {
			System.out.println("Number1 is lower than number2");
			System.out.println(String.format("%d < %d", number1, number2));
		} else {
			System.out.println("Number1 is equal to number2");
			System.out.println(String.format("%d == %d", number1, number2));
		}
	}

}
