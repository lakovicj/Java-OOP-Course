package day8_OOP2_Exercise1;

public class Employee extends Person {

	private double salary;
	private int startYear;
	private String insurance;
	
	
	public Employee() {
		
	}
	
	public Employee(double salary, int startYear, String insurance) {
		this.insurance = insurance;
		this.salary = salary;
		this.startYear = startYear;
	}
	
	public Employee(String firstName, String lastName, String jmbg, double salary, int startYear, String insurance) {
		super(firstName, lastName, jmbg);
		this.insurance = insurance;
		this.salary = salary;
		this.startYear = startYear;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getStartYear() {
		return startYear;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s (%s)\nInsurance number: %s", this.getFirstName(), this.getLastName(), this.getJmbg(), this.insurance);
				
	}
}
