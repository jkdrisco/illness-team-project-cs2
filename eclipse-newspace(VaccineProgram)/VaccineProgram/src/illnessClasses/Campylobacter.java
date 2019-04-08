package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Campylobacter extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Campylobacter(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("ABDOMINAL CRAMPS")) {
				possib += (100/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("DIARRHEA")) {
				possib += (100/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("FEVER")) {
				possib += (100/3);
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for campylobacter are abdominal cramps, diarrhea, and fever.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Campylobacter is among the common bacterial infections of humans, most commonly a foodborne illness.");
	}
}
