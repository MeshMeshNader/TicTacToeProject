package tictactoeclient;

import java.io.File;
import javafx.application.Platform;

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
import javafx.stage.Stage;

public class MyProfilePage extends BorderPane {

    boolean myTurn;
    protected final AnchorPane anchorPane;
    protected final Glow glow;
    protected final ImageView userImg;
    protected final Button myProfileBtn;
    protected final DropShadow dropShadow;
    protected final ImageView usersImg;
    protected final Button onlineUsersBtn;
    protected final DropShadow dropShadow0;
    protected final Button backBtn;
    protected final DropShadow dropShadow1;
    protected final Button homeBtn;
    protected final DropShadow dropShadow2;
    protected final AnchorPane anchorPane0;
    protected final Glow glow0;
    protected final Text xTxt;
    protected final Text oTxt;
    protected final Text toeTxt;
    protected final Text aTxt;
    protected final Text ticTxt;
    protected final ToggleButton soundToggleBtn;
    protected final DropShadow dropShadow3;
    protected final Text soundTxt;
    protected final Text nickNameTxt;
    protected final Text nickNameValueTxt;
    protected final Text userNameTxt;
    protected final Text userNameValueTxt;
    protected final Text noOfWinsTxt;
    protected final Text noOfWinsValueTxt;
    protected final Text noOfLossesTxt;
    protected final Text noOfLossesValueTxt;
    protected final Text scoreTxt;
    protected final Text scoreValueTxt;

    public MyProfilePage() {

        ClientConnection clientconnection;
        myTurn = false;
        anchorPane = new AnchorPane();
        glow = new Glow();
        userImg = new ImageView();
        myProfileBtn = new Button();
        dropShadow = new DropShadow();
        usersImg = new ImageView();
        onlineUsersBtn = new Button();
        dropShadow0 = new DropShadow();
        backBtn = new Button();
        dropShadow1 = new DropShadow();
        homeBtn = new Button();
        dropShadow2 = new DropShadow();
        anchorPane0 = new AnchorPane();
        glow0 = new Glow();
        xTxt = new Text();
        oTxt = new Text();
        toeTxt = new Text();
        aTxt = new Text();
        ticTxt = new Text();
        soundToggleBtn = new ToggleButton();
        dropShadow3 = new DropShadow();
        soundTxt = new Text();
        nickNameTxt = new Text();
        nickNameValueTxt = new Text();
        userNameTxt = new Text();
        userNameValueTxt = new Text();
        noOfWinsTxt = new Text();
        noOfWinsValueTxt = new Text();
        noOfLossesTxt = new Text();
        noOfLossesValueTxt = new Text();
        scoreTxt = new Text();
        scoreValueTxt = new Text();

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

        userImg.setFitHeight(130.0);
        userImg.setFitWidth(150.0);
        userImg.setLayoutX(116.0);
        userImg.setLayoutY(82.0);
        userImg.setPickOnBounds(true);
        userImg.setPreserveRatio(true);
        userImg.setImage(new Image(getClass().getResource("images/User.png").toExternalForm()));

        myProfileBtn.setLayoutX(118.0);
        myProfileBtn.setLayoutY(238.0);
        myProfileBtn.setMnemonicParsing(false);
        myProfileBtn.setPrefHeight(37.0);
        myProfileBtn.setPrefWidth(126.0);
        myProfileBtn.setStyle("-fx-background-color: #ffffff;");
        myProfileBtn.setText("My Profile");
        myProfileBtn.setFont(new Font("Bauhaus 93", 19.0));

        myProfileBtn.setEffect(dropShadow);

        usersImg.setFitHeight(130.0);
        usersImg.setFitWidth(150.0);
        usersImg.setLayoutX(112.0);
        usersImg.setLayoutY(373.0);
        usersImg.setPickOnBounds(true);
        usersImg.setPreserveRatio(true);
        usersImg.setImage(new Image(getClass().getResource("images/Users.png").toExternalForm()));

        onlineUsersBtn.setLayoutX(107.0);
        onlineUsersBtn.setLayoutY(529.0);
        onlineUsersBtn.setMnemonicParsing(false);
        onlineUsersBtn.setPrefHeight(38.0);
        onlineUsersBtn.setPrefWidth(151.0);
        onlineUsersBtn.setStyle("-fx-background-color: #ffffff;");
        onlineUsersBtn.setText("Online USerS");
        onlineUsersBtn.setFont(new Font("Bauhaus 93", 19.0));

        onlineUsersBtn.setEffect(dropShadow0);

        backBtn.setLayoutX(30.0);
        backBtn.setLayoutY(646.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(38.0);
        backBtn.setPrefWidth(85.0);
        backBtn.setStyle("-fx-background-color: #ffffff;");
        backBtn.setText("Back");
        backBtn.setFont(new Font("Bauhaus 93", 19.0));

        backBtn.setEffect(dropShadow1);

        homeBtn.setLayoutX(238.0);
        homeBtn.setLayoutY(644.0);
        homeBtn.setMnemonicParsing(false);
        homeBtn.setPrefHeight(38.0);
        homeBtn.setPrefWidth(85.0);
        homeBtn.setStyle("-fx-background-color: #ffffff;");
        homeBtn.setText("Home");
        homeBtn.setFont(new Font("Bauhaus 93", 19.0));

        homeBtn.setEffect(dropShadow2);
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

        soundToggleBtn.setLayoutX(519.0);
        soundToggleBtn.setLayoutY(656.0);
        soundToggleBtn.setMnemonicParsing(false);
        soundToggleBtn.setPrefHeight(42.0);
        soundToggleBtn.setPrefWidth(130.0);

        soundToggleBtn.setText("On");

        soundToggleBtn.setEffect(dropShadow3);
        soundToggleBtn.setFont(new Font("Bauhaus 93", 19.0));

        soundTxt.setLayoutX(410.0);
        soundTxt.setLayoutY(692.0);
        soundTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        soundTxt.setStrokeWidth(0.0);
        soundTxt.setText("Sound");
        soundTxt.setFont(new Font("Bauhaus 93", 30.0));

        nickNameTxt.setLayoutX(100.0);
        nickNameTxt.setLayoutY(335.0);
        nickNameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        nickNameTxt.setStrokeWidth(0.0);
        nickNameTxt.setText("Nickname:");
        nickNameTxt.setFont(new Font("Bauhaus 93", 35.0));

        nickNameValueTxt.setLayoutX(345.0);
        nickNameValueTxt.setLayoutY(335.0);
        nickNameValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        nickNameValueTxt.setStrokeWidth(0.0);
        nickNameValueTxt.setText("");
        nickNameValueTxt.setFont(new Font("Bauhaus 93", 35.0));

        userNameTxt.setLayoutX(100.0);
        userNameTxt.setLayoutY(400.0);
        userNameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        userNameTxt.setStrokeWidth(0.0);
        userNameTxt.setText("USer Name:");
        userNameTxt.setFont(new Font("Bauhaus 93", 35.0));

        userNameValueTxt.setLayoutX(345.0);
        userNameValueTxt.setLayoutY(400.0);
        userNameValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        userNameValueTxt.setStrokeWidth(0.0);
        userNameValueTxt.setText("");
        userNameValueTxt.setFont(new Font("Bauhaus 93", 35.0));

        noOfWinsTxt.setLayoutX(100.0);
        noOfWinsTxt.setLayoutY(465.0);
        noOfWinsTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        noOfWinsTxt.setStrokeWidth(0.0);
        noOfWinsTxt.setText("No. of Wins:");
        noOfWinsTxt.setFont(new Font("Bauhaus 93", 35.0));

        noOfWinsValueTxt.setLayoutX(345.0);
        noOfWinsValueTxt.setLayoutY(465.0);
        noOfWinsValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        noOfWinsValueTxt.setStrokeWidth(0.0);
        noOfWinsValueTxt.setText("");
        noOfWinsValueTxt.setFont(new Font("Bauhaus 93", 35.0));

        noOfLossesTxt.setLayoutX(100.0);
        noOfLossesTxt.setLayoutY(530.0);
        noOfLossesTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        noOfLossesTxt.setStrokeWidth(0.0);
        noOfLossesTxt.setText("No. of Losses:");
        noOfLossesTxt.setFont(new Font("Bauhaus 93", 35.0));

        noOfLossesValueTxt.setLayoutX(345.0);
        noOfLossesValueTxt.setLayoutY(530.0);
        noOfLossesValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        noOfLossesValueTxt.setStrokeWidth(0.0);
        noOfLossesValueTxt.setText("");
        noOfLossesValueTxt.setFont(new Font("Bauhaus 93", 35.0));

        scoreTxt.setLayoutX(100.0);
        scoreTxt.setLayoutY(595.0);
        scoreTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        scoreTxt.setStrokeWidth(0.0);
        scoreTxt.setText("Score:");
        scoreTxt.setFont(new Font("Bauhaus 93", 35.0));

        scoreValueTxt.setLayoutX(345.0);
        scoreValueTxt.setLayoutY(590.0);
        scoreValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        scoreValueTxt.setStrokeWidth(0.0);
        scoreValueTxt.setText("");
        scoreValueTxt.setFont(new Font("Bauhaus 93", 35.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(userImg);
        anchorPane.getChildren().add(myProfileBtn);
        anchorPane.getChildren().add(usersImg);
        anchorPane.getChildren().add(onlineUsersBtn);
        anchorPane.getChildren().add(backBtn);
        anchorPane.getChildren().add(homeBtn);
        anchorPane0.getChildren().add(xTxt);
        anchorPane0.getChildren().add(oTxt);
        anchorPane0.getChildren().add(toeTxt);
        anchorPane0.getChildren().add(aTxt);
        anchorPane0.getChildren().add(ticTxt);
        anchorPane0.getChildren().add(soundToggleBtn);
        anchorPane0.getChildren().add(soundTxt);
        anchorPane0.getChildren().add(nickNameTxt);
        anchorPane0.getChildren().add(nickNameValueTxt);
        anchorPane0.getChildren().add(userNameTxt);
        anchorPane0.getChildren().add(userNameValueTxt);
        anchorPane0.getChildren().add(noOfWinsTxt);
        anchorPane0.getChildren().add(noOfWinsValueTxt);
        anchorPane0.getChildren().add(noOfLossesTxt);
        anchorPane0.getChildren().add(noOfLossesValueTxt);
        anchorPane0.getChildren().add(scoreTxt);
        anchorPane0.getChildren().add(scoreValueTxt);
        clientconnection = ClientConnection.getInstance();
        
        

        myProfileBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                MyProfilePage root = new MyProfilePage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);
            }
        });

        onlineUsersBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                OnlineUsersPage root = new OnlineUsersPage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);
            }
        });

        homeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                WelcomPage root = new WelcomPage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);
            }
        });

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                OnlineLoginPage root = new OnlineLoginPage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);

            }
        });

        soundToggleBtn.setStyle("-fx-background-color: green;");

        //generate the sound file from a given path
        //creating an object from media player 
        String soundFile = "src\\tictactoeclient\\sounds\\sound.mp3";
        Media sound;
        try {
            sound = new Media(new File(soundFile).toURI().toString());
        } catch (Exception e) {
            System.err.println("Failed to load sound file: " + e.getMessage());
            return;
        }
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        //this property will make the sound to run automatically when the app starts
        mediaPlayer.setAutoPlay(true);

        soundToggleBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (soundToggleBtn.isSelected()) {
                    mediaPlayer.pause();
                    soundToggleBtn.setText("Off");
                    soundToggleBtn.setStyle("-fx-background-color: red;");

                } else {
                    mediaPlayer.play();
                    soundToggleBtn.setText("On");
                    soundToggleBtn.setStyle("-fx-background-color: green;");
                }
            }
        });

        myProfileBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                MyProfilePage root = new MyProfilePage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);
            }
        });

        onlineUsersBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                OnlineUsersPage root = new OnlineUsersPage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);
            }
        });

        homeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                WelcomPage root = new WelcomPage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);
            }
        });

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                OnlineLoginPage root = new OnlineLoginPage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);

            }
        });

        

        

        ClientConnection.flag.addListener((observable, oldValue, newValue) -> {
            if (newValue.equals("myProfileUserObject")) {
                 myTurn = true;
            }else{
                myTurn = false;
             }
        });

        ClientConnection.flagObjct.addListener((observable, oldValue, newValue) -> {
            UserDTO user;
            if (myTurn) {
                 user = (UserDTO) newValue;
                 displayUserData(user);
            }
        });
        
        
        
        clientconnection.writeMessage(Messages.getAllInfoRequest, OnlineLoginPage.loggedOnUser);
        

    }

    private void displayUserData(UserDTO user) {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                nickNameValueTxt.setText(user.getUserNickName());
                userNameValueTxt.setText(user.getUserName());
                noOfWinsValueTxt.setText(String.valueOf(user.getNoOfWins()));
                noOfLossesValueTxt.setText(String.valueOf(user.getNoOfLosses()));
                scoreValueTxt.setText(String.valueOf(user.getScore()));
            }
        });
    }

}
