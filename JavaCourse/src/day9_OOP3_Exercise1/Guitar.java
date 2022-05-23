package day9_OOP3_Exercise1;

public class Guitar implements Instrument {

	public Guitar() {
		
	}

	@Override
	public void play(MusicalNote note) {
		System.out.println("Playing note " + note.getName() + " on a guitar");
	}

	@Override
	public void tune(MusicalNote note) {
		System.out.println("Tuning note " + note.getName() + 
				" to " + note.getFrequency() + "Hz on a guitar");

		
	}
}
