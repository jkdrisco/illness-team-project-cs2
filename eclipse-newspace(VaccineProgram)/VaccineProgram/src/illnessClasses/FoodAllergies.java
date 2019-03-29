package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class FoodAllergies extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 4;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public FoodAllergies(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("RUNNY NOSE")) {
				possib++;
			}
			else {
				cap++;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for chickenpox are ");
	}
	
	@Override
	public String getDesc() {
		return String.format("Chickenpox is an illness that ");
	}
	
	@Override
	public String getAgeRange() {
		return String.format("The age range for chickenpox is %d to %d.%n", ageLow, ageHigh);
	}
}
