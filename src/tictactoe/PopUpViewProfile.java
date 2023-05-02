package tictactoe;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PopUpViewProfile extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Text userNameTxt;
    protected final TextField nameTxtField;
    protected final TextField scoreTxtField;
    protected final TextField noOfLosesTxtField;
    protected final TextField scoreValueTxtField;
    protected final TextField noOfLosesValueTxtField;
    protected final TextField noOfWinsValueTxtField;
    protected final TextField noOfWinsTxtField;
    protected final TextField nameValueTxtField;
    protected final Button okBtn;
    protected final DropShadow dropShadow;
    protected final Glow glow;

    public PopUpViewProfile() {

        anchorPane = new AnchorPane();
        userNameTxt = new Text();
        nameTxtField = new TextField();
        scoreTxtField = new TextField();
        noOfLosesTxtField = new TextField();
        scoreValueTxtField = new TextField();
        noOfLosesValueTxtField = new TextField();
        noOfWinsValueTxtField = new TextField();
        noOfWinsTxtField = new TextField();
        nameValueTxtField = new TextField();
        okBtn = new Button();
        dropShadow = new DropShadow();
        glow = new Glow();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(420.0);
        setPrefWidth(500.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);
        anchorPane.setStyle("-fx-background-color: #F27B7A;");

        userNameTxt.setLayoutX(179.0);
        userNameTxt.setLayoutY(89.0);
        userNameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        userNameTxt.setStrokeWidth(0.0);
        userNameTxt.setText("USer Name");
        userNameTxt.setFont(new Font("Bauhaus 93", 30.0));

        nameTxtField.setAlignment(javafx.geometry.Pos.CENTER);
        nameTxtField.setEditable(false);
        nameTxtField.setLayoutX(70.0);
        nameTxtField.setLayoutY(140.0);
        nameTxtField.setPrefHeight(35.0);
        nameTxtField.setPrefWidth(150.0);
        nameTxtField.setText("Name");
        nameTxtField.setFont(new Font("Bauhaus 93", 20.0));

        scoreTxtField.setAlignment(javafx.geometry.Pos.CENTER);
        scoreTxtField.setEditable(false);
        scoreTxtField.setLayoutX(70.0);
        scoreTxtField.setLayoutY(190.0);
        scoreTxtField.setPrefHeight(35.0);
        scoreTxtField.setPrefWidth(150.0);
        scoreTxtField.setText("Score");
        scoreTxtField.setFont(new Font("Bauhaus 93", 20.0));

        noOfLosesTxtField.setAlignment(javafx.geometry.Pos.CENTER);
        noOfLosesTxtField.setEditable(false);
        noOfLosesTxtField.setLayoutX(70.0);
        noOfLosesTxtField.setLayoutY(290.0);
        noOfLosesTxtField.setPrefHeight(35.0);
        noOfLosesTxtField.setPrefWidth(150.0);
        noOfLosesTxtField.setText("No. of loses");
        noOfLosesTxtField.setFont(new Font("Bauhaus 93", 20.0));

        scoreValueTxtField.setEditable(false);
        scoreValueTxtField.setLayoutX(280.0);
        scoreValueTxtField.setLayoutY(190.0);
        scoreValueTxtField.setPrefHeight(35.0);
        scoreValueTxtField.setPrefWidth(154.0);

        noOfLosesValueTxtField.setEditable(false);
        noOfLosesValueTxtField.setLayoutX(280.0);
        noOfLosesValueTxtField.setLayoutY(290.0);
        noOfLosesValueTxtField.setPrefHeight(35.0);
        noOfLosesValueTxtField.setPrefWidth(154.0);

        noOfWinsValueTxtField.setEditable(false);
        noOfWinsValueTxtField.setLayoutX(280.0);
        noOfWinsValueTxtField.setLayoutY(240.0);
        noOfWinsValueTxtField.setPrefHeight(35.0);
        noOfWinsValueTxtField.setPrefWidth(154.0);

        noOfWinsTxtField.setAlignment(javafx.geometry.Pos.CENTER);
        noOfWinsTxtField.setEditable(false);
        noOfWinsTxtField.setLayoutX(70.0);
        noOfWinsTxtField.setLayoutY(240.0);
        noOfWinsTxtField.setPrefHeight(35.0);
        noOfWinsTxtField.setPrefWidth(150.0);
        noOfWinsTxtField.setText("No. of Wins");
        noOfWinsTxtField.setFont(new Font("Bauhaus 93", 20.0));

        nameValueTxtField.setEditable(false);
        nameValueTxtField.setLayoutX(281.0);
        nameValueTxtField.setLayoutY(140.0);
        nameValueTxtField.setPrefHeight(35.0);
        nameValueTxtField.setPrefWidth(154.0);

        okBtn.setLayoutX(201.0);
        okBtn.setLayoutY(356.0);
        okBtn.setMnemonicParsing(false);
        okBtn.setPrefHeight(38.0);
        okBtn.setPrefWidth(99.0);
        okBtn.setStyle("-fx-background-color: #ffffff;");
        okBtn.setText("OK");
        okBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        okBtn.setFont(new Font("Bauhaus 93", 20.0));

        okBtn.setEffect(dropShadow);

        anchorPane.setEffect(glow);
        setCenter(anchorPane);

        anchorPane.getChildren().add(userNameTxt);
        anchorPane.getChildren().add(nameTxtField);
        anchorPane.getChildren().add(scoreTxtField);
        anchorPane.getChildren().add(noOfLosesTxtField);
        anchorPane.getChildren().add(scoreValueTxtField);
        anchorPane.getChildren().add(noOfLosesValueTxtField);
        anchorPane.getChildren().add(noOfWinsValueTxtField);
        anchorPane.getChildren().add(noOfWinsTxtField);
        anchorPane.getChildren().add(nameValueTxtField);
        anchorPane.getChildren().add(okBtn);

    }
}
