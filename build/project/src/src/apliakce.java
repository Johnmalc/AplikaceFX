package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.fxml.*;
/**
 * @author  John Malc
 * @version 1.0
 *
 */
public class apliakce extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		AnchorPane root = FXMLLoader.load(getClass().getResource("ui.fxml"));		
		primaryStage.getIcons().add(new Image("res/icon.png"));

		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("Conrad FX Aplikace");
		primaryStage.show();
	}
		
//	private Button Exit;
//	private Button Check;
//	private TextArea LeftTextArea;
//	private TextArea RightTextArea;
	
	
	public static void main(String[] args) { 	
	    	launch(args);
		}  
}
