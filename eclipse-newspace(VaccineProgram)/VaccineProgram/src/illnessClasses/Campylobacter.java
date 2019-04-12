package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Campylobacter extends Illness implements Comparable<Illness>{
	public int calc;
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
		calc = this.calculate(input);
	}
	
	@Override
	public int calculate(ArrayList<String> symptoms) {
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
	public String getName() {
		return "Campylobacter";
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for campylobacter are abdominal cramps, diarrhea, and fever.");
	}
	
	@Override
	public String getCalc() {
		return String.format("%d", calc);
	}
	
	@Override
	public String getDesc() {
		return String.format("Campylobacter is among the common bacterial infections of humans, most commonly a foodborne illness.");
	}
	
	@Override
	public int compareTo(Illness ill) {
		int compareCalc = ((Illness) ill).calc; 
		
		return this.calc - compareCalc;
	}
	
	@Override
	public String getRarity() {
		return "Common";
	}
	
	@Override
	public int calcNum() {
		return calc;
	}
	
	@Override
	public int rarityNum() {
		return 0;
	}
}
