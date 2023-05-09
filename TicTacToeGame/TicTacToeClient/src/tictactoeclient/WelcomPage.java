package tictactoeclient;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class WelcomPage extends BorderPane {

    Stage parentStage;
    protected final AnchorPane anchorPane;
    protected final Glow glow;
    protected final ImageView offlineImg;
    protected final Button offlineBtn;
    protected final DropShadow dropShadow;
    protected final ImageView onlineImg;
    protected final Button onlineBtn;
    protected final DropShadow dropShadow0;
    protected final ImageView aboutImg;
    protected final Button aboutBtn;
    protected final DropShadow dropShadow1;
    protected final AnchorPane anchorPane0;
    protected final Glow glow0;
    protected final Text xTxt;
    protected final Text oTxt;
    protected final Text toeTxt;
    protected final Text aTxt;
    protected final Text ticTxt;
    protected final ImageView xoImg;
    protected final ToggleButton soundToggleBtn;               //************1111************
    protected final DropShadow dropShadow2;
    protected final Text soundTxt;

    public WelcomPage(Stage stage) {

        parentStage = stage;
        anchorPane = new AnchorPane();
        glow = new Glow();
        offlineImg = new ImageView();
        offlineBtn = new Button();
        dropShadow = new DropShadow();
        onlineImg = new ImageView();
        onlineBtn = new Button();
        dropShadow0 = new DropShadow();
        aboutImg = new ImageView();
        aboutBtn = new Button();
        dropShadow1 = new DropShadow();
        anchorPane0 = new AnchorPane();
        glow0 = new Glow();
        xTxt = new Text();
        oTxt = new Text();
        toeTxt = new Text();
        aTxt = new Text();
        ticTxt = new Text();
        xoImg = new ImageView();
        soundToggleBtn = new ToggleButton();               //************************
        dropShadow2 = new DropShadow();
        soundTxt = new Text();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(1024.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(720.0);
        anchorPane.setPrefWidth(350.0);
        anchorPane.setStyle("-fx-background-color: #F27B7A;");

        anchorPane.setEffect(glow);

        offlineImg.setFitHeight(130.0);
        offlineImg.setFitWidth(150.0);
        offlineImg.setLayoutX(110.0);
        offlineImg.setLayoutY(30.0);
        offlineImg.setPickOnBounds(true);
        offlineImg.setPreserveRatio(true);
        offlineImg.setImage(new Image(getClass().getResource("images/offline.png").toExternalForm()));

        offlineBtn.setLayoutX(112.0);
        offlineBtn.setLayoutY(186.0);
        offlineBtn.setMnemonicParsing(false);
        offlineBtn.setPrefHeight(37.0);
        offlineBtn.setPrefWidth(126.0);
        offlineBtn.setStyle("-fx-background-color: #ffffff;");
        offlineBtn.setText("Offline");
        offlineBtn.setFont(new Font("Bauhaus 93", 19.0));

        offlineBtn.setEffect(dropShadow);

        onlineImg.setFitHeight(130.0);
        onlineImg.setFitWidth(150.0);
        onlineImg.setLayoutX(113.0);
        onlineImg.setLayoutY(253.0);
        onlineImg.setPickOnBounds(true);
        onlineImg.setPreserveRatio(true);
        onlineImg.setImage(new Image(getClass().getResource("images/online.png").toExternalForm()));

        onlineBtn.setLayoutX(115.0);
        onlineBtn.setLayoutY(409.0);
        onlineBtn.setMnemonicParsing(false);
        onlineBtn.setPrefHeight(37.0);
        onlineBtn.setPrefWidth(126.0);
        onlineBtn.setStyle("-fx-background-color: #ffffff;");
        onlineBtn.setText("Online");
        onlineBtn.setFont(new Font("Bauhaus 93", 19.0));

        onlineBtn.setEffect(dropShadow0);

        aboutImg.setFitHeight(130.0);
        aboutImg.setFitWidth(150.0);
        aboutImg.setLayoutX(117.0);
        aboutImg.setLayoutY(482.0);
        aboutImg.setPickOnBounds(true);
        aboutImg.setPreserveRatio(true);
        aboutImg.setImage(new Image(getClass().getResource("images/about.png").toExternalForm()));

        aboutBtn.setLayoutX(119.0);
        aboutBtn.setLayoutY(638.0);
        aboutBtn.setMnemonicParsing(false);
        aboutBtn.setPrefHeight(37.0);
        aboutBtn.setPrefWidth(126.0);
        aboutBtn.setStyle("-fx-background-color: #ffffff;");
        aboutBtn.setText("About");
        aboutBtn.setFont(new Font("Bauhaus 93", 19.0));

        aboutBtn.setEffect(dropShadow1);
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        anchorPane0.setEffect(glow0);

        xTxt.setLayoutX(223.0);
        xTxt.setLayoutY(138.0);
        xTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        xTxt.setStrokeWidth(0.0);
        xTxt.setText("X");
        xTxt.setFont(new Font("Bauhaus 93", 90.0));

        oTxt.setLayoutX(381.0);
        oTxt.setLayoutY(230.0);
        oTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        oTxt.setStrokeWidth(0.0);
        oTxt.setText("O");
        oTxt.setFont(new Font("Bauhaus 93", 90.0));

        toeTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        toeTxt.setLayoutX(314.0);
        toeTxt.setLayoutY(107.0);
        toeTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeTxt.setStrokeWidth(0.0);
        toeTxt.setText("T   O   E");
        toeTxt.setFont(new Font("Bauhaus 93", 50.0));

        aTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        aTxt.setLayoutX(311.0);
        aTxt.setLayoutY(163.0);
        aTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aTxt.setStrokeWidth(0.0);
        aTxt.setText("A");
        aTxt.setFont(new Font("Bauhaus 93", 50.0));

        ticTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        ticTxt.setLayoutX(188.0);
        ticTxt.setLayoutY(224.0);
        ticTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticTxt.setStrokeWidth(0.0);
        ticTxt.setText("T   I   C");
        ticTxt.setFont(new Font("Bauhaus 93", 50.0));

        xoImg.setFitHeight(350.0);
        xoImg.setFitWidth(350.0);
        xoImg.setLayoutX(163.0);
        xoImg.setLayoutY(277.0);
        xoImg.setPickOnBounds(true);
        xoImg.setPreserveRatio(true);
        xoImg.setImage(new Image(getClass().getResource("images/game.png").toExternalForm()));

        soundToggleBtn.setLayoutX(519.0);
        soundToggleBtn.setLayoutY(656.0);
        soundToggleBtn.setMnemonicParsing(false);
        soundToggleBtn.setPrefHeight(42.0);
        soundToggleBtn.setPrefWidth(130.0);
        soundToggleBtn.setText("On");                           //************************

        soundToggleBtn.setEffect(dropShadow2);
        soundToggleBtn.setFont(new Font("Bauhaus 93", 19.0));

        soundTxt.setLayoutX(410.0);
        soundTxt.setLayoutY(692.0);
        soundTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        soundTxt.setStrokeWidth(0.0);
        soundTxt.setText("Sound");
        soundTxt.setFont(new Font("Bauhaus 93", 30.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(offlineImg);
        anchorPane.getChildren().add(offlineBtn);
        anchorPane.getChildren().add(onlineImg);
        anchorPane.getChildren().add(onlineBtn);
        anchorPane.getChildren().add(aboutImg);
        anchorPane.getChildren().add(aboutBtn);
        anchorPane0.getChildren().add(xTxt);
        anchorPane0.getChildren().add(oTxt);
        anchorPane0.getChildren().add(toeTxt);
        anchorPane0.getChildren().add(aTxt);
        anchorPane0.getChildren().add(ticTxt);
        anchorPane0.getChildren().add(xoImg);
        anchorPane0.getChildren().add(soundToggleBtn);              //************************
        anchorPane0.getChildren().add(soundTxt);
        soundToggleBtn.setStyle("-fx-background-color: green;");   //************************


        
        offlineBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                OfflineMenuPage root = new OfflineMenuPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });
        
        
        onlineBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                OnlineLoginPage root = new OnlineLoginPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });
        
        
        aboutBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                //OPen PopUp
                Stage popUpStage = new Stage();
                Scene popUpPage = new Scene(new PopUpAbout(popUpStage));
                
                popUpStage.setScene(popUpPage);
                popUpStage.initModality(Modality.APPLICATION_MODAL);
                popUpStage.showAndWait();
                
            }
        });
        
        
                                                                                                      //************************
        //generate the sound file from a given path
        //creating an object from media player 
        String soundFile = "C:\\Users\\ahmed\\Desktop\\Final Project\\sound.mp3"; 
        Media sound;
        try {
                 sound = new Media(new File(soundFile).toURI().toString());
             } 
        catch (Exception e) 
             {
                System.err.println("Failed to load sound file: " + e.getMessage());
                return;
              }
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        //this property will make the sound to run automatically when the app starts
        mediaPlayer.setAutoPlay(true);  
        
        soundToggleBtn.setOnAction(new EventHandler<ActionEvent>()
        {
             @Override
            public void handle(ActionEvent event)
            {
            
                 if (soundToggleBtn.isSelected()) 
                    {
                         mediaPlayer.pause();
                         soundToggleBtn.setText("Off");
                         soundToggleBtn.setStyle("-fx-background-color: red;");
    
                     } 
                else 
                 {
                      mediaPlayer.play();
                      soundToggleBtn.setText("On");
                      soundToggleBtn.setStyle("-fx-background-color: green;");
                  }
            }
        });
        
        
                                                                            //************************
        
        
        
    }
}
