package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class AsepticMeningitis extends Illness {

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
	}
	
	@Override
	public int calculate() {
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
	public String getSymptoms() {
		return String.format("The symptoms for aseptic meningitis are fever, chills, stomachache, headache, body ache, loss of appetite, vomiting, fatigue, red eyes, and nausea.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Aseptic meningitis is an inflammation of the brain and spinal cord membranes, typically caused by an infection.");
	}
}
