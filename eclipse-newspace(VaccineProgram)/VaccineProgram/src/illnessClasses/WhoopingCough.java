package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class WhoopingCough extends Illness implements Comparable<Illness>{
	public int calc;
	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public WhoopingCough(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
		calc = this.calculate(input);
	}
	
	@Override
	public int calculate(ArrayList<String> symptoms) {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("RUNNY NOSE")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("NASAL CONGESTION")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("RED EYES")) {
				possib += 15;
			}
			else if (symptoms.get(i).toUpperCase().matches("FEVER")) {
				possib += 5;
			}
			else if (symptoms.get(i).toUpperCase().matches("COUGH")) {
				possib += 60;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getName() {
		return "Whooping cough";
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for whooping cough are runny nose, nasal congestion, red eyes, fever, and cough.");
	}
	
	@Override
	public String getCalc() {
		return String.format("%d", calc);
	}
	
	@Override
	public String getDesc() {
		return String.format("Whooping cough is a highly contagious respiratory tract infection, most commonly marked by a severe hacking cough.");
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
