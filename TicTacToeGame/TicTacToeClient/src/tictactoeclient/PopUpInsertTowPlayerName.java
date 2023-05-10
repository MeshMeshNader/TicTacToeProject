package tictactoeclient;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tictactoeclient.OfflineMenuPage;

public class PopUpInsertTowPlayerName extends AnchorPane {

    protected final Button okBtn;
    protected final DropShadow dropShadow;
    protected final Text enterNamesTxt;
    protected final TextField playerOneNameValue;
    protected final Text playerOneTxt;
    protected final TextField playerTwoNameValue;
    protected final Text playerTwoTxt;
    protected final Button backBtn;
    protected final DropShadow dropShadow0;
    protected final Glow glow;

    String playerOneName;
    String playerTwoName;

    public PopUpInsertTowPlayerName() {

        okBtn = new Button();
        dropShadow = new DropShadow();
        enterNamesTxt = new Text();
        playerOneNameValue = new TextField();
        playerOneTxt = new Text();
        playerTwoNameValue = new TextField();
        playerTwoTxt = new Text();
        backBtn = new Button();
        dropShadow0 = new DropShadow();
        glow = new Glow();

        setPrefHeight(720.0);
        setPrefWidth(1024.0);
        setStyle("-fx-background-color: #F27B7A;");

        okBtn.setLayoutX(554.0);
        okBtn.setLayoutY(591.0);
        okBtn.setMnemonicParsing(false);
        okBtn.setPrefHeight(38.0);
        okBtn.setPrefWidth(154.0);
        okBtn.setStyle("-fx-background-color: #ffffff;");
        okBtn.setText("OK");
        okBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        okBtn.setFont(new Font("Bauhaus 93", 36.0));

        okBtn.setEffect(dropShadow);

        enterNamesTxt.setLayoutX(373.0);
        enterNamesTxt.setLayoutY(64.0);
        enterNamesTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        enterNamesTxt.setStrokeWidth(0.0);
        enterNamesTxt.setText("Enter Names");
        enterNamesTxt.setWrappingWidth(282.58978271484375);
        enterNamesTxt.setFont(new Font("Bauhaus 93", 48.0));

        playerOneNameValue.setLayoutX(534.0);
        playerOneNameValue.setLayoutY(198.0);
        playerOneNameValue.setPrefHeight(45.0);
        playerOneNameValue.setPrefWidth(179.0);
        playerOneNameValue.setFont(new Font("Bauhaus 93", 24.0));

        playerOneTxt.setLayoutX(287.0);
        playerOneTxt.setLayoutY(225.0);
        playerOneTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneTxt.setStrokeWidth(0.0);
        playerOneTxt.setText("PlayerOne(X):");
        playerOneTxt.setWrappingWidth(234.58978271484375);
        playerOneTxt.setFont(new Font("Bauhaus 93", 36.0));

        playerTwoNameValue.setLayoutX(532.0);
        playerTwoNameValue.setLayoutY(334.0);
        playerTwoNameValue.setPrefHeight(45.0);
        playerTwoNameValue.setPrefWidth(179.0);
        playerTwoNameValue.setFont(new Font("Bauhaus 93", 24.0));

        playerTwoTxt.setLayoutX(289.0);
        playerTwoTxt.setLayoutY(368.0);
        playerTwoTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoTxt.setStrokeWidth(0.0);
        playerTwoTxt.setText("PlayerTwo(O):");
        playerTwoTxt.setWrappingWidth(244.58978271484375);
        playerTwoTxt.setFont(new Font("Bauhaus 93", 36.0));

        backBtn.setLayoutX(350.0);
        backBtn.setLayoutY(592.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(38.0);
        backBtn.setPrefWidth(154.0);
        backBtn.setStyle("-fx-background-color: #ffffff;");
        backBtn.setText("Back");
        backBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        backBtn.setFont(new Font("Bauhaus 93", 36.0));

        backBtn.setEffect(dropShadow0);

        setEffect(glow);

        getChildren().add(okBtn);
        getChildren().add(enterNamesTxt);
        getChildren().add(playerOneNameValue);
        getChildren().add(playerOneTxt);
        getChildren().add(playerTwoNameValue);
        getChildren().add(playerTwoTxt);
        getChildren().add(backBtn);
  okBtn.setOnAction(new EventHandler<ActionEvent>() {
      
            @Override
            public void handle(ActionEvent event) {

                if (!playerOneNameValue.getText().isEmpty() && !playerTwoNameValue.getText().isEmpty()) {
                    String getName = playerOneNameValue.getText();
                    String playerOne = getName.substring(0, Math.min(getName.length(), 7));
                    getName = playerTwoNameValue.getText();
                    String playerTwo = getName.substring(0, Math.min(getName.length(), 7));
                    PlayerGameBoard root = new PlayerGameBoard(playerOne, playerTwo);
                    Scene scene = new Scene(root);
                    TicTacToeClient.stage.setScene(scene);
                } else {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Tic-Tay-Toc");
                    alert.setHeaderText(null);
                    alert.setContentText("opps!! you forget enter names");
                    alert.showAndWait();
                }
            }
        });
  backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                 OfflineMenuPage root = new OfflineMenuPage();
                 Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);
               }
        });
    }
}
