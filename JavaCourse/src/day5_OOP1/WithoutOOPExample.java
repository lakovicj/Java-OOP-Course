package day5_OOP1;

public class WithoutOOPExample {

	public static void main(String[] args) {

		// Kako mozemo grupisati podatke o nekom entitetu bez OOP?
		
		// nizovima
		String[][] osoba = new String[2][2];
		osoba[0][0] = "Pera";
		osoba[0][1] = "Peric";
		
		osoba[1][0] = "Marko";
		osoba[1][1] = "Markovic";
		
		// Sta ako zelimo da imamo i podatke koji nisu string? -> problem
		
		// Mozemo cuvati podatke u skroz zasebnim promenljivim,
		// ali ovo je jos gore
		
		String osoba1Ime = "Pera";
		String osoba1Prezime = "Peric";
		int osoba1Godine = 40;
		
		String osoba2Ime = "Marko";
		String osoba2Prezime = "Markovic";
		int osoba2Godine = 25;
		
		
	}

}
