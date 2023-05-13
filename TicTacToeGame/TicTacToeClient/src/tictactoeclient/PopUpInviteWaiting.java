package tictactoeclient;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PopUpInviteWaiting extends AnchorPane {

    Stage parentStage;

    boolean myTurn;
    protected final Text waitingForResponseTxt;
    protected final DropShadow dropShadow;
//    protected final Button cancelBtn;
//    protected final Button startBtn;
    protected final DropShadow dropShadow0;
    protected final ProgressIndicator progressIndicator;
    protected final Glow glow;

    public PopUpInviteWaiting(Stage stage, UserDTO selectedUser) {
        ClientConnection clientconnection;
        myTurn = false;
        parentStage = stage;
        waitingForResponseTxt = new Text();
//        startBtn = new Button();
        dropShadow = new DropShadow();
//        cancelBtn = new Button();
        dropShadow0 = new DropShadow();
        progressIndicator = new ProgressIndicator();
        glow = new Glow();

        setPrefHeight(400.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #F27B7A;");

        waitingForResponseTxt.setLayoutX(96.0);
        waitingForResponseTxt.setLayoutY(153.0);
        waitingForResponseTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        waitingForResponseTxt.setStrokeWidth(0.0);
        waitingForResponseTxt.setText("Waiting For The Response...");
        waitingForResponseTxt.setFont(new Font("Bauhaus 93", 24.0));

//        startBtn.setDisable(false);
//        startBtn.setLayoutX(304.0);
//        startBtn.setLayoutY(318.0);
//        startBtn.setMnemonicParsing(false);
//        startBtn.setPrefHeight(38.0);
//        startBtn.setPrefWidth(99.0);
//        startBtn.setStyle("-fx-background-color: #ffffff;");
//        startBtn.setText("Start");
//        startBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
//        startBtn.setFont(new Font("Bauhaus 93", 20.0));
//
//        startBtn.setEffect(dropShadow);
//        cancelBtn.setLayoutX(98.0);
//        cancelBtn.setLayoutY(318.0);
//        cancelBtn.setMnemonicParsing(false);
//        cancelBtn.setPrefHeight(38.0);
//        cancelBtn.setPrefWidth(99.0);
//        cancelBtn.setStyle("-fx-background-color: #ffffff;");
//        cancelBtn.setText("Cancel");
//        cancelBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
//        cancelBtn.setFont(new Font("Bauhaus 93", 20.0));
//
//        cancelBtn.setEffect(dropShadow0);
        progressIndicator.setLayoutX(200.0);
        progressIndicator.setLayoutY(200.0);
        progressIndicator.setPrefHeight(83.0);
        progressIndicator.setPrefWidth(111.0);

        setEffect(glow);

        getChildren().add(waitingForResponseTxt);
//        getChildren().add(startBtn);
//        getChildren().add(cancelBtn);
        getChildren().add(progressIndicator);
        clientconnection = ClientConnection.getInstance();

        ClientConnection.flag.addListener((observable, oldValue, newValue) -> {

            if (newValue.equals("acceptTrue")) {

                OnlineGameBoard root = new OnlineGameBoard(null);
                Scene scene = new Scene(root);
                System.out.println("Opening GameBoard From Client Waiting ");
                //loggedOnUser = user;
                TicTacToeClient.stage.setScene(scene);
                parentStage.close();

            } else if (newValue.equals("acceptFalse")) {
                parentStage.close();

            }
        });

//        cancelBtn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                parentStage.close();
//            }
//        });
//        startBtn.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                // When The User Accept  the game
//            }
//        });
//
    }

}
