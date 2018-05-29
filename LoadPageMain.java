package webviewdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoadPageMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
	FXMLLoader fxmlLoader = new FXMLLoader();
	fxmlLoader.setLocation(
			LoadPageMain.class.getResource("LoadPage.fxml"));
	fxmlLoader.setController(
	new LoadPageController("LoadPageController"));
	final VBox vBox = fxmlLoader.load();
	Scene scene = new Scene(vBox, 600, 400);
	primaryStage.setTitle("FXMLLoader Example");
	primaryStage.setScene(scene);
	primaryStage.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             launch(args);
	}

}
