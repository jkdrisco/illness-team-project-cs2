package Illnesses;

import java.util.ArrayList;

public abstract class Illness implements Comparable<Illness>{
	public int calc;
	public ArrayList<String> symptoms= new ArrayList<>();
	public int age;
	
	public Illness(ArrayList<String> input, int age) {
		symptoms = input;
		this.age = age;
	}
	
	public abstract int calculate(ArrayList<String> symptoms);
	public abstract String getName();
	public abstract String getSymptoms();
	public abstract String getCalc();
	public abstract String getDesc();
	public abstract String getRarity();
	public abstract int calcNum();
	public abstract int rarityNum();
	
	public abstract int compareTo(Illness ill);
}
