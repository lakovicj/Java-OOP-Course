package day5_OOP1;

public class Main {

	public static void main(String[] args) {
		Person person = new Person();
		
		// we can't access the age property of a person
		// because it's a private property
		// but we can use getter method to access it
		System.out.println(person.getAge());		// here we have a default value of 0
		
		// we can't update it directly because it's private
		// but we can update it using setter method
		person.setAge(25);
		System.out.println(person.getAge());
		
		// if we try to set age to negative number, we'll
		// get the message that the operation is not possible
		// and person will still be 25 years old from before
		person.setAge(-20);
		System.out.println(person.getAge());
		
	
		Car c = new Car();
		System.out.println("==================");
		System.out.println(c.getYear());
		c.start();
		c.stop();

	}

}
