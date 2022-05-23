package day2_Exercise_solutions;

public class Task7 {

	// Write Java program that prints name of the weekday with passed ordinal number
	// 1 - Monday
	// 2 - Tuesday
	// ...
	// 7 - Sunday
	
	// note: Use switch statement
	
	public static void main(String[] args) {
		
		int dayOrdinal = 5;
		
		switch(dayOrdinal) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Please enter a valid number");
		}
		
		System.out.println("I'm finished");

	}

}
