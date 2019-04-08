package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Croup extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Croup(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("WHEEZING")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("DROOLING")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("VOICE LOSS")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("DIFFICULTY SWALLOWING")) {
				possib += 25;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for croup are wheezing, drooling, voice loss, and difficulty swallowing.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Croup is an upper airway infection that blocks breathing and has a distinctive barking cough.");
	}
}
