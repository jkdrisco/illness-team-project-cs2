package application;

import illnessClasses.AsepticMeningitis;
import illnessClasses.Asthma;
import illnessClasses.Campylobacter;
import illnessClasses.CerebellarAtaxia;
import illnessClasses.Croup;
import illnessClasses.EColi;
import illnessClasses.Encephalitis;
import illnessClasses.FoodAllergies;
import illnessClasses.FoodPoisoning;
import illnessClasses.Measles;
import illnessClasses.Mumps;
import illnessClasses.NoIllness;
import illnessClasses.Pneumonia;
import illnessClasses.Rotavirus;
import illnessClasses.Salmonella;
import illnessClasses.Sepsis;
import illnessClasses.StomachBug;
import illnessClasses.Tonsillitis;
import illnessClasses.WhoopingCough;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.ResourceBundle;

import com.sun.glass.ui.Window.Level;

import Illnesses.Illness;
import Illnesses.IllnessComparable;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;


public class Main extends Application implements Initializable {
	private int NUM_SYMPTOMS = 27;
	private static int NUM_ILLNESSES = 18;

@FXML
Text test1;
@FXML
Button myButton;
@FXML
TextField myTF;
@FXML
Text myText;
@FXML 
Button homeButton;
   
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("GUI1.fxml"));
		Pane p = loader.load();
		        
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		myButton.setOnAction(new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent event) {
			Stage stage0 = (Stage) myButton.getScene().getWindow();
			String str = myTF.getText();
			ArrayList<String> arrStr = getSymptoms(str);
			Illness[] illnesses = getIllnesses(arrStr);
			Arrays.sort(illnesses, new IllnessComparable());
			Illness[] topFour = getTopFour(illnesses, arrStr);
			stage0.close();
			Main2 m2 = new Main2(topFour);
			//m2.setTest1(topFour[0].getName());
			//m2.show();
		}
		});
	}
	public void intiialize2(URL location, ResourceBundle resources) {
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public static ArrayList<String> getSymptoms(String str) {
		ArrayList<String> arrStr = new ArrayList<>();
		
		if (str.toUpperCase().matches(".*HIGH TEMPERATURE.*")) {
			arrStr.add("High temp");
		}
		if (str.toUpperCase().matches(".*VOMITING.*")) {
			arrStr.add("Vomiting");
		}
		if (str.toUpperCase().matches(".*HEADACHE.*")) {
			arrStr.add("Headache");
		}
		if (str.toUpperCase().matches(".*FATIGUE.*")) {
			arrStr.add("Fatigue");
		}
		if (str.toUpperCase().matches(".*EXCESSIVE SWEATING.*")) {
			arrStr.add("Excessive sweating");
		}
		if (str.toUpperCase().matches(".*NAUSEA.*")) {
			arrStr.add("Nausea");
		}
		if (str.toUpperCase().matches(".*SORE THROAT.*")) {
			arrStr.add("Sore throat");
		}
		if (str.toUpperCase().matches(".*DIARRHEA.*")) {
			arrStr.add("Diarrhea");
		}
		if (str.toUpperCase().matches(".*FEVER.*")) {
			arrStr.add("Fever");
		}
		if (str.toUpperCase().matches(".*HIGH HEART RATE.*")) {
			arrStr.add("High heart rate");
		}
		if (str.toUpperCase().matches(".*HIGH BLOOD PRESSURE.*")) {
			arrStr.add("High blood pressure");
		}
		if (str.toUpperCase().matches(".*CONFUSION.*")) {
			arrStr.add("Confusion");
		}
		if (str.toUpperCase().matches(".*SEIZURES.*")) {
			arrStr.add("Seizures");
		}
		if (str.toUpperCase().matches(".*DIZZINESS.*")) {
			arrStr.add("Dizziness");
		}
		if (str.toUpperCase().matches(".*STOMACHACHE.*")) {
			arrStr.add("Stomachache");
		}
		if (str.toUpperCase().matches(".*RED EYES.*")) {
			arrStr.add("Red eyes");
		}
		if (str.toUpperCase().matches(".*WHEEZING.*")) {
			arrStr.add("Wheezing");
		}
		if (str.toUpperCase().matches(".*DROOLING.*")) {
			arrStr.add("Drooling");
		}
		if (str.toUpperCase().matches(".*VOICE LOSS.*")) {
			arrStr.add("Voice loss");
		}
		if (str.toUpperCase().matches(".*DIFFICULTIES SWALLOWING.*")) {
			arrStr.add("Difficulty swallowing");
		}
		if (str.toUpperCase().matches(".*RUNNY NOSE.*")) {
			arrStr.add("Runny nose");
		}
		if (str.toUpperCase().matches(".*NASAL CONGESTION.*")) {
			arrStr.add("Nasal congestion");
		}
		if (str.toUpperCase().matches(".*ABDOMINAL PAIN.*")) {
			arrStr.add("Abdominal cramps and pain");
		}
		if (str.toUpperCase().matches(".*HIVES.*")) {
			arrStr.add("Hives");
		}
		if (str.toUpperCase().matches(".*LOW BLOOD PRESSURE.*")) {
			arrStr.add("Low blood pressure");
		}
		if (str.toUpperCase().matches(".*BAD BREATH.*")) {
			arrStr.add("Bad breath");
		}
		if (str.toUpperCase().matches(".*CHILLS.*")) {
			arrStr.add("Chills");
		}
		if (str.toUpperCase().matches(".*COUGH.*")) {
			arrStr.add("Cough");
		}
		if (str.toUpperCase().matches(".*BODY ACHE.*")) {
			arrStr.add("Body ache");
		}
		if (str.toUpperCase().matches(".*LOSS OF APPETITE.*")) {
			arrStr.add("Loss of appetite");
		}
		return arrStr;
	}
	
	public static Illness[] getIllnesses(ArrayList<String> arrStr) {
		ArrayList<Illness> arrList = new ArrayList<>();
		int[] init = new int[NUM_ILLNESSES];
		for (int i = 0; i < init.length; i++) {
			init[i] = 0;
		}
		/*
		 * Each index in init is assigned to a certain illness.
		 * Aseptic = 0
		 * Asthma = 1
		 * Campylobacter = 2
		 * Cerebellar = 3
		 * Croup = 4
		 * Ecoli = 5
		 * Encephalitis = 6
		 * Food All = 7
		 * Food Poi = 8
		 * Measles = 9
		 * Mumps = 10
		 * Pneumonia = 11
		 * Rotavirus = 12
		 * Salmonella = 13
		 * Sepsis = 14
		 * Stomach Bug = 15
		 * Tonsillitis = 16
		 * Whooping = 17
		 */
		if (arrStr.contains("High temp")) {
			init[5]++;
			init[11]++;
			init[12]++;
		}
		if (arrStr.contains("Vomiting")) {
			init[0]++;
			init[6]++;
			init[7]++;
			init[8]++;
			init[11]++;
			init[12]++;
			init[15]++;
		}
		if (arrStr.contains("Headache")) {
			init[0]++;
			init[3]++;
			init[6]++;
			init[10]++;
			init[11]++;
			init[15]++;
			init[16]++;
		}
		if (arrStr.contains("Fatigue")) {
			init[0]++;
			init[6]++;
			init[11]++;
		}
		if (arrStr.contains("Excessive sweating")) {
			init[11]++;
			init[14]++;
		}
		if (arrStr.contains("Nausea")) {
			init[0]++;
			init[3]++;
			init[8]++;
			init[11]++;
			init[15]++;
			init[16]++;
		}
		if (arrStr.contains("Sore throat")) {
			init[11]++;
			init[16]++;
		}
		if (arrStr.contains("Diarrhea")) {
			init[2]++;
			init[5]++;
			init[7]++;
			init[8]++;
			init[11]++;
			init[12]++;
			init[13]++;
			init[15]++;
		}
		if (arrStr.contains("Fever")) {
			init[0]++;
			init[2]++;
			init[6]++;
			init[8]++;
			init[9]++;
			init[10]++;
			init[13]++;
			init[14]++;
			init[15]++;
			init[16]++;
			init[17]++;
		}
		if (arrStr.contains("High heart rate")) {
			init[14]++;
		}
		if (arrStr.contains("High blood pressure")) {
			init[14]++;
		}
		if (arrStr.contains("Confusion")) {
			init[3]++;
			init[6]++;
			init[16]++;
		}
		if (arrStr.contains("Seizures")) {
			init[6]++;
		}
		if (arrStr.contains("Dizziness")) {
			init[3]++;
		}
		if (arrStr.contains("Stomachache")) {
			init[0]++;
			init[8]++;
			init[16]++;
		}
		if (arrStr.contains("Red eyes")) {
			init[0]++;
			init[9]++;
			init[17]++;
		}
		if (arrStr.contains("Wheezing")) {
			init[1]++;
			init[4]++;
		}
		if (arrStr.contains("Drooling")) {
			init[4]++;
			init[16]++;
		}
		if (arrStr.contains("Voice loss")) {
			init[4]++;
		}
		if (arrStr.contains("Difficulty swallowing")) {
			init[4]++;
		}
		if (arrStr.contains("Runny nose")) {
			init[9]++;
		}
		if (arrStr.contains("Nasal congestion")) {
			init[17]++;
		}
		if (arrStr.contains("Abdominal cramps and pain")) {
			init[2]++;
			init[7]++;
			init[8]++;
			init[15]++;
		}
		if (arrStr.contains("Hives")) {
			init[7]++;
		}
		if (arrStr.contains("Low blood pressure")) {
			init[7]++;
		}
		if (arrStr.contains("Bad breath")) {
			init[16]++;
		}
		if (arrStr.contains("Chills")) {
			init[0]++;
			init[11]++;
			init[13]++;
		}
		if (arrStr.contains("Cough")) {
			init[1]++;
			init[9]++;
			init[17]++;
		}
		if (arrStr.contains("Body ache")) {
			init[0]++;
		}
		if (arrStr.contains("Loss of appetite")) {
			init[10]++;
		}
		/*
		 * Initializes all illnesses which had a symptom of their's pop up
		 */
		if (init[0] >= 1) {
			AsepticMeningitis aseptic = new AsepticMeningitis(arrStr, 10);
			arrList.add(aseptic);
		}
		if (init[1] >= 1) {
			Asthma asthma = new Asthma(arrStr, 10);
			arrList.add(asthma);
		}
		if (init[2] >= 1) {
			Campylobacter campy = new Campylobacter(arrStr, 10);
			arrList.add(campy);
		}
		if (init[3] >= 1) {
			CerebellarAtaxia cereb = new CerebellarAtaxia(arrStr, 10);
			arrList.add(cereb);
		}
		if (init[4] >= 1) {
			Croup croup = new Croup(arrStr, 10);
			arrList.add(croup);
		}
		if (init[5] >= 1) {
			EColi ecoli = new EColi(arrStr, 10);
			arrList.add(ecoli);
		}
		if (init[6] >= 1) {
			Encephalitis encephalitis = new Encephalitis(arrStr, 10);
			arrList.add(encephalitis);
		}
		if (init[7] >= 1) {
			FoodAllergies foodAll = new FoodAllergies(arrStr, 10);
			arrList.add(foodAll);
		}
		if (init[8] >= 1) {
			FoodPoisoning foodPois = new FoodPoisoning(arrStr, 10);
			arrList.add(foodPois);
		}
		if (init[9] >= 1) {
			Measles measles = new Measles(arrStr, 10);
			arrList.add(measles);
		}
		if (init[10] >= 1) {
			Mumps mumps = new Mumps(arrStr, 10);
			arrList.add(mumps);
		}
		if (init[11] >= 1) {
			Pneumonia pneumonia = new Pneumonia(arrStr, 10);
			arrList.add(pneumonia);
		}
		if (init[12] >= 1) {
			Rotavirus rotavirus = new Rotavirus(arrStr, 10);
			arrList.add(rotavirus);
		}
		if (init[13] >= 1) {
			Salmonella salmonella = new Salmonella(arrStr, 10);
			arrList.add(salmonella);
		}
		if (init[14] >= 1) {
			Sepsis sepsis = new Sepsis(arrStr, 10);
			arrList.add(sepsis);
		}
		if (init[15] >= 1) {
			StomachBug stomachBug = new StomachBug(arrStr, 10);
			arrList.add(stomachBug);
		}
		if (init[16] >= 1) {
			Tonsillitis tonsillitis = new Tonsillitis(arrStr, 10);
			arrList.add(tonsillitis);
		}
		if (init[17] >= 1) {
			WhoopingCough whoopingCough = new WhoopingCough(arrStr, 10);
			arrList.add(whoopingCough);
		}
		
		Illness[] initIllnesses = new Illness[arrList.size()];
		
		for (int i = 0; i < initIllnesses.length; i++) {
			initIllnesses[i] = arrList.get(i);
		}
		
		return initIllnesses;
	}
	
	public static Illness[] getTopFour(Illness[] original, ArrayList<String> arrStr) {
		Illness[] topFour;
		Illness[] filler = new Illness[4];
		
		NoIllness ni1 = new NoIllness(arrStr, 10);
		NoIllness ni2 = new NoIllness(arrStr, 10);
		NoIllness ni3 = new NoIllness(arrStr, 10);
		NoIllness ni4 = new NoIllness(arrStr, 10);
		
		filler[0] = ni1;
		filler[1] = ni2;
		filler[2] = ni3;
		filler[3] = ni4;
		 
		
		
		if (original.length < 4) {
			int i;
			int start = 4 - (4 - original.length);
			topFour = new Illness[4];
			for (i = 0; i < original.length; i++) {
				topFour[i] = original[i];
			}
			for (int j = start; j < 4; j++) {
				topFour[j] = filler[j];
			}
		}
		else {
			topFour = new Illness[4];
			for (int i = 0; i < 4; i++) {
				topFour[i] = original[i];
			}
		}
		
		return topFour;
	}

}