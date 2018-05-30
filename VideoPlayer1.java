package media;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

/**
 *
 * @author dean
 */
public class VideoPlayer1 extends Application {

  public static void main(String[] args) {
    launch(args);
  }
  
  @Override
  public void start(Stage primaryStage) {
    String workingDir = System.getProperty("user.dir");
    File f = new File(workingDir, "omgrobots.flv");
    
    Media m = new Media(f.toURI().toString());
    MediaPlayer mp = new MediaPlayer(m);
    MediaView mv = new MediaView(mp);
    
    StackPane root = new StackPane();
    root.getChildren().add(mv);
    
    primaryStage.setScene(new Scene(root, 960, 540));
    primaryStage.setTitle("Video Player 1");
    primaryStage.show();
    
    mp.play();
  }
}
