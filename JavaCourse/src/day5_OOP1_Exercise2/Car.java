package day5_OOP1_Exercise2;

public class Car {

	private boolean isRunning;
	
	public Car() {
		this.isRunning = false;
	}
	
	
	public void power() {		
		this.isRunning = !this.isRunning;
		
	}
	
	public void start() {
		System.out.println("Starting the car");
		this.isRunning = true;
	}
	
	public void stop() {
		System.out.println("Stopping the car");
		this.isRunning = false;
	}


	public boolean isRunning() {
		return isRunning;
	}


	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	
	
	
}