package src;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * @author John Malc
 * @version 1.0
 * 
 */
public class Aplikace extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.centerOnScreen();
		primaryStage.setTitle("Conrad aplikace by JohnMalc");
		primaryStage.getIcons().add(new Image("/res/icon.png"));
		primaryStage.show();
		UkazNeco();

	}

	public static void UkazNeco() {		
		System.out.println("dsdfdf");
	}

}
