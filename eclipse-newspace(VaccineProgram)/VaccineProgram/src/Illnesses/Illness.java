package Illnesses;

import java.util.ArrayList;

public abstract class Illness{
	public ArrayList<String> symptoms= new ArrayList<>();
	public int age;
	
	public Illness(ArrayList<String> input, int age) {
		symptoms = input;
		this.age = age;
	}
	
	public abstract int calculate();
	public abstract String getSymptoms();
	public abstract String getDesc();
	public abstract String getAgeRange();
}
