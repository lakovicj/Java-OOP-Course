package day9_OOP3;

public class Dog extends Animal implements Printable {
	
	public Dog() {
		// we can call constructor
		// of abstract Animal class
		super();
	}

	@Override
	public void sound() {
		System.out.println("Woof!");
	}

	@Override
	public void print() {
		System.out.println("I am a dog!");
		
	}
	
}
