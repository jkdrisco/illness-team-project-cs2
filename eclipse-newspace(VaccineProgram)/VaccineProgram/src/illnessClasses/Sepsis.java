package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Sepsis extends Illness {
	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Sepsis(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("FEVER")) {
				possib += 32;
			}
			else if (symptoms.get(i).toUpperCase().matches("HIGH HEART RATE")) {
				possib += 28;
			}
			else if (symptoms.get(i).toUpperCase().matches("HIGH BLOOD PRESSURE")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("SWEATING")) {
				possib += 15;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for sepsis are fever, high heart rate, high blood pressure, and sweating.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Sepsis is a life threatening complication of an infection.");
	}
}
