package day5_OOP1_Exercise2;

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		System.out.println("Is car running? " + car.isRunning());
		car.stop();
		System.out.println("Is car running? " + car.isRunning());
		car.power();
		System.out.println("Is car running? " + car.isRunning());
	}

}
