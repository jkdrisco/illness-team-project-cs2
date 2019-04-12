package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Sepsis extends Illness implements Comparable<Illness>{
	public int calc;
	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Sepsis(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
		calc = this.calculate(input);
	}
	
	@Override
	public int calculate(ArrayList<String> symptoms) {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("FEVER")) {
				possib += 32;
			}
			else if (symptoms.get(i).toUpperCase().matches("HIGH HEART RATE")) {
				possib += 28;
			}
			else if (symptoms.get(i).toUpperCase().matches("HIGH BLOOD PRESSURE")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("SWEATING")) {
				possib += 15;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getName() {
		return "Sepsis";
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for sepsis are fever, high heart rate, high blood pressure, and sweating.");
	}
	
	@Override
	public String getCalc() {
		return String.format("%d", calc);
	}
	
	@Override
	public String getDesc() {
		return String.format("Sepsis is a life threatening complication of an infection.");
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
