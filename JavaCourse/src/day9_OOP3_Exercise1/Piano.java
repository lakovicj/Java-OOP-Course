package day9_OOP3_Exercise1;

public class Piano implements Instrument {

	public Piano() {
		
	}

	@Override
	public void play(MusicalNote note) {
		System.out.println("Playing note " + note.getName() + " on a piano");
	}

	@Override
	public void tune(MusicalNote note) {
		System.out.println("Tuning note " + note.getName() + 
					" to " + note.getFrequency() + "Hz on a piano");
	}
}