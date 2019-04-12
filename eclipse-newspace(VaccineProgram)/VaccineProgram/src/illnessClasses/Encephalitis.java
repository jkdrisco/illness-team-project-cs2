package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Encephalitis extends Illness implements Comparable<Illness>{
	public int calc;
	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Encephalitis(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
		calc = this.calculate(input);
	}
	
	@Override
	public int calculate(ArrayList<String> symptoms) {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("SEVERE HEADACHE")) {
				possib += 26;
			}
			else if (symptoms.get(i).toUpperCase().matches("SUDDEN FEVER")) {
				possib += 26;
			}
			else if (symptoms.get(i).toUpperCase().matches("FATIGUE")) {
				possib += 9;
			}
			else if (symptoms.get(i).toUpperCase().matches("VOMITING")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("CONFUSION")) {
				possib += 9;
			}
			else if (symptoms.get(i).toUpperCase().matches("SEIZURES")) {
				possib += 20;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getName() {
		return "Encephalitis";
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for encephalitis are severe headache, sudden fever, fatigue, vomiting, confusion, and seizures.");
	}
	
	@Override
	public String getCalc() {
		return String.format("%d", calc);
	}
	
	@Override
	public String getDesc() {
		return String.format("Encephalitis is an inflmation of the brain, most commonly due to an infection.");
	}
	
	@Override
	public int compareTo(Illness ill) {
		int compareCalc = ((Illness) ill).calc; 
		
		return this.calc - compareCalc;
	}
	
	@Override
	public String getRarity() {
		return "Rare";
	}
	
	@Override
	public int calcNum() {
		return calc;
	}
	
	@Override
	public int rarityNum() {
		return 2;
	}
}
