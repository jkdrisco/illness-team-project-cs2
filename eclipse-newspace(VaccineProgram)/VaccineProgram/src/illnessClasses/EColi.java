package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class EColi extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public EColi(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("DIARRHEA")) {
				possib += 66;
			}
			else if (symptoms.get(i).toUpperCase().matches("HIGH TEMP")) {
				possib += 34;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for E. Coli are diarrhea and high temp.");
	}
	
	@Override
	public String getDesc() {
		return String.format("E. Coli is a bacterial infection sometimes caused by certain strains of the bacteria E. Coli.");
	}
}
