package day6_OOP1_Exercise3;

public class Student {
	
	private String firstName;
	private String lastName;
	private String jmbg;
	private String college;
	private String department;
	
	public Student() {
		
	}

	public Student(String firstName, String lastName, String jmbg, String college, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		if (this.isJMBGValid(jmbg)) {
			this.jmbg = jmbg;			
		}
		this.college = college;
		this.department = department;
	}
	
	// methods
	
	public boolean isJMBGValid(String jmbg) {
		if (jmbg.length() == 13) {
			return true;
		}
		System.out.println("JMBG is not valid!");
		return false;
	}
	
	public void printInfo() {
		System.out.println(String.format("Student: %s %s (%s)", this.firstName, this.lastName, this.jmbg));
		System.out.println(String.format("%s, %s", this.college, this.department));
	}
	
	// overriden toString method
	@Override
	public String toString() {
		return String.format("Student: %s %s (%s)\n%s, %s", this.firstName, this.lastName, this.jmbg, this.college, this.department);
	}
	
	// getters & setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJmbg() {
		return jmbg;
	}

	public void setJmbg(String jmbg) {
		if (this.isJMBGValid(jmbg)) {
			this.jmbg = jmbg;			
		}
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	

}
