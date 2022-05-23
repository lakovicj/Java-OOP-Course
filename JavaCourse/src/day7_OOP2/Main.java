package day7_OOP2;

public class Main {

	public static void main(String[] args) {
		
		// variable of String type (instance of a String class)
		String name = "Pera";
		
		// check if name is instance of a String class
		boolean result1 = name instanceof String;
		System.out.println("is name a String? " + result1);
		
		// variable of Animal type
		Animal animal = new Animal();
		
		// check if animal variable is instance of an Animal class
		boolean result2 = animal instanceof Animal;
		System.out.println("is animal variable instance of Animal?" + result2);		

		
		Dog dog = new Dog();
		dog.eat();
		dog.bark();
		animal.eat();
	}

}
