package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class CerebellarAtaxia extends Illness {
	public ArrayList<String> symptoms = new ArrayList<>();
	public int age;
	private double possib = 0;
	private double cap = 100;
	private int ageLow = 0;
	private int ageHigh = 16;
	
	public CerebellarAtaxia(ArrayList<String >input, int age) {
		super(input, age);
		symptoms = input;
		this.age = age;
	}
	
	@Override
	public int calculate() {
		for (int i = 0; i < symptoms.size(); i++) {
			if (symptoms.get(i).toUpperCase().matches("CONFUSION")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("NAUSEA")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("HEADACHES")) {
				possib += 25;
			}
			else if (symptoms.get(i).toUpperCase().matches("DIZZINESS")) {
				possib += 25;
			}
			else {
				cap += 10;
			}
		}
		return (int) (10 * (possib / cap));
	}
	
	@Override
	public String getSymptoms() {
		return String.format("The symptoms for cerebellar ataxia are confusion, nausea, headaches, and dizziness.");
	}
	
	@Override
	public String getDesc() {
		return String.format("Cerebellar ataxia is a form of ataxia originating in the cerebellum.");
	}
}
