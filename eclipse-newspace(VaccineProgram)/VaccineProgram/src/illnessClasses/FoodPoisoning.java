package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class FoodPoisoning extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public FoodPoisoning(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("DIARRHEA")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("STOMACH CRAMPS")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("NAUSEA")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("VOMITING")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("FEVER")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("UPSET STOMACH")) {
				possib += (50/3);
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for food poisoning are diarrhea, stomach cramps, nausea, vomiting, fever, and upset stomach.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Food poisoning is an illness caused by food contaminated with bacteria, viruses, parasites, or toxins.");
	}
}
