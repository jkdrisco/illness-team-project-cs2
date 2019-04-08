package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Mumps extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Mumps(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("FEVER")) {
				possib += 20;
			}
			else if (symptoms.get(i).toUpperCase().matches("HEADACHE")) {
				possib += 20;
			}
			else if (symptoms.get(i).toUpperCase().matches("MUSCLE ACHES")) {
				possib += 20;
			}
			else if (symptoms.get(i).toUpperCase().matches("TIREDNESS")) {
				possib += 20;
			}
			else if (symptoms.get(i).toUpperCase().matches("LOSS OF APPETITE")) {
				possib += 20;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for mumps are fever, headache, muscle aches, tiredness, and loss of appetite.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Mumps is a viral infection that affects the salivary glands that's easily preventable by a vaccine.");
	}
}
