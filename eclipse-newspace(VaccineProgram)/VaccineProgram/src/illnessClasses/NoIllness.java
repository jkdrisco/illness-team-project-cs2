package illnessClasses;

import java.util.ArrayList;

import Illnesses.Illness;

public class NoIllness extends Illness implements Comparable<Illness>{
	public int calc;
	public NoIllness(ArrayList<String> input, int age) {
		super(input, age);
		calc = this.calculate(input);
		
	}

	@Override
	public int calculate(ArrayList<String> symptoms) {
		return 0;
	}
	
	@Override
	public String getName() {
		return "No illness";
	}
	
	@Override
	public String getSymptoms() {
		return "";
	}
	
	@Override
	public String getCalc() {
		return String.format("%d", calc);
	}
	
	@Override
	public String getDesc() {
		return "No other illnesses were calculated.";
	}
	
	@Override
	public int compareTo(Illness ill) {
		int compareCalc = ((Illness) ill).calc; 
		
		return this.calc - compareCalc;
	}
	
	@Override
	public String getRarity() {
		return "Very common";
	}
	
	@Override
	public int calcNum() {
		return calc;
	}
	
	@Override
	public int rarityNum() {
		return 1;
	}
}
