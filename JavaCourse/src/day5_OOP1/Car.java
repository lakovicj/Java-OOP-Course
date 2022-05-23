package day5_OOP1;

public class Car {

	// fields (state)
	private String manufacturer;
	private String model;
	private int year;
	private String color;
	
	// Parametrized constructor
	public Car(String manufacturer, String model, int year, String color) {
		this.manufacturer = manufacturer;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	
	
	// No-Arg constructor
	public Car() {
		// body of constructor method
		year = 2022;
	}
	
	
	// methods (behavior)
	public void start() {
		System.out.println("Starting the engine");
	}
	
	public void stop() {
		System.out.println("Stopping the car");
	}
	
	public int getYear() {
		return this.year;
	}
	
	
	public static void main(String[] args) {
		Car volvo = new Car();
		
	}
}
