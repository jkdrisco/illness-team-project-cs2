package illnessClasses;
import java.util.ArrayList;

import Illnesses.Illness;

public class Pneumonia extends Illness {
	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Pneumonia(ArrayList<String> input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("HIGH TEMP")) {
				possib += 16;
			}
			else if (symptoms.get(i).toUpperCase().matches("VOMITING")) {
				possib += 7;
			}
			else if (symptoms.get(i).toUpperCase().matches("HEADACHE")) {
				possib += 12;
			}
			else if (symptoms.get(i).toUpperCase().matches("FATIGUE")) {
				possib += 18;
			}
			else if (symptoms.get(i).toUpperCase().matches("CHILLS")) {
				possib += 16;
			}
			else if (symptoms.get(i).toUpperCase().matches("SWEATING")) {
				possib += 10;
			}
			else if (symptoms.get(i).toUpperCase().matches("NAUSEA")) {
				possib += 7;
			}
			else if (symptoms.get(i).toUpperCase().matches("SORE THROAT")) {
				possib += 7;
			}
			else if (symptoms.get(i).toUpperCase().matches("DIARRHEA")) {
				possib += 7;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for pneumonia are high temp, vomiting, headache, fatigue, chills, sweating, nausea, sore throat, and diarrhea.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Pneumonia is an infection that inflames the air sacs in one or both lungs.");
	}
}
