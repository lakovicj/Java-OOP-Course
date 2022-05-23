package day1_Intro;

public class Main {
	
	public void printHelloWorld() {
		System.out.println("Hello world from method!");
	}
	
	public void declareVariables() {
		int myNum = 5;               	// Integer (whole number)
		float myFloatNum = 5.99f;    	// Floating point number
		char myLetter = 'D';         	// Character
		boolean myBool = true;       	// Boolean
		String myText = "Hello";     	// String
	}
	
	public void automaticCasting() {
		int myInt = 9;
		double myDouble = myInt;		// Automatic casting: int to double
		
		System.out.println(myInt);
		System.out.println(myDouble);
	}
	
	public void manuallyCasting() {
		double myDouble = 9.78d;
	    int myInt = (int) myDouble; 	// Manual casting: double to int

	    System.out.println(myDouble);   // Outputs 9.78
	    System.out.println(myInt);      // Outputs 9
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world from main!");
		Main obj = new Main();
		obj.printHelloWorld();
		obj.automaticCasting();
		obj.manuallyCasting();
		
	}
	
	
	

}
