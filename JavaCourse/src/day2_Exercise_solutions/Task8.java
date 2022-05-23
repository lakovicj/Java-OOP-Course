package day2_Exercise_solutions;

public class Task8 {

	// Write Java program that iterates from 1 to 100
	// and prints only even numbers
	public static void main(String[] args) {
		
		// for loop
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		// while loop
		int counter = 1;
		while (counter <= 100) {
			if (counter % 2 == 0) {
				System.out.println(counter);
			}
			counter++;
		}

	}

}
