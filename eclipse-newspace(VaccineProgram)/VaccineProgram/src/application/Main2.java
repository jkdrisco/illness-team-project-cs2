package application;

import Illnesses.Illness;
import Illnesses.IllnessComparable;
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

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;


public class Main2 implements Initializable {
	private Stage primaryStage;
	
	public Main2(Illness[] ill) {
		this.show(ill);
		primaryStage.show();
	}
	
	public void show(Illness[] ill) {
		primaryStage = new Stage();
	    Group root = new Group();
	    Scene scene = new Scene(root, 866, 670, Color.WHITESMOKE);

	    //***********************TEXT*********************************
	    
	    Text titleText = new Text("ChildCare");
	    titleText.setFont(Font.font ("Arial Rounded MT Bold", 30));
	    titleText.setFill(Color.WHITESMOKE);
	    
	    Text illness1Text = new Text(ill[0].getName());
	    illness1Text.setFont(Font.font ("System", 20));
	    illness1Text.setUnderline(true);
	    
	    Text illness2Text = new Text(ill[1].getName());
	    illness2Text.setFont(Font.font ("System", 20));
	    illness2Text.setUnderline(true);
	    
	    Text illness3Text = new Text(ill[2].getName());
	    illness3Text.setFont(Font.font ("System", 20));
	    illness3Text.setUnderline(true);
	    
	    Text illness4Text = new Text(ill[3].getName());
	    illness4Text.setFont(Font.font ("System", 20));
	    illness4Text.setUnderline(true);
	    
	    Button homeButton = new Button();
	    homeButton.setMinWidth(18);
	    homeButton.setMinHeight(18);
	    homeButton.setPrefWidth(18);
	    homeButton.setPrefHeight(18);
	    homeButton.setStyle("-fx-background-color: WHITESMOKE;");
	    homeButton.setTranslateX(680);
	    
	    homeButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Stage stage0 = (Stage) homeButton.getScene().getWindow();
				stage0.close();
				Stage primaryStage = new Stage();
				FXMLLoader loader = new FXMLLoader(getClass().getResource("GUI1.fxml"));
				Pane p = new Pane();
				try {
					p = loader.load();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				        
				primaryStage.setScene(new Scene(p));
				primaryStage.show();
			}
			});
	    
	    Text illness1Sum = new Text(ill[0].getDesc());
	    illness1Sum.setFont(Font.font ("System", 14));
	    illness1Sum.wrappingWidthProperty().set(500);
	   
	    
	    Text illness2Sum = new Text(ill[1].getDesc());
	    illness2Sum.setFont(Font.font ("System", 14));
	    illness2Sum.wrappingWidthProperty().set(500);
	    
	    Text illness3Sum = new Text(ill[2].getDesc());
	    illness3Sum.setFont(Font.font ("System", 14));
	    illness3Sum.wrappingWidthProperty().set(500);
	    
	    Text illness4Sum = new Text(ill[3].getDesc());
	    illness4Sum.setFont(Font.font ("System", 14));
	    illness4Sum.wrappingWidthProperty().set(500);

	    Text ill1Rarity = new Text(ill[0].getRarity());
	    int rarity1 = ill[0].rarityNum();
	    ill1Rarity.setFont(Font.font ("System", 16));
	    ill1Rarity.setTranslateY(10);
	    if(rarity1 == 0) {
	    ill1Rarity.setTranslateX(39);
	    }
	    if(rarity1 == 1) {
	    ill1Rarity.setTranslateX(22);
	    }
	    if(rarity1 == 2) {
	    ill1Rarity.setTranslateX(55);
	    }
	    if(rarity1 == 3) {
	    ill1Rarity.setTranslateX(37);
	    }
	    
	    Text ill2Rarity = new Text(ill[1].getRarity());
	    int rarity2 = ill[1].rarityNum();
	    ill2Rarity.setFont(Font.font ("System", 16));
	    ill2Rarity.setTranslateY(10);
	    if(rarity2 == 0) {
	    ill2Rarity.setTranslateX(39);
	    }
	    if(rarity2 == 1) {
	    ill2Rarity.setTranslateX(22);
	    }
	    if(rarity2 == 2) {
	    ill2Rarity.setTranslateX(55);
	    }
	    if(rarity2 == 3) {
	    ill2Rarity.setTranslateX(37);
	    }
	    
	    Text ill3Rarity = new Text(ill[2].getRarity());
	    int rarity3 = ill[2].rarityNum();
	    ill3Rarity.setFont(Font.font ("System", 16));
	    ill3Rarity.setTranslateY(10);
	    if(rarity3 == 0) {
	    ill3Rarity.setTranslateX(39);
	    }
	    if(rarity3 == 1) {
	    ill3Rarity.setTranslateX(22);
	    }
	    if(rarity3 == 2) {
	    ill3Rarity.setTranslateX(55);
	    }
	    if(rarity3 == 3) {
	    ill3Rarity.setTranslateX(37);
	    }
	    
	    Text ill4Rarity = new Text(ill[3].getRarity());
	    int rarity4 = ill[3].rarityNum();
	    ill4Rarity.setFont(Font.font ("System", 16));
	    ill4Rarity.setTranslateY(10);
	    if(rarity4 == 0) {
	    ill4Rarity.setTranslateX(39);
	    }
	    if(rarity4 == 1) {
	    ill4Rarity.setTranslateX(22);
	    }
	    if(rarity4 == 2) {
	    ill4Rarity.setTranslateX(55);
	    }
	    if(rarity4 == 3) {
	    ill4Rarity.setTranslateX(37);
	    }
	    
	    Text ill1Acc;
	    if (ill[0].calcNum() == 10) {
	    	ill1Acc = new Text("10");
	    }
	    else {
	    	ill1Acc = new Text(String.format("0%s", ill[0].getCalc()));
	    }
	    ill1Acc.setFont(Font.font ("System", 56));
	    ill1Acc.setTranslateY(15);
	    ill1Acc.setTranslateX(40);
	    ill1Acc.setFill(Color.TURQUOISE);
	    
	    Text ill2Acc;
	    if (ill[1].calcNum() == 10) {
	    	ill2Acc = new Text("10");
	    }
	    else {
	    	ill2Acc = new Text(String.format("0%s", ill[1].getCalc()));
	    }
	    ill2Acc.setFont(Font.font ("System", 56));
	    ill2Acc.setTranslateY(15);
	    ill2Acc.setTranslateX(40);
	    ill2Acc.setFill(Color.TURQUOISE);
	    
	    Text ill3Acc;
	    if (ill[2].calcNum() == 10) {
	    	ill3Acc = new Text("10");
	    }
	    else {
	    	ill3Acc = new Text(String.format("0%s", ill[2].getCalc()));
	    }
	    ill3Acc.setFont(Font.font ("System", 56));
	    ill3Acc.setTranslateY(15);
	    ill3Acc.setTranslateX(40);
	    ill3Acc.setFill(Color.TURQUOISE);
	    
	    Text ill4Acc;
	    if (ill[3].calcNum() == 10) {
	    	ill4Acc = new Text("10");
	    }
	    else {
	    	ill4Acc = new Text(String.format("0%s", ill[3].getCalc()));
	    }
	    ill4Acc.setFont(Font.font ("System", 56));
	    ill4Acc.setTranslateY(15);
	    ill4Acc.setTranslateX(40);
	    ill4Acc.setFill(Color.TURQUOISE);
	    
	   
	//***********************Hbox*********************************

	    HBox hbox1 = new HBox();
	    hbox1.setPadding(new Insets(10, 10, 10, 10));
	    hbox1.setPrefWidth(866);
	    hbox1.setPrefHeight(110);
	    hbox1.setStyle("-fx-background-color: TURQUOISE;");
	    hbox1.getChildren().add(titleText);
	    hbox1.getChildren().add(homeButton);
	    
	    HBox hbox2 = new HBox();
	    hbox2.setPadding(new Insets(10, 10, 10, 10));
	    hbox2.setPrefWidth(546);
	    hbox2.setPrefHeight(140);
	    hbox2.setTranslateX(90);
	    hbox2.setTranslateY(110);
	    hbox2.getChildren().add(illness1Text);
	    
	    
	    HBox hbox2Addition = new HBox();
	    hbox2Addition.setPadding(new Insets(10, 10, 10, 10));
	    hbox2Addition.setPrefWidth(546);
	    hbox2Addition.setPrefHeight(110);
	    hbox2Addition.setTranslateX(90);
	    hbox2Addition.setTranslateY(140);
	    hbox2Addition.getChildren().add(illness1Sum);

	    
	    HBox hbox3 = new HBox();
	    hbox3.setPadding(new Insets(10, 10, 10, 10));
	    hbox3.setPrefWidth(546);
	    hbox3.setPrefHeight(140);
	    hbox3.setTranslateX(90);
	    hbox3.setTranslateY(250);
	    hbox3.getChildren().add(illness2Text);
	    
	    HBox hbox3Addition = new HBox();
	    hbox3Addition.setPadding(new Insets(10, 10, 10, 10));
	    hbox3Addition.setPrefWidth(546);
	    hbox3Addition.setPrefHeight(110);
	    hbox3Addition.setTranslateX(90);
	    hbox3Addition.setTranslateY(280);
	    hbox3Addition.getChildren().add(illness2Sum);
	    
	    HBox hbox4 = new HBox();
	    hbox4.setPadding(new Insets(10, 10, 10, 10));
	    hbox4.setPrefWidth(546);
	    hbox4.setPrefHeight(140);
	    hbox4.setTranslateX(90);
	    hbox4.setTranslateY(390);
	    hbox4.getChildren().add(illness3Text);
	    hbox4.getChildren().add(illness3Sum);
	    
	    HBox hbox4Addition = new HBox();
	    hbox4Addition.setPadding(new Insets(10, 10, 10, 10));
	    hbox4Addition.setPrefWidth(546);
	    hbox4Addition.setPrefHeight(110);
	    hbox4Addition.setTranslateX(90);
	    hbox4Addition.setTranslateY(420);
	    hbox4Addition.getChildren().add(illness3Sum);
	    
	    HBox hbox5 = new HBox();
	    hbox5.setPadding(new Insets(10, 10, 10, 10));
	    hbox5.setPrefWidth(546);
	    hbox5.setPrefHeight(140);
	    hbox5.setTranslateX(90);
	    hbox5.setTranslateY(530);
	    hbox5.getChildren().add(illness4Text);
	    
	    HBox hbox5Addition = new HBox();
	    hbox5Addition.setPadding(new Insets(10, 10, 10, 10));
	    hbox5Addition.setPrefWidth(546);
	    hbox5Addition.setPrefHeight(110);
	    hbox5Addition.setTranslateX(90);
	    hbox5Addition.setTranslateY(560);
	    hbox5Addition.getChildren().add(illness4Sum);

	   //*******************VBox**********************
	    
	    VBox vbox1 = new VBox();
	    vbox1.setPrefWidth(90);
	    vbox1.setPrefHeight(670);
	    vbox1.setStyle("-fx-background-color: DIMGREY;");
	    
	    VBox vbox2 = new VBox();
	    vbox2.setPrefWidth(90);
	    vbox2.setPrefHeight(670);
	    vbox2.setStyle("-fx-background-color: DIMGREY;");
	    vbox2.setTranslateX(780);
	    
	    VBox vbox3 = new VBox();
	    vbox3.setPrefWidth(150);
	    vbox3.setPrefHeight(140);
	    vbox3.setTranslateX(636);
	    vbox3.setTranslateY(110);
	    vbox3.getChildren().add(ill1Rarity);
	    vbox3.getChildren().add(ill1Acc);

	    VBox vbox4 = new VBox();
	    vbox4.setPrefWidth(150);
	    vbox4.setPrefHeight(140);
	    vbox4.setTranslateX(636);
	    vbox4.setTranslateY(250);
	    vbox4.getChildren().add(ill2Rarity);
	    vbox4.getChildren().add(ill2Acc);
	    
	    VBox vbox5 = new VBox();
	    vbox5.setPrefWidth(150);
	    vbox5.setPrefHeight(140);
	    vbox5.setTranslateX(636);
	    vbox5.setTranslateY(390);
	    vbox5.getChildren().add(ill3Rarity);
	    vbox5.getChildren().add(ill3Acc);

	    VBox vbox6 = new VBox();
	    vbox6.setPrefWidth(150);
	    vbox6.setPrefHeight(140);
	    vbox6.setTranslateX(636);
	    vbox6.setTranslateY(530);
	    vbox6.getChildren().add(ill4Rarity);
	    vbox6.getChildren().add(ill4Acc);
	    
	//***********************Line*********************************
	    
	    Line line1 = new Line();
	    line1.setStartX(636);
	    line1.setStartY(110);
	    line1.setEndX(636);
	    line1.setEndY(670);
	    line1.setStroke(Color.DIMGREY);
	    
	    Line line2 = new Line();
	    line2.setStartX(90);
	    line2.setStartY(250);
	    line2.setEndX(780);
	    line2.setEndY(250);
	    line2.setStroke(Color.DIMGREY);

	    Line line3 = new Line();
	    line3.setStartX(90);
	    line3.setStartY(390);
	    line3.setEndX(780);
	    line3.setEndY(390);
	    line3.setStroke(Color.DIMGREY);
	    
	    Line line4 = new Line();
	    line4.setStartX(90);
	    line4.setStartY(530);
	    line4.setEndX(780);
	    line4.setEndY(530);
	    line4.setStroke(Color.DIMGREY);  
	    
	//***********************getChildren*********************************

	    root.getChildren().add(hbox2);
	    root.getChildren().add(hbox2Addition);
	    root.getChildren().add(hbox3);
	    root.getChildren().add(hbox3Addition);
	    root.getChildren().add(hbox4);
	    root.getChildren().add(hbox4Addition);
	    root.getChildren().add(hbox5);
	    root.getChildren().add(hbox5Addition);
	    root.getChildren().add(vbox3);
	    root.getChildren().add(vbox4);
	    root.getChildren().add(vbox5);
	    root.getChildren().add(vbox6);


	    root.getChildren().add(line4);
	    root.getChildren().add(line3);
	    root.getChildren().add(line2);
	    root.getChildren().add(line1);
	    root.getChildren().add(vbox1);
	    root.getChildren().add(vbox2);
	    root.getChildren().add(hbox1);
	    primaryStage.setScene(scene);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}