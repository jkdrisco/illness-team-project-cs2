package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Mumps extends Illness implements Comparable<Illness>{
	public int calc;
	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Mumps(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
		calc = this.calculate(input);
	}
	
	@Override
	public int calculate(ArrayList<String> symptoms) {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("FEVER")) {
				possib += 20;
			}
			else if (symptoms.get(i).toUpperCase().matches("HEADACHE")) {
				possib += 20;
			}
			else if (symptoms.get(i).toUpperCase().matches("MUSCLE ACHES")) {
				possib += 20;
			}
			else if (symptoms.get(i).toUpperCase().matches("TIREDNESS")) {
				possib += 20;
			}
			else if (symptoms.get(i).toUpperCase().matches("LOSS OF APPETITE")) {
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
		return "Mumps";
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for mumps are fever, headache, muscle aches, tiredness, and loss of appetite.");
	}
	
	@Override
	public String getCalc() {
		return String.format("%d", calc);
	}
	
	@Override
	public String getDesc() {
		return String.format("Mumps is a viral infection that affects the salivary glands that's easily preventable by a vaccine.");
	}
	
	@Override
	public int compareTo(Illness ill) {
		int compareCalc = ((Illness) ill).calc; 
		
		return this.calc - compareCalc;
	}
	
	@Override
	public String getRarity() {
		return "Very rare";
	}
	
	@Override
	public int calcNum() {
		return calc;
	}
	
	@Override
	public int rarityNum() {
		return 3;
	}
}
