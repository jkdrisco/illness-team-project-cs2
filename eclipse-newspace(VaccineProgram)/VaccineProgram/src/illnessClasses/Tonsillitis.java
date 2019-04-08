package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class Tonsillitis extends Illness {

	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public Tonsillitis(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("SORE THROAT")) {
				possib += 12.5;
			}
			else if (symptoms.get(i).toUpperCase().matches("FEVER")) {
				possib += 12.5;
			}
			else if (symptoms.get(i).toUpperCase().matches("BAD BREATH")) {
				possib += 12.5;
			}
			else if (symptoms.get(i).toUpperCase().matches("STOMACHACHE")) {
				possib += 12.5;
			}
			else if (symptoms.get(i).toUpperCase().matches("HEADACHE")) {
				possib += 12.5;
			}
			else if (symptoms.get(i).toUpperCase().matches("DROOLING")) {
				possib += 12.5;
			}
			else if (symptoms.get(i).toUpperCase().matches("NAUSEA")) {
				possib += 12.5;
			}
			else if (symptoms.get(i).toUpperCase().matches("CONFUSION")) {
				possib += 12.5;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for tonsillitis are sore throat, fever, bad breath, stomachache, headache, drooling, nausea, and confusion.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Tonsillitis is an inflammation of the two oval-shaped pads of tissue at the back of the throat.");
	}
}
