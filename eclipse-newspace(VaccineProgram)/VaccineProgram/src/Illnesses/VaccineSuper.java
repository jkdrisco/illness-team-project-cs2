package Illnesses;
import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections;

class VaccineSuper{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("How many symptomes do you have?: ");
		int numberOfSym = sc.nextInt();
		System.out.printf("Please enter symptoms:%n");
	
		//Symptoms
		double jointPain = 0; double soreThroat = 0; double inflammation = 0;
		double redSkin = 0; double headAche = 0; double runnyNose = 0;
		double aches = 0; double cough = 0; double highTemp = 0;
		double chestpain = 0; double wheezing = 0; double fatigue = 0;
		double nausea = 0; double swollenGums = 0; double dehydration = 0;
		double vomit = 0; double diarrhea = 0; double chestPain = 0;
		double shortnessOfBreath = 0; double anxiety = 0; double obsessiveBehavior = 0; 
		double sweating = 0; double lossOfAppetite = 0; double rapidHeartbeat = 0;
	
		String[] wordArray = new String[numberOfSym + 1];
		
		//records the symptoms to an array
		//the array starts from wordArray[1] instead of wordArray[0]
		for(int i = 0; i < numberOfSym + 1; i++) {
			wordArray[i] = sc.nextLine();
			
			if(wordArray[i].matches(".*joint pain.*") || wordArray[i].matches(".*Joint pain.*")) {
				jointPain++;
			}
			if(wordArray[i].matches(".*sore throat.*") || wordArray[i].matches(".*Soar throat.*")) {
				soreThroat++;
			}
			if(wordArray[i].matches(".*inflammation.*") || wordArray[i].matches(".*Inflammation.*")) {
				inflammation++;
			}
			if(wordArray[i].matches(".*red skin.*") || wordArray[i].matches(".*Red skin.*")) {
				redSkin++;
			}
			if(wordArray[i].matches(".*headache.*") || wordArray[i].matches(".*Headache.*")) {
				headAche++;
			}
			if(wordArray[i].matches(".*runny nose.*") || wordArray[i].matches(".*Runny nose.*")) {
				runnyNose++;
			}
			if(wordArray[i].matches(".*aches.*") || wordArray[i].matches(".*Aches.*")) {
				aches++;
			}
			if(wordArray[i].matches(".*cough.*") || wordArray[i].matches(".*Cough.*")) {
				cough++;
			}
			if(wordArray[i].matches(".*high temperature.*") || wordArray[i].matches(".*High temperature.*")) {
				highTemp++;
			}
			if(wordArray[i].matches(".*chest pain.*") || wordArray[i].matches(".*Chest pain.*")) {
				chestPain++;
			}
			if(wordArray[i].matches(".*wheezing.*") || wordArray[i].matches(".*Wheezing.*")) {
				wheezing++;
			}
			if(wordArray[i].matches(".*fatigue.*") || wordArray[i].matches(".*Fatigue.*")) {
				fatigue++;
			}
			if(wordArray[i].matches(".*nausea.*") || wordArray[i].matches(".*Nausea.*")) {
				nausea++;
			}
			if(wordArray[i].matches(".*swollen gums.*") || wordArray[i].matches(".*Swollen gums.*")) {
				swollenGums++;
			}
			if(wordArray[i].matches(".*dehydration.*") || wordArray[i].matches(".*Dehyration.*")) {
				dehydration++;
			}
			if(wordArray[i].matches(".*joint pain.*") || wordArray[i].matches(".*Joint pain.*")) {
				jointPain++;
			}
			if(wordArray[i].matches(".*vomit.*") || wordArray[i].matches(".*Vomit.*")) {
				vomit++;
			}
			if(wordArray[i].matches(".*diarrhea.*") || wordArray[i].matches(".*Diarrhea.*")) {
				diarrhea++;
			}
			if(wordArray[i].matches(".*chest pain.*") || wordArray[i].matches(".*Chest pain.*")) {
				chestPain++;
			}
			if(wordArray[i].matches(".*shortness of breath.*") || wordArray[i].matches(".*Shortness of breath.*")) {
				shortnessOfBreath++;
			}
			if(wordArray[i].matches(".*anxiety.*") || wordArray[i].matches(".*Anxiety.*")) {
				anxiety++;
			}
			if(wordArray[i].matches(".*obssesive behavior.*") || wordArray[i].matches(".*Obssesive behavior.*")) {
				obsessiveBehavior++;
			}
			if(wordArray[i].matches(".*sweating.*") || wordArray[i].matches(".*Sweating.*")) {
				sweating++;
			}
			if(wordArray[i].matches(".*loss of appetite.*") || wordArray[i].matches(".*Loss of appetite.*")) {
				lossOfAppetite++;
			}
			if(wordArray[i].matches(".*rapid heartbeat.*") || wordArray[i].matches(".*Rapid heartbeat.*")) {
				rapidHeartbeat++;
			}
			
		}

		double bronchitis = bronchitis( jointPain, soreThroat,  inflammation,  redSkin,
				 headAche,  runnyNose,  aches,  cough, highTemp,  chestpain,  wheezing, fatigue,  
				 nausea,  swollenGums, dehydration,  vomit,  diarrhea,  chestPain, shortnessOfBreath, 
				 anxiety,  obsessiveBehavior, sweating,  lossOfAppetite,  rapidHeartbeat, (double)numberOfSym);
		
		double arthritis = arthritis( jointPain, soreThroat,  inflammation,  redSkin,
				 headAche,  runnyNose,  aches,  cough, highTemp,  chestpain,  wheezing, fatigue,  
				 nausea,  swollenGums, dehydration,  vomit,  diarrhea,  chestPain, shortnessOfBreath, 
				 anxiety,  obsessiveBehavior, sweating,  lossOfAppetite,  rapidHeartbeat, (double)numberOfSym);
		
		double chestInfection = chestInfection( jointPain, soreThroat,  inflammation,  redSkin,
				 headAche,  runnyNose,  aches,  cough, highTemp,  chestpain,  wheezing, fatigue,  
				 nausea,  swollenGums, dehydration,  vomit,  diarrhea,  chestPain, shortnessOfBreath, 
				 anxiety,  obsessiveBehavior, sweating,  lossOfAppetite,  rapidHeartbeat, (double)numberOfSym);
		
		double pneumonia = pneumonia( jointPain, soreThroat,  inflammation,  redSkin,
				 headAche,  runnyNose,  aches,  cough, highTemp,  chestpain,  wheezing, fatigue,  
				 nausea,  swollenGums, dehydration,  vomit,  diarrhea,  chestPain, shortnessOfBreath, 
				 anxiety,  obsessiveBehavior, sweating,  lossOfAppetite,  rapidHeartbeat, (double)numberOfSym);
		
		double coldSores = coldSores( jointPain, soreThroat,  inflammation,  redSkin,
				 headAche,  runnyNose,  aches,  cough, highTemp,  chestpain,  wheezing, fatigue,  
				 nausea,  swollenGums, dehydration,  vomit,  diarrhea,  chestPain, shortnessOfBreath, 
				 anxiety,  obsessiveBehavior, sweating,  lossOfAppetite,  rapidHeartbeat, (double)numberOfSym);
		
		double flu = flu( jointPain, soreThroat,  inflammation,  redSkin,
				 headAche,  runnyNose,  aches,  cough, highTemp,  chestpain,  wheezing, fatigue,  
				 nausea,  swollenGums, dehydration,  vomit,  diarrhea,  chestPain, shortnessOfBreath, 
				 anxiety,  obsessiveBehavior, sweating,  lossOfAppetite,  rapidHeartbeat, (double)numberOfSym);
		
		double foodPoisoning = foodPoisoning( jointPain, soreThroat,  inflammation,  redSkin,
				 headAche,  runnyNose,  aches,  cough, highTemp,  chestpain,  wheezing, fatigue,  
				 nausea,  swollenGums, dehydration,  vomit,  diarrhea,  chestPain, shortnessOfBreath, 
				 anxiety,  obsessiveBehavior, sweating,  lossOfAppetite,  rapidHeartbeat, (double)numberOfSym);
		
		double mesothelioma = mesothelioma( jointPain, soreThroat,  inflammation,  redSkin,
				 headAche,  runnyNose,  aches,  cough, highTemp,  chestpain,  wheezing, fatigue,  
				 nausea,  swollenGums, dehydration,  vomit,  diarrhea,  chestPain, shortnessOfBreath, 
				 anxiety,  obsessiveBehavior, sweating,  lossOfAppetite,  rapidHeartbeat, (double)numberOfSym);
		
		System.out.printf("Bronchitis is %.2f accurate%n", bronchitis);
		System.out.printf("Arthritis is %.2f accurate%n", arthritis);
		System.out.printf("Chest infection is %.2f accurate%n", chestInfection);
		System.out.printf("Pneumonia infection is %.2f accurate%n", pneumonia);
		System.out.printf("Cold sores is %.2f accurate%n", coldSores);
		System.out.printf("Flu is %.2f accurate%n", flu);
		System.out.printf("Food poioning is %.2f accurate%n", foodPoisoning);
		System.out.printf("Mesothelioma is %.2f accurate%n", mesothelioma);

	} 

	//Bronchitis method
	static double bronchitis(double jointPain,
		double soreThroat, double inflammation, double redSkin,
		double headAche, double runnyNose, double aches, double cough,
		double highTemp, double chestpain, double wheezing,
		double fatigue, double nausea, double swollenGums,
		double dehydration, double vomit, double diarrhea, double chestPain,
		double shortnessOfBreath, double anxiety, double obsessiveBehavior,
		double sweating, double lossOfAppetite, double rapidHeartbeat, double numberOfSym) {
		
		double bronchitisAcc = 0.0;
		double brochititsCapacity = 4.0;
			if(soreThroat >=1 ) {
				bronchitisAcc++;}
			if(headAche >=1 ) {
				bronchitisAcc++;}
			if(runnyNose >=1) {
				bronchitisAcc++;}
			if(jointPain >=1) {
				brochititsCapacity++;}
			if(redSkin >=1) {
				brochititsCapacity++;}
			if(inflammation >=1) {
				brochititsCapacity++;}
			if(aches >=1) {
				bronchitisAcc++;}
			if(cough >=1) {
				brochititsCapacity++;}
			if(highTemp >=1) {
				brochititsCapacity++;}
			if(chestpain >=1) {
				brochititsCapacity++;}
			if(wheezing >=1) {
				brochititsCapacity++;}
			if(fatigue >=1) {
				brochititsCapacity++;}
			if(nausea >=1) {
				brochititsCapacity++;}
			if(swollenGums >=1) {
				brochititsCapacity++;}
			if(dehydration >=1) {
				brochititsCapacity++;}
			if(vomit >=1) {
				brochititsCapacity++;}
			if(diarrhea >=1) {
				brochititsCapacity++;}
			if(chestPain >=1) {
				brochititsCapacity++;}
			if(shortnessOfBreath >=1) {
				brochititsCapacity++;}
			if(anxiety >=1) {
				brochititsCapacity++;}
			if(obsessiveBehavior >=1) {
				brochititsCapacity++;}
			if(sweating >=1) {
				brochititsCapacity++;}
			if(lossOfAppetite >=1) {
				brochititsCapacity++;}
			if(rapidHeartbeat >=1) {
				brochititsCapacity++;
				}
		return percentage(bronchitisAcc, brochititsCapacity);
	}
	//Arthritis method
	static double arthritis(double jointPain,
		double soreThroat, double inflammation, double redSkin,
		double headAche, double runnyNose, double aches, double cough,
		double highTemp, double chestpain, double wheezing, double fatigue, double nausea, double swollenGums,
		double dehydration, double vomit, double diarrhea, double chestPain,
		double shortnessOfBreath, double anxiety, double obsessiveBehavior,
		double sweating, double lossOfAppetite, double rapidHeartbeat, double numberOfSym) {
			
		double Acc = 0.0;
		double Capacity = 3.0;
			if(soreThroat >=1 ) {
				Capacity++;}
			if(headAche >=1 ) {
				Capacity++;}
			if(runnyNose >=1) {
				Capacity++;}
			if(jointPain >=1) {
				Acc++;}
			if(redSkin >=1) {
				Acc++;}
			if(inflammation >=1) {
				Acc++;}
			if(aches >=1) {
				Capacity++;}
			if(cough >=1) {
				Capacity++;}
			if(highTemp >=1) {
				Capacity++;}
			if(chestpain >=1) {
				Capacity++;}
			if(wheezing >=1) {
				Capacity++;}
			if(fatigue >=1) {
				Capacity++;}
			if(nausea >=1) {
				Capacity++;}
			if(swollenGums >=1) {
				Capacity++;}
			if(dehydration >=1) {
				Capacity++;}
			if(vomit >=1) {
				Capacity++;}
			if(diarrhea >=1) {
				Capacity++;}
			if(chestPain >=1) {
				Capacity++;}
			if(shortnessOfBreath >=1) {
				Capacity++;}
			if(anxiety >=1) {
				Capacity++;}
			if(obsessiveBehavior >=1) {
				Capacity++;}
			if(sweating >=1) {
				Capacity++;}
			if(lossOfAppetite >=1) {
				Capacity++;}
			if(rapidHeartbeat >=1) {
				Capacity++;
				}
		return percentage(Acc, Capacity);
		}
	//Chest infection method
	static double chestInfection(double jointPain,
		double soreThroat, double inflammation, double redSkin,
		double headAche, double runnyNose, double aches, double cough,
		double highTemp, double chestpain, double wheezing,
		double fatigue, double nausea, double swollenGums,
		double dehydration, double vomit, double diarrhea, double chestPain,
		double shortnessOfBreath, double anxiety, double obsessiveBehavior,
		double sweating, double lossOfAppetite, double rapidHeartbeat, double numberOfSym) {
					
		double Acc = 0.0;
		double Capacity = 4.0;
			if(soreThroat >=1 ) {
				Capacity++;}
			if(headAche >=1 ) {
				Capacity++;}
			if(runnyNose >=1) {
				Capacity++;}
			if(jointPain >=1) {
				Capacity++;}
			if(redSkin >=1) {
				Capacity++;}
			if(inflammation >=1) {
				Capacity++;}
			if(aches >=1) {
				Capacity++;}
			if(cough >=1) {
				Acc++;}
			if(highTemp >=1) {
				Acc++;}
			if(chestpain >=1) {
				Acc++;}
			if(wheezing >=1) {
				Acc++;}
			if(fatigue >=1) {
				Capacity++;}
			if(nausea >=1) {
				Capacity++;}
			if(swollenGums >=1) {
				Capacity++;}
			if(dehydration >=1) {
				Capacity++;}
			if(vomit >=1) {
				Capacity++;}
			if(diarrhea >=1) {
				Capacity++;}
			if(chestPain >=1) {
				Capacity++;}
			if(shortnessOfBreath >=1) {
				Capacity++;}
			if(anxiety >=1) {
				Capacity++;}
			if(obsessiveBehavior >=1) {
				Capacity++;}
			if(sweating >=1) {
				Capacity++;}
			if(lossOfAppetite >=1) {
				Capacity++;}
			if(rapidHeartbeat >=1) {
				Capacity++;
				}
			
		return percentage(Acc, Capacity);
		}
	//Pneumonia method
	static double pneumonia(double jointPain,
		double soreThroat, double inflammation, double redSkin,
		double headAche, double runnyNose, double aches, double cough,
		double highTemp, double chestpain, double wheezing, double fatigue, double nausea, double swollenGums,
		double dehydration, double vomit, double diarrhea, double chestPain,
		double shortnessOfBreath, double anxiety, double obsessiveBehavior,
		double sweating, double lossOfAppetite, double rapidHeartbeat, double numberOfSym) {
						
		double Acc = 0.0;
		double Capacity = 4.0;
			if(soreThroat >=1 ) {
				Capacity++;}
			if(headAche >=1 ) {
				Acc++;}
			if(runnyNose >=1) {
				Capacity++;}
			if(jointPain >=1) {
				Capacity++;}
			if(redSkin >=1) {
				Capacity++;}
			if(inflammation >=1) {
				Capacity++;}
			if(aches >=1) {
				Capacity++;}
			if(cough >=1) {
				Acc++;}
			if(highTemp >=1) {
				Capacity++;}
			if(chestpain >=1) {
				Capacity++;}
			if(wheezing >=1) {
				Capacity++;}
			if(fatigue >=1) {
				Acc++;}
			if(nausea >=1) {
				Acc++;}
			if(swollenGums >=1) {
				Capacity++;}
			if(dehydration >=1) {
				Capacity++;}
			if(vomit >=1) {
				Capacity++;}
			if(diarrhea >=1) {
				Capacity++;}
			if(chestPain >=1) {
				Capacity++;}
			if(shortnessOfBreath >=1) {
				Capacity++;}
			if(anxiety >=1) {
				Capacity++;}
			if(obsessiveBehavior >=1) {
				Capacity++;}
			if(sweating >=1) {
				Capacity++;}
			if(lossOfAppetite >=1) {
				Capacity++;}
			if(rapidHeartbeat >=1) {
				Capacity++;
					}
		return percentage(Acc, Capacity);
		}
	static double coldSores(double jointPain,
		double soreThroat, double inflammation, double redSkin,
		double headAche, double runnyNose, double aches, double cough,
		double highTemp, double chestpain, double wheezing, double fatigue, double nausea, double swollenGums,
		double dehydration, double vomit, double diarrhea, double chestPain,
		double shortnessOfBreath, double anxiety, double obsessiveBehavior,
		double sweating, double lossOfAppetite, double rapidHeartbeat, double numberOfSym) {
							
		double Acc = 0.0;
		double Capacity = 4.0;
			if(soreThroat >=1 ) {
				Acc++;}
			if(headAche >=1 ) {
				Capacity ++;}
			if(runnyNose >=1) {
				Capacity++;}
			if(jointPain >=1) {
				Capacity++;}
			if(redSkin >=1) {
				Capacity++;}
			if(inflammation >=1) {
				Capacity++;}
			if(aches >=1) {
				Capacity++;}
			if(cough >=1) {
				Capacity++;}
			if(highTemp >=1) {
				Acc++;}
			if(chestpain >=1) {
				Capacity++;}
			if(wheezing >=1) {
				Capacity++;}
			if(fatigue >=1) {
				Capacity++;}
			if(nausea >=1) {
				Capacity++;}
			if(swollenGums >=1) {
				Acc++;}
			if(dehydration >=1) {
				Acc++;}
			if(vomit >=1) {
				Capacity++;}
			if(diarrhea >=1) {
				Capacity++;}
			if(chestPain >=1) {
				Capacity++;}
			if(shortnessOfBreath >=1) {
				Capacity++;}
			if(anxiety >=1) {
				Capacity++;}
			if(obsessiveBehavior >=1) {
				Capacity++;}
			if(sweating >=1) {
				Capacity++;}
			if(lossOfAppetite >=1) {
				Capacity++;}
			if(rapidHeartbeat >=1) {
				Capacity++;
						}
		return percentage(Acc, Capacity);
		}
	static double flu(double jointPain,
			double soreThroat, double inflammation, double redSkin,
			double headAche, double runnyNose, double aches, double cough,
			double highTemp, double chestpain, double wheezing, double fatigue, double nausea, double swollenGums,
			double dehydration, double vomit, double diarrhea, double chestPain,
			double shortnessOfBreath, double anxiety, double obsessiveBehavior,
			double sweating, double lossOfAppetite, double rapidHeartbeat, double numberOfSym) {
								
			double Acc = 0.0;
			double Capacity = 4.0;
				if(soreThroat >=1 ) {
					Capacity++;}
				if(headAche >=1 ) {
					Acc ++;}
				if(runnyNose >=1) {
					Capacity++;}
				if(jointPain >=1) {
					Capacity++;}
				if(redSkin >=1) {
					Capacity++;}
				if(inflammation >=1) {
					Capacity++;}
				if(aches >=1) {
					Capacity++;}
				if(cough >=1) {
					Acc++;}
				if(highTemp >=1) {
					Acc++;}
				if(chestpain >=1) {
					Capacity++;}
				if(wheezing >=1) {
					Capacity++;}
				if(fatigue >=1) {
					Acc++;}
				if(nausea >=1) {
					Capacity++;}
				if(swollenGums >=1) {
					Capacity++;}
				if(dehydration >=1) {
					Capacity++;}
				if(vomit >=1) {
					Capacity++;}
				if(diarrhea >=1) {
					Capacity++;}
				if(chestPain >=1) {
					Capacity++;}
				if(shortnessOfBreath >=1) {
					Capacity++;}
				if(anxiety >=1) {
					Capacity++;}
				if(obsessiveBehavior >=1) {
					Capacity++;}
				if(sweating >=1) {
					Capacity++;}
				if(lossOfAppetite >=1) {
					Capacity++;}
				if(rapidHeartbeat >=1) {
					Capacity++;
							}
			return percentage(Acc, Capacity);
			}
	static double foodPoisoning(double jointPain,
			double soreThroat, double inflammation, double redSkin,
			double headAche, double runnyNose, double aches, double cough,
			double highTemp, double chestpain, double wheezing, double fatigue, double nausea, double swollenGums,
			double dehydration, double vomit, double diarrhea, double chestPain,
			double shortnessOfBreath, double anxiety, double obsessiveBehavior,
			double sweating, double lossOfAppetite, double rapidHeartbeat, double numberOfSym) {
								
			double Acc = 0.0;
			double Capacity = 4.0;
				if(soreThroat >=1 ) {
					Capacity++;}
				if(headAche >=1 ) {
					Capacity++;}
				if(runnyNose >=1) {
					Capacity++;}
				if(jointPain >=1) {
					Capacity++;}
				if(redSkin >=1) {
					Capacity++;}
				if(inflammation >=1) {
					Capacity++;}
				if(aches >=1) {
					Capacity++;}
				if(cough >=1) {
					Capacity++;}
				if(highTemp >=1) {
					Capacity++;}
				if(chestpain >=1) {
					Capacity++;}
				if(wheezing >=1) {
					Capacity++;}
				if(fatigue >=1) {
					Acc++;}
				if(nausea >=1) {
					Acc++;}
				if(swollenGums >=1) {
					Capacity++;}
				if(dehydration >=1) {
					Capacity++;}
				if(vomit >=1) {
					Acc++;}
				if(diarrhea >=1) {
					Acc++;}
				if(chestPain >=1) {
					Capacity++;}
				if(shortnessOfBreath >=1) {
					Capacity++;}
				if(anxiety >=1) {
					Capacity++;}
				if(obsessiveBehavior >=1) {
					Capacity++;}
				if(sweating >=1) {
					Capacity++;}
				if(lossOfAppetite >=1) {
					Capacity++;}
				if(rapidHeartbeat >=1) {
					Capacity++;
							}
			return percentage(Acc, Capacity);
			}
	static double mesothelioma(double jointPain,
			double soreThroat, double inflammation, double redSkin,
			double headAche, double runnyNose, double aches, double cough,
			double highTemp, double chestpain, double wheezing, double fatigue, double nausea, double swollenGums,
			double dehydration, double vomit, double diarrhea, double chestPain,
			double shortnessOfBreath, double anxiety, double obsessiveBehavior,
			double sweating, double lossOfAppetite, double rapidHeartbeat, double numberOfSym) {
								
			double Acc = 0.0;
			double Capacity = 4.0;
				if(soreThroat >=1 ) {
					Capacity++;}
				if(headAche >=1 ) {
					Capacity++;}
				if(runnyNose >=1) {
					Capacity++;}
				if(jointPain >=1) {
					Capacity++;}
				if(redSkin >=1) {
					Capacity++;}
				if(inflammation >=1) {
					Capacity++;}
				if(aches >=1) {
					Capacity++;}
				if(cough >=1) {
					Acc++;}
				if(highTemp >=1) {
					Acc++;}
				if(chestpain >=1) {
					Acc++;}
				if(wheezing >=1) {
					Capacity++;}
				if(fatigue >=1) {
					Capacity++;}
				if(nausea >=1) {
					Capacity++;}
				if(swollenGums >=1) {
					Capacity++;}
				if(dehydration >=1) {
					Capacity++;}
				if(vomit >=1) {
					Capacity++;}
				if(diarrhea >=1) {
					Capacity++;}
				if(chestPain >=1) {
					Capacity++;}
				if(shortnessOfBreath >=1) {
					Acc++;}
				if(anxiety >=1) {
					Capacity++;}
				if(obsessiveBehavior >=1) {
					Capacity++;}
				if(sweating >=1) {
					Capacity++;}
				if(lossOfAppetite >=1) {
					Capacity++;}
				if(rapidHeartbeat >=1) {
					Capacity++;
							}
			return percentage(Acc, Capacity);
			}
	
	static double percentage(double Val1, double Val2) {
		double percentage = ((Val1 / Val2) * 100);
		if(percentage >= 0) {
			return percentage;
		}
			return 0;
	}
}