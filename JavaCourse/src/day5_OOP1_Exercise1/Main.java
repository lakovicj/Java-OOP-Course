package day5_OOP1_Exercise1;

public class Main {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		System.out.println(circle.getRadius());
		System.out.println(circle.getColor());
		
		circle.setColor("red");
		circle.setRadius(10.0);
		
		System.out.println(circle.getRadius());
		System.out.println(circle.getColor());
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(15.0);
		Circle c3 = new Circle("yellow");
		Circle c4 = new Circle("green", 20.0);
		
		double circleArea = circle.calculateArea();
		System.out.println("Circle area: " + circleArea);
	}

}
