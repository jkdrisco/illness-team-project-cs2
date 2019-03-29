package Illnesses;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class VaccineGUI extends Application {
	public static void main(String[] args) {
		launch(args);
	}

	@Override	
	public void start(Stage primaryStage) throws Exception {
		BorderPane pane = new BorderPane();
		pane.setTop(new CustomPane("Top"));
		pane.setRight(new CustomPane("Right"));
		pane.setBottom(new CustomPane("Bottom"));
		pane.setLeft(new CustomPane("Left"));
		pane.setCenter(new CustomPane("Center"));

		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowBorderPane");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	class CustomPane extends StackPane {
		public CustomPane(String title) {
			getChildren().add(new Label(title));
			setStyle("-fx-border-color: black");
			setPadding(new Insets(310, 600, 10, 10));
		}
	}

}
