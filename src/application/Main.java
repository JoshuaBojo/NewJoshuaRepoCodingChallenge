package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

//hello bojo
//hi

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			VBox root= new VBox();
			root.getChildren().add(new Label("Joshua's label"));
			root.getChildren().add(new Label("Mahtaab's Label"));
			root.getChildren().add(new Label("Mahtaab's Branch in josh file"));
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Joshua's project");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
