package day5_OOP1_Exercise1;

public class Circle {
	
	private double radius;
	private String color;
	
	public Circle() {
		this.radius = 5.0;
		this.color = "blue";
	}
	
	public Circle(String color, double radius) {
		
		if (this.isRadiusPositive(radius)) {
			this.radius = radius;
		} else {
			this.radius = 1.0;
		}
		this.color = color;
	}
	
	public Circle(String color) {
		this.color = color;
		this.radius = 5.0;
	}
	
	public Circle(double radius) {
		if (this.isRadiusPositive(radius)) {
			this.radius = radius;
		} else {
			this.radius = 1.0;
		}
		this.color = "red";
	}
	
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setRadius(double radius) {
		if (this.isRadiusPositive(radius)) {
			this.radius = radius;
		} else {
			this.radius = 1.0;
		}
		
		this.someComplexFunction();
	}
	
	public void setColor(String color) {
		System.out.println("You cannot change the color of circle");
	}
	
	public boolean isRadiusPositive(double radius) {
		if (radius < 0) {
			System.out.println("Radius cannot be negative number");
			return false;
		} 
		return true;
	}
	
	public double calculateArea() {
		double area = this.radius * this.radius * 3.14;
		return area;
	}
	
	
	
	private void someComplexFunction() {
		// kompleksna izracunavanja....
		System.out.println("Izracunavam nesto jako kompleksno i zahtevno");
	}

}

