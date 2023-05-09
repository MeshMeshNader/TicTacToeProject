package tictactoeclient;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.InnerShadow;
import javafx.scene.effect.Light.Distant;
import javafx.scene.effect.Lighting;
import javafx.scene.effect.Shadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class OnlineSignupPage extends BorderPane {

    Stage parentStage;
    protected final AnchorPane anchorPane;
    protected final Glow glow;
    protected final Button registerBtn;
    protected final DropShadow dropShadow;
    protected final Button backBtn;
    protected final DropShadow dropShadow0;
    protected final Button homeBtn;
    protected final DropShadow dropShadow1;
    protected final TextField nickNameTxtField;
    protected final TextField userNameTxtField;
    protected final TextField passwordTxtField;
    protected final TextField rePasswordTxtField;
    protected final Text nickNameTxt;
    protected final Text rePassworrdTxt;
    protected final Lighting lighting;
    protected final Text passwordTxt;
    protected final InnerShadow innerShadow;
    protected final Text userNameTxt;
    protected final AnchorPane nickNameTxtField0;
    protected final Glow glow0;
    protected final Text xTxt;
    protected final Text oTxt;
    protected final Text toeTxt;
    protected final Text aTxt;
    protected final Text ticTxt;
    protected final ImageView image;
    protected final ToggleButton soundToggleBtn;
    protected final DropShadow dropShadow2;
    protected final Text soundTxt;

    public OnlineSignupPage(Stage stage) {

        parentStage = stage;
        anchorPane = new AnchorPane();
        glow = new Glow();
        registerBtn = new Button();
        dropShadow = new DropShadow();
        backBtn = new Button();
        dropShadow0 = new DropShadow();
        homeBtn = new Button();
        dropShadow1 = new DropShadow();
        nickNameTxtField = new TextField();
        userNameTxtField = new TextField();
        passwordTxtField = new TextField();
        rePasswordTxtField = new TextField();
        nickNameTxt = new Text();
        rePassworrdTxt = new Text();
        lighting = new Lighting();
        passwordTxt = new Text();
        innerShadow = new InnerShadow();
        userNameTxt = new Text();
        nickNameTxtField0 = new AnchorPane();
        glow0 = new Glow();
        xTxt = new Text();
        oTxt = new Text();
        toeTxt = new Text();
        aTxt = new Text();
        ticTxt = new Text();
        image = new ImageView();
        soundToggleBtn = new ToggleButton();
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

        registerBtn.setLayoutX(103.0);
        registerBtn.setLayoutY(399.0);
        registerBtn.setMnemonicParsing(false);
        registerBtn.setPrefHeight(37.0);
        registerBtn.setPrefWidth(126.0);
        registerBtn.setStyle("-fx-background-color: #ffffff;");
        registerBtn.setText("Register");
        registerBtn.setFont(new Font("Bauhaus 93", 19.0));

        registerBtn.setEffect(dropShadow);

        backBtn.setLayoutX(33.0);
        backBtn.setLayoutY(638.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(38.0);
        backBtn.setPrefWidth(93.0);
        backBtn.setStyle("-fx-background-color: #ffffff;");
        backBtn.setText("Back");
        backBtn.setFont(new Font("Bauhaus 93", 19.0));

        backBtn.setEffect(dropShadow0);

        homeBtn.setLayoutX(218.0);
        homeBtn.setLayoutY(637.0);
        homeBtn.setMnemonicParsing(false);
        homeBtn.setPrefHeight(38.0);
        homeBtn.setPrefWidth(93.0);
        homeBtn.setStyle("-fx-background-color: #ffffff;");
        homeBtn.setText("Home");
        homeBtn.setFont(new Font("Bauhaus 93", 19.0));

        homeBtn.setEffect(dropShadow1);

        nickNameTxtField.setLayoutX(171.0);
        nickNameTxtField.setLayoutY(80.0);
        nickNameTxtField.setFont(new Font("Bauhaus 93", 14.0));

        userNameTxtField.setLayoutX(171.0);
        userNameTxtField.setLayoutY(150.0);
        userNameTxtField.setFont(new Font("Bauhaus 93", 14.0));

        passwordTxtField.setLayoutX(171.0);
        passwordTxtField.setLayoutY(220.0);
        passwordTxtField.setFont(new Font("Bauhaus 93", 14.0));

        rePasswordTxtField.setLayoutX(171.0);
        rePasswordTxtField.setLayoutY(290.0);
        rePasswordTxtField.setFont(new Font("Bauhaus 93", 14.0));

        nickNameTxt.setLayoutX(33.0);
        nickNameTxt.setLayoutY(100.0);
        nickNameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        nickNameTxt.setStrokeWidth(0.0);
        nickNameTxt.setText("Nickname");
        nickNameTxt.setFont(new Font("Bauhaus 93", 22.0));

        rePassworrdTxt.setLayoutX(34.0);
        rePassworrdTxt.setLayoutY(309.0);
        rePassworrdTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        rePassworrdTxt.setStrokeWidth(0.0);
        rePassworrdTxt.setText("Re-password");
        rePassworrdTxt.setFont(new Font("Bauhaus 93", 22.0));

        rePassworrdTxt.setEffect(lighting);

        passwordTxt.setLayoutX(33.0);
        passwordTxt.setLayoutY(239.0);
        passwordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        passwordTxt.setStrokeWidth(0.0);
        passwordTxt.setText("Password");
        passwordTxt.setFont(new Font("Bauhaus 93", 22.0));

        passwordTxt.setEffect(innerShadow);

        userNameTxt.setLayoutX(34.0);
        userNameTxt.setLayoutY(170.0);
        userNameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        userNameTxt.setStrokeWidth(0.0);
        userNameTxt.setText("Username");
        userNameTxt.setFont(new Font("Bauhaus 93", 22.0));
        setLeft(anchorPane);

        BorderPane.setAlignment(nickNameTxtField0, javafx.geometry.Pos.CENTER);
        nickNameTxtField0.setPrefHeight(200.0);
        nickNameTxtField0.setPrefWidth(200.0);

        nickNameTxtField0.setEffect(glow0);

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

        image.setFitHeight(350.0);
        image.setFitWidth(350.0);
        image.setLayoutX(163.0);
        image.setLayoutY(277.0);
        image.setPickOnBounds(true);
        image.setPreserveRatio(true);
        image.setImage(new Image(getClass().getResource("images/game.png").toExternalForm()));

        soundToggleBtn.setLayoutX(519.0);
        soundToggleBtn.setLayoutY(656.0);
        soundToggleBtn.setMnemonicParsing(false);
        soundToggleBtn.setPrefHeight(42.0);
        soundToggleBtn.setPrefWidth(130.0);
        soundToggleBtn.setText("On");

        soundToggleBtn.setEffect(dropShadow2);
        soundToggleBtn.setFont(new Font("Bauhaus 93", 19.0));

        soundTxt.setLayoutX(410.0);
        soundTxt.setLayoutY(692.0);
        soundTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        soundTxt.setStrokeWidth(0.0);
        soundTxt.setText("Sound");
        soundTxt.setFont(new Font("Bauhaus 93", 30.0));
        setCenter(nickNameTxtField0);

        anchorPane.getChildren().add(registerBtn);
        anchorPane.getChildren().add(backBtn);
        anchorPane.getChildren().add(homeBtn);
        anchorPane.getChildren().add(nickNameTxtField);
        anchorPane.getChildren().add(userNameTxtField);
        anchorPane.getChildren().add(passwordTxtField);
        anchorPane.getChildren().add(rePasswordTxtField);
        anchorPane.getChildren().add(nickNameTxt);
        anchorPane.getChildren().add(rePassworrdTxt);
        anchorPane.getChildren().add(passwordTxt);
        anchorPane.getChildren().add(userNameTxt);
        nickNameTxtField0.getChildren().add(xTxt);
        nickNameTxtField0.getChildren().add(oTxt);
        nickNameTxtField0.getChildren().add(toeTxt);
        nickNameTxtField0.getChildren().add(aTxt);
        nickNameTxtField0.getChildren().add(ticTxt);
        nickNameTxtField0.getChildren().add(image);
        nickNameTxtField0.getChildren().add(soundToggleBtn);
        nickNameTxtField0.getChildren().add(soundTxt);
        soundToggleBtn.setStyle("-fx-background-color: green;");
        
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
        

        registerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                OnlineUsersPage root = new OnlineUsersPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                OnlineLoginPage root = new OnlineLoginPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });

        homeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                WelcomPage root = new WelcomPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });

    }
}
