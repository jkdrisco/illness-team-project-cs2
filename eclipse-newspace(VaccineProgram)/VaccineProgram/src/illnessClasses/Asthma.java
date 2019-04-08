package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Asthma extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Asthma(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("WHEEZING")) {
				possib += 73;
			}
			else if (symptoms.get(i).toUpperCase().matches("COUGH")) {
				possib += 27;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for asthma are wheezing and cough.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Asthma is a condition in which a person's airways become inflamed, narrow and swell, and produce extra mucus, which makes it difficult to breathe.");
	}
}
