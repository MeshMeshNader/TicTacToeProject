package tictactoeclient;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
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

public class ComputerLevelPage extends BorderPane {

    static public enum Difficulty {

        EASY, MEDIUM, HARD;
    }

    static public enum xOrO {

        X, O;
    }

    Difficulty mode;
    xOrO xoState;
    Stage parentStage;

    protected final ToggleGroup radioGroup;
    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final Glow glow;
    protected final Text xTxt;
    protected final Text oTxt;
    protected final Text toeTxt;
    protected final Text aTxt;
    protected final Text ticTxt;
    protected final ImageView gameBoradImg;
    protected final ToggleButton soundToggleBtn;
    protected final DropShadow dropShadow;
    protected final Text soundTxt;
    protected final AnchorPane anchorPane1;
    protected final Button easyBtn;
    protected final DropShadow dropShadow0;
    protected final Button mediumBtn;
    protected final DropShadow dropShadow1;
    protected final Button hardBtn;
    protected final DropShadow dropShadow2;
    protected final TextField enterYourNameValueTxtField;
    protected final Text enterYourNameTxt;
    protected final RadioButton xRadioBtn;
    protected final RadioButton oRadioBtn;
    protected final Button backBtn;
    protected final DropShadow dropShadow3;
    protected final Button startBtn;
    protected final DropShadow dropShadow4;
    protected final Glow glow0;

    public ComputerLevelPage(Stage stage) {

        parentStage = stage;
        radioGroup = new ToggleGroup();
        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        glow = new Glow();
        xTxt = new Text();
        oTxt = new Text();
        toeTxt = new Text();
        aTxt = new Text();
        ticTxt = new Text();
        gameBoradImg = new ImageView();
        soundToggleBtn = new ToggleButton();
        dropShadow = new DropShadow();
        soundTxt = new Text();
        anchorPane1 = new AnchorPane();
        easyBtn = new Button();
        dropShadow0 = new DropShadow();
        mediumBtn = new Button();
        dropShadow1 = new DropShadow();
        hardBtn = new Button();
        dropShadow2 = new DropShadow();
        enterYourNameValueTxtField = new TextField();
        enterYourNameTxt = new Text();
        xRadioBtn = new RadioButton();
        oRadioBtn = new RadioButton();
        backBtn = new Button();
        dropShadow3 = new DropShadow();
        startBtn = new Button();
        dropShadow4 = new DropShadow();
        glow0 = new Glow();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(1024.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        AnchorPane.setBottomAnchor(anchorPane0, 0.0);
        AnchorPane.setLeftAnchor(anchorPane0, 0.0);
        AnchorPane.setRightAnchor(anchorPane0, 0.0);
        AnchorPane.setTopAnchor(anchorPane0, 0.0);
        anchorPane0.setLayoutX(357.0);
        anchorPane0.setLayoutY(-2.0);
        anchorPane0.setPrefHeight(720.0);
        anchorPane0.setPrefWidth(1007.2);

        anchorPane0.setEffect(glow);

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

        gameBoradImg.setFitHeight(350.0);
        gameBoradImg.setFitWidth(350.0);
        gameBoradImg.setLayoutX(163.0);
        gameBoradImg.setLayoutY(277.0);
        gameBoradImg.setPickOnBounds(true);
        gameBoradImg.setPreserveRatio(true);
        gameBoradImg.setImage(new Image(getClass().getResource("images/game.png").toExternalForm()));

        soundToggleBtn.setLayoutX(519.0);
        soundToggleBtn.setLayoutY(656.0);
        soundToggleBtn.setMnemonicParsing(false);
        soundToggleBtn.setPrefHeight(42.0);
        soundToggleBtn.setPrefWidth(130.0);

        soundToggleBtn.setEffect(dropShadow);
        soundToggleBtn.setFont(new Font("Bauhaus 93", 19.0));
        soundToggleBtn.setText("On");

        soundTxt.setLayoutX(410.0);
        soundTxt.setLayoutY(692.0);
        soundTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        soundTxt.setStrokeWidth(0.0);
        soundTxt.setText("Sound");
        soundTxt.setFont(new Font("Bauhaus 93", 30.0));
        setCenter(anchorPane);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(720.0);
        anchorPane1.setPrefWidth(356.0);
        anchorPane1.setStyle("-fx-background-color: #F27B7A;");

        easyBtn.setLayoutX(102.0);
        easyBtn.setLayoutY(98.0);
        easyBtn.setMnemonicParsing(false);
        easyBtn.setPrefHeight(37.0);
        easyBtn.setPrefWidth(126.0);
        easyBtn.setStyle("-fx-background-color: #ffffff;");
        easyBtn.setText("Easy");
        easyBtn.setFont(new Font("Bauhaus 93", 19.0));

        easyBtn.setEffect(dropShadow0);

        mediumBtn.setLayoutX(103.0);
        mediumBtn.setLayoutY(186.0);
        mediumBtn.setMnemonicParsing(false);
        mediumBtn.setPrefHeight(37.0);
        mediumBtn.setPrefWidth(126.0);
        mediumBtn.setStyle("-fx-background-color: #ffffff;");
        mediumBtn.setText("Medium");
        mediumBtn.setFont(new Font("Bauhaus 93", 19.0));

        mediumBtn.setEffect(dropShadow1);

        hardBtn.setLayoutX(102.0);
        hardBtn.setLayoutY(275.0);
        hardBtn.setMnemonicParsing(false);
        hardBtn.setPrefHeight(37.0);
        hardBtn.setPrefWidth(126.0);
        hardBtn.setStyle("-fx-background-color: #ffffff;");
        hardBtn.setText("Hard");
        hardBtn.setFont(new Font("Bauhaus 93", 19.0));

        hardBtn.setEffect(dropShadow2);

        enterYourNameValueTxtField.setLayoutX(180.0);
        enterYourNameValueTxtField.setLayoutY(410.0);
        enterYourNameValueTxtField.setPrefHeight(35.0);
        enterYourNameValueTxtField.setPrefWidth(154.0);

        enterYourNameTxt.setLayoutX(13.0);
        enterYourNameTxt.setLayoutY(434.0);
        enterYourNameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        enterYourNameTxt.setStrokeWidth(0.0);
        enterYourNameTxt.setText("Enter Your Name");
        enterYourNameTxt.setFont(new Font("Bauhaus 93", 20.0));

        xRadioBtn.setLayoutX(60.0);
        xRadioBtn.setLayoutY(529.0);
        xRadioBtn.setMnemonicParsing(false);
        xRadioBtn.setSelected(true);
        xRadioBtn.setText("X");
        xRadioBtn.setFont(new Font("Bauhaus 93", 24.0));

        oRadioBtn.setLayoutX(219.0);
        oRadioBtn.setLayoutY(531.0);
        oRadioBtn.setMnemonicParsing(false);
        oRadioBtn.setText("O");
        oRadioBtn.setFont(new Font("Bauhaus 93", 24.0));

        backBtn.setLayoutX(29.0);
        backBtn.setLayoutY(656.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(37.0);
        backBtn.setPrefWidth(126.0);
        backBtn.setStyle("-fx-background-color: #ffffff;");
        backBtn.setText("Back");
        backBtn.setFont(new Font("Bauhaus 93", 19.0));

        backBtn.setEffect(dropShadow3);

        startBtn.setLayoutX(182.0);
        startBtn.setLayoutY(655.0);
        startBtn.setMnemonicParsing(false);
        startBtn.setPrefHeight(37.0);
        startBtn.setPrefWidth(126.0);
        startBtn.setStyle("-fx-background-color: #ffffff;");
        startBtn.setText("Start");
        startBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        startBtn.setFont(new Font("Bauhaus 93", 19.0));

        startBtn.setEffect(dropShadow4);

        anchorPane1.setEffect(glow0);
        setLeft(anchorPane1);

        anchorPane0.getChildren().add(xTxt);
        anchorPane0.getChildren().add(oTxt);
        anchorPane0.getChildren().add(toeTxt);
        anchorPane0.getChildren().add(aTxt);
        anchorPane0.getChildren().add(ticTxt);
        anchorPane0.getChildren().add(gameBoradImg);
        anchorPane0.getChildren().add(soundToggleBtn);
        anchorPane0.getChildren().add(soundTxt);
        anchorPane.getChildren().add(anchorPane0);
        anchorPane1.getChildren().add(easyBtn);
        anchorPane1.getChildren().add(mediumBtn);
        anchorPane1.getChildren().add(hardBtn);
        anchorPane1.getChildren().add(enterYourNameValueTxtField);
        anchorPane1.getChildren().add(enterYourNameTxt);
        anchorPane1.getChildren().add(xRadioBtn);
        anchorPane1.getChildren().add(oRadioBtn);
        anchorPane1.getChildren().add(backBtn);
        anchorPane1.getChildren().add(startBtn);
        soundToggleBtn.setStyle("-fx-background-color: green;");

        //Select X or O  
        xRadioBtn.setToggleGroup(radioGroup);
        oRadioBtn.setToggleGroup(radioGroup);
        xRadioBtn.setSelected(true);

        easyBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setSelectedButton(easyBtn);
                mode = Difficulty.EASY;
            }
        });

        mediumBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setSelectedButton(mediumBtn);
                mode = Difficulty.MEDIUM;

            }
        });

        hardBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                setSelectedButton(hardBtn);
                mode = Difficulty.HARD;
            }
        });

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                OfflineMenuPage root = new OfflineMenuPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });

        startBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                xoState = (xRadioBtn.isSelected()) ? xOrO.X : xOrO.O;

                if (!enterYourNameValueTxtField.getText().isEmpty()) {
                    ComputerGameBoard root = new ComputerGameBoard(parentStage, enterYourNameValueTxtField.getText(), mode, xoState);
                    Scene scene = new Scene(root);
                    parentStage.setScene(scene);
                } else {
                    showValidationAlert();
                }
            }
        });
        
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
        

    }

    void setSelectedButton(Button btn) {
        easyBtn.setDisable(false);
        mediumBtn.setDisable(false);
        hardBtn.setDisable(false);
        btn.setDisable(true);
    }

    void showValidationAlert() {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Name Validation");
        alert.setHeaderText(null);
        alert.setContentText("Please Enter Your Name!!");
        alert.showAndWait();
    }
    
        
    
}
