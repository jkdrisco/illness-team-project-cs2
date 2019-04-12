package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Asthma extends Illness implements Comparable<Illness>{
	public int calc;
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
		calc = this.calculate(input);
	}
	
	@Override
	public int calculate(ArrayList<String> symptoms) {
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
	public String getName() {
		return "Asthma";
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for asthma are wheezing and cough.");
	}
	
	@Override
	public String getCalc() {
		return String.format("%d", calc);
	}
	
	@Override
	public String getDesc() {
		return String.format("Asthma is a condition in which a person's airways become inflamed, narrow and swell, and produce extra mucus, which makes it difficult to breathe.");
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
