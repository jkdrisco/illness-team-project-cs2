package Illnesses;

import java.util.ArrayList;

import illnessClasses.Pneumonia;

public class ComboGUI {

	public static void main(String[] args) {
		ArrayList<String> symp = new ArrayList<>();
		symp.add("High temp");
		symp.add("Fatigue");
		Pneumonia pm = new Pneumonia(symp, 16);
		int rating = pm.calculate();
		System.out.printf("%d", rating);
	}

}
