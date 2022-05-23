package day4_Methods;

public class Exercise {

	public static void main(String[] args) {
		
		char zero = '0';
		
		char one = '1';
		char nine = '9';
		
		char letter = 'a';
		
		System.out.println(isCharacterADigit(zero));
		System.out.println(isCharacterADigit(one));
		System.out.println(isCharacterADigit(nine));
		System.out.println(isCharacterADigit(letter));
		
		// Exercise 1
		System.out.println(String.format("Sum is %d", sumNumbers(5, 6, 7)));
		
		// Exercise 2
		System.out.println(String.format("Sentance has %d words", wordCounter("This is a Java sentence")));
		
		// Exercise 3
		System.out.println(String.format("Is password valid? " +  isPasswordValid("asdf1asdf")));
		
		// Exercise 4
		System.out.println(upperCaseString("hEllO wOrlD"));
		
		// Exercise 5
		System.out.println(String.format("Result is: %d", complexCalculation(5, 6, 0)));
		
	}
	
	public static boolean isCharacterADigit(char a) {
		if (a >= '0' && a <= '9') {
			return true;
		}
		return false;
	}
	
	public static boolean isCharacterALetter(char letter) {
		if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
			return true;
		}
		
		return false;
	}
	
	public static boolean checkPassword(String password) {
		
		int passwordLength = password.length();
		
		int digitCounter = 0;
		
		for (int i=0; i < passwordLength; i++) {
			char currentChar = password.charAt(i);
			
			if (isCharacterADigit(currentChar) == true) {
				digitCounter++;
			} else if (isCharacterALetter(currentChar) == false) {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	public static void compareCharacters(char first, char second) {
		System.out.println(first == second);
	}
	
	public static int sumNumbers(int x, int y, int z) {
		return x + y + z;
	}
	
	public static int wordCounter(String sentence) {
		
		String[] words = sentence.split(" ");
		int sentenceLength = words.length;
		return sentenceLength;
	}
	
	public static boolean isPasswordValid(String password) {
		if (password.length() < 8 || password.length() > 30) {
			return false;
		}
		
		int digitCounter = 0;
		
		for (int i = 0; i < password.length(); i++) {
			
			
			if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
				digitCounter++;
			} else if (!((password.charAt(i) >= 'a' && password.charAt(i) <= 'z') ||
					(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z'))) {
				return false;
			}
			
		}
		
		if (digitCounter >= 2) {
			return true;
		}
		
		return false;
		
		
	}
	
	
	public static String upperCaseString(String param) {
		return param.toUpperCase();
	}
	
	public static int square(int x) {
		return x * x;
	}
	
	
	public static int complexCalculation(int x, int y, int z) {
		int sum = sumNumbers(x, y, z);
		
		int square = square(sum);
		
		return square;
		
	}

}
