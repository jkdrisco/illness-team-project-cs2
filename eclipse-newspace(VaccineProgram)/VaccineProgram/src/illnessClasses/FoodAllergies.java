package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class FoodAllergies extends Illness implements Comparable<Illness>{
	public int calc;
	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public FoodAllergies(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
		calc = this.calculate(input);
	}
	
	@Override
	public int calculate(ArrayList<String> symptoms) {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("DIARRHEA")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("ABDOMINAL CRAMPS AND PAIN")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("ITCHING OR SWELLING IN YOUR MOUTH")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("VOMITING")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("HIVES")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("LOW BLOOD PRESSURE")) {
				possib += (50/3);
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getName() {
		return "Food allergies";
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for food allergies are diarrhea, abdominal cramps and pain, itching or swelling in your mouth, vomiting, hives, and low blood pressure.");
	}
	
	@Override
	public String getCalc() {
		return String.format("%d", calc);
	}
	
	@Override
	public String getDesc() {
		return String.format("Food allergies are an unpleasant or dangerous immune system reaction after a certain food is eaten.");
	}
	
	@Override
	public int compareTo(Illness ill) {
		int compareCalc = ((Illness) ill).calc; 
		
		return this.calc - compareCalc;
	}
	
	@Override
	public String getRarity() {
		return "Very common";
	}
	
	@Override
	public int calcNum() {
		return calc;
	}
	
	@Override
	public int rarityNum() {
		return 1;
	}
}
