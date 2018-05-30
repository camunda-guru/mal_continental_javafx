package media;

import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class AudioPlayer1 extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    final URL resource = getClass().getResource("keeper.mp3");
    final Media media = new Media(resource.toString());
    final MediaPlayer mediaPlayer = new MediaPlayer(media);
    mediaPlayer.setOnError(() -> {
        final String errorMessage = media.getError().getMessage();
    });
    mediaPlayer.play();

    primaryStage.setTitle("Audio Player 1");
    primaryStage.setWidth(200);
    primaryStage.setHeight(200);
    primaryStage.show();
  }
}
