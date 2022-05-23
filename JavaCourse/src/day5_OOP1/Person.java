package day5_OOP1;

public class Person {
	
	private int age;
	
	// default constructor
	public Person() {
		
	}
	// constructor
	public Person(int age) {
		this.age = age;
	}
	
	// getter
	public int getAge() {
		return this.age;
	}
	
	// setter
	public void setAge(int age) {
		if (age < 0) {
			System.out.println("Age cannot be a negative number");
			// throw some exception
			return;
		}
		this.age = age;
	}
}
