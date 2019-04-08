package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Measles extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Measles(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("RUNNY NOSE")) {
				possib += 25;
			}
			if (symptoms.get(i).toUpperCase().matches("RED EYES")) {
				possib += 25;
			}
			if (symptoms.get(i).toUpperCase().matches("COUGH")) {
				possib += 25;
			}
			if (symptoms.get(i).toUpperCase().matches("HIGH FEVER")) {
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
		return String.format("The symptoms for measles are runny nose, red eyes, cough, and high fever.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Measles is a viral infection that's serious for small children but is easily preventable by a vaccine.");
	}
}
