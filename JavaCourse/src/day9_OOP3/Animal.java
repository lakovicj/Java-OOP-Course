package day9_OOP3;

public abstract class Animal {
	
	// constructor
	public Animal() {
		
	}

	// abstract method (needs implementation in all child classes)
	public abstract void sound();
	
	// regular method with implementation
	public void sleep() {
		System.out.println("zzz...");
	}
}
