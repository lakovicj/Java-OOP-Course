package day6_OOP1_Exercise3;

public class Main {

	public static void main(String[] args) {
		
		Student studentPera = new Student();
		studentPera.setFirstName("Pera");
		studentPera.setLastName("Peric");
		studentPera.setJmbg("1234567891234");
		studentPera.setCollege("FTN");
		studentPera.setDepartment("Software Engineering");
		
		// calling printInfo method
		studentPera.printInfo();
		
		// on the other side, this is implicitly calling
		// toString() method..
		System.out.println(studentPera);
		
		// try to set JMBG to invalid String
		studentPera.setJmbg("123123");
		// new JMBG is not valid, so it is not changed
		System.out.println(studentPera);

	}

}
