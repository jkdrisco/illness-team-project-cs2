package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class AsepticMeningitis extends Illness implements Comparable<Illness>{
	public int calc;
	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public AsepticMeningitis(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
		calc = this.calculate(input);
	}
	
	@Override
	public int calculate(ArrayList<String> symptoms) {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("FEVER")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("CHILLS")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("STOMACHACHE")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("HEADACHE")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("BODY ACHE")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("LOSS OF APPETITE")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("VOMITING")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("FATIGUE")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("RED EYES")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("NAUSEA")) {
				possib += 10;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getName() {
		return "Aseptic meningitis";
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for aseptic meningitis are fever, chills, stomachache, headache, body ache, loss of appetite, vomiting, fatigue, red eyes, and nausea.");
	}
	
	@Override
	public String getCalc() {
		return String.format("%d", calc);
	}
	
	@Override
	public String getDesc() {
		return String.format("Aseptic meningitis is an inflammation of the brain and spinal cord membranes, typically caused by an infection.");
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
