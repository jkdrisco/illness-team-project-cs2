package application;
	
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;


public class Main extends Application implements Initializable {
	@FXML
	Button myButton;

	@FXML
	Text myText;
   
	@Override
	public void start(Stage primaryStage) throws Exception {
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
		final Pane p = loader.load();
	        
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
	}
	
	public static void main(String[] args) {
		launch(args);
		}
	}
