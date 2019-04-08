package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class StomachBug extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public StomachBug(ArrayList<String >input, int age) {
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
			else if (symptoms.get(i).toUpperCase().matches("ABDOMINAL CRAMPS AND PAIN")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("NAUSEA")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("VOMITING")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("HEADACHE")) {
				possib += (50/3);
			}
			else if (symptoms.get(i).toUpperCase().matches("FEVER")) {
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
		return String.format("The symptoms for stomach bug are diarrhea, abdominal cramps and pain, nausea, vomiting, headache, and fever.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Stomach bugs are an intestinal infection marked by diarrhea, cramps, nausea, vomiting, and fever.");
	}
}
