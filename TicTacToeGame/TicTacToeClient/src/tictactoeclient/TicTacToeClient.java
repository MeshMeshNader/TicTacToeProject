/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.io.File;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;



/**
 *
 * @author meshm
 */
public class TicTacToeClient extends Application {

    public static Stage stage;
    public static String soundFile;
    public static Media sound;
    public static MediaPlayer mediaPlayer;

    @Override
    public void start(Stage stage) throws Exception {
         initSound();
        Parent root = new WelcomPage();

        this.stage = stage;

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe Game");
        stage.show();
    }
     public static void initSound() {
        TicTacToeClient.soundFile = "src\\tictactoeclient\\sounds\\sound.mp3";
        try {
            TicTacToeClient.sound = new Media(new File(soundFile).toURI().toString());
        } catch (Exception e) {
            System.err.println("Failed to load sound file: " + e.getMessage());
            return;
        }
        TicTacToeClient.mediaPlayer = new MediaPlayer(TicTacToeClient.sound);
        //this property will make the sound to run automatically when the app starts
        TicTacToeClient.mediaPlayer.setAutoPlay(true);

    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
