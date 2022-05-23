package day9_OOP3;

public class Square implements Polygon, Printable {

	private double a;
	
	public Square() {
		
	}
	
	public Square(double a) {
		this.a = a;
	}
	
	@Override
	public void print() {
		System.out.println("I am a square with a=" + this.a);
		
	}

	@Override
	public double calculateArea() {
		return this.a * this.a;
	}
}
