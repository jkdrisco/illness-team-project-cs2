package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Rotavirus extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Rotavirus(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("DIARRHEA")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("HIGH TEMP")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("DRY MOUTH")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("VOMITING")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("DEHYDRATION")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("SLEEPINESS")) {
				possib += (50/3);
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for rotavirus are diarrhea, high temp, dry mouth, vomiting, dehydration, and sleepiness.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Rotaviruses are the most common cause of diarrhoeal disease among infants and young children.");
	}
}
