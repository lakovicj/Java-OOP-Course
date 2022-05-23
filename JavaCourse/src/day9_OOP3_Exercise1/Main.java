package day9_OOP3_Exercise1;

public class Main {

	public static void main(String[] args) {
		
		Piano piano = new Piano();
		Guitar guitar = new Guitar();
		
		MusicalNote noteDO = new MusicalNote("DO", 240.0);
		MusicalNote noteRE = new MusicalNote("RE", 290.0);
		MusicalNote noteMI = new MusicalNote("MI", 310.0);
		MusicalNote noteFA = new MusicalNote("FA", 323.0);
		MusicalNote noteSOL = new MusicalNote("SOL", 390.0);
		
		piano.play(noteDO);
		piano.tune(noteRE);
	
		guitar.play(noteDO);
		guitar.tune(noteFA);
	}

}
