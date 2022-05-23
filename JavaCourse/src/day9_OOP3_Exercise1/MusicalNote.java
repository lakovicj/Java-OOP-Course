package day9_OOP3_Exercise1;

public class MusicalNote {

	private String name;
	private double frequency;
	
	public MusicalNote() {
		
	}
	
	public MusicalNote(String name, double frequency) {
		this.name = name;
		this.frequency = frequency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
}
