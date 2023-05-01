
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class PopUpViewProfileFXMLBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Text enterYourNameTxt;
    protected final TextField nameTxtField;
    protected final TextField scoreTxtField;
    protected final TextField noOfLosesTxtField;
    protected final TextField scoreValueTxt;
    protected final TextField noOfLosesTxt;
    protected final TextField noOfWinsValueTxt;
    protected final TextField noOfWinsTxtField;
    protected final TextField nameValueTxt;
    protected final Button okBtn;
    protected final DropShadow dropShadow;
    protected final Glow glow;

    public PopUpViewProfileFXMLBase() {

        anchorPane = new AnchorPane();
        enterYourNameTxt = new Text();
        nameTxtField = new TextField();
        scoreTxtField = new TextField();
        noOfLosesTxtField = new TextField();
        scoreValueTxt = new TextField();
        noOfLosesTxt = new TextField();
        noOfWinsValueTxt = new TextField();
        noOfWinsTxtField = new TextField();
        nameValueTxt = new TextField();
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

        enterYourNameTxt.setLayoutX(179.0);
        enterYourNameTxt.setLayoutY(89.0);
        enterYourNameTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        enterYourNameTxt.setStrokeWidth(0.0);
        enterYourNameTxt.setText("My Profile");
        enterYourNameTxt.setFont(new Font("Bauhaus 93", 30.0));

        nameTxtField.setAlignment(javafx.geometry.Pos.CENTER);
        nameTxtField.setLayoutX(70.0);
        nameTxtField.setLayoutY(140.0);
        nameTxtField.setPrefHeight(35.0);
        nameTxtField.setPrefWidth(150.0);
        nameTxtField.setText("Name");
        nameTxtField.setFont(new Font("Bauhaus 93", 20.0));

        scoreTxtField.setAlignment(javafx.geometry.Pos.CENTER);
        scoreTxtField.setLayoutX(70.0);
        scoreTxtField.setLayoutY(190.0);
        scoreTxtField.setPrefHeight(35.0);
        scoreTxtField.setPrefWidth(150.0);
        scoreTxtField.setText("Score");
        scoreTxtField.setFont(new Font("Bauhaus 93", 20.0));

        noOfLosesTxtField.setAlignment(javafx.geometry.Pos.CENTER);
        noOfLosesTxtField.setLayoutX(70.0);
        noOfLosesTxtField.setLayoutY(290.0);
        noOfLosesTxtField.setPrefHeight(35.0);
        noOfLosesTxtField.setPrefWidth(150.0);
        noOfLosesTxtField.setText("No. of loses");
        noOfLosesTxtField.setFont(new Font("Bauhaus 93", 20.0));

        scoreValueTxt.setLayoutX(280.0);
        scoreValueTxt.setLayoutY(190.0);
        scoreValueTxt.setPrefHeight(35.0);
        scoreValueTxt.setPrefWidth(154.0);

        noOfLosesTxt.setLayoutX(280.0);
        noOfLosesTxt.setLayoutY(290.0);
        noOfLosesTxt.setPrefHeight(35.0);
        noOfLosesTxt.setPrefWidth(154.0);

        noOfWinsValueTxt.setLayoutX(280.0);
        noOfWinsValueTxt.setLayoutY(240.0);
        noOfWinsValueTxt.setPrefHeight(35.0);
        noOfWinsValueTxt.setPrefWidth(154.0);

        noOfWinsTxtField.setAlignment(javafx.geometry.Pos.CENTER);
        noOfWinsTxtField.setLayoutX(70.0);
        noOfWinsTxtField.setLayoutY(240.0);
        noOfWinsTxtField.setPrefHeight(35.0);
        noOfWinsTxtField.setPrefWidth(150.0);
        noOfWinsTxtField.setText("No. of Wins");
        noOfWinsTxtField.setFont(new Font("Bauhaus 93", 20.0));

        nameValueTxt.setLayoutX(281.0);
        nameValueTxt.setLayoutY(140.0);
        nameValueTxt.setPrefHeight(35.0);
        nameValueTxt.setPrefWidth(154.0);

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

        anchorPane.getChildren().add(enterYourNameTxt);
        anchorPane.getChildren().add(nameTxtField);
        anchorPane.getChildren().add(scoreTxtField);
        anchorPane.getChildren().add(noOfLosesTxtField);
        anchorPane.getChildren().add(scoreValueTxt);
        anchorPane.getChildren().add(noOfLosesTxt);
        anchorPane.getChildren().add(noOfWinsValueTxt);
        anchorPane.getChildren().add(noOfWinsTxtField);
        anchorPane.getChildren().add(nameValueTxt);
        anchorPane.getChildren().add(okBtn);

    }
}
