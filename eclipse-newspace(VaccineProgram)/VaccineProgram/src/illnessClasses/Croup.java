package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Croup extends Illness implements Comparable<Illness>{
	public int calc;
	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Croup(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
		calc = this.calculate(input);
	}
	
	@Override
	public int calculate(ArrayList<String> symptoms) {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("WHEEZING")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("DROOLING")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("VOICE LOSS")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("DIFFICULTY SWALLOWING")) {
				possib += 25;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getName() {
		return "Croup";
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for croup are wheezing, drooling, voice loss, and difficulty swallowing.");
	}
	
	@Override
	public String getCalc() {
		return String.format("%d", calc);
	}
	
	@Override
	public String getDesc() {
		return String.format("Croup is an upper airway infection that blocks breathing and has a distinctive barking cough.");
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
