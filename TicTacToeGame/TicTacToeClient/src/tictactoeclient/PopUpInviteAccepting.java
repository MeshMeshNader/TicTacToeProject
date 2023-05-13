package tictactoeclient;

import java.util.ArrayList;
import java.util.HashMap;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import static tictactoeclient.OnlineLoginPage.loggedOnUser;

public class PopUpInviteAccepting extends AnchorPane {

    Stage parentStage;
    boolean myTurn;
    protected final Text incomingInviteTxt;
    protected final Button acceptBtn;
    protected final DropShadow dropShadow;
    protected final Button cancelBtn;
    protected final DropShadow dropShadow0;
    protected final Text userNameValueTxt;
    protected final Glow glow;

    public PopUpInviteAccepting(Stage stage, HashMap<String, Object> players) {
        ClientConnection clientconnection;
        //boolean accept = false;
        parentStage = stage;
        myTurn = false;
        incomingInviteTxt = new Text();
        acceptBtn = new Button();
        dropShadow = new DropShadow();
        cancelBtn = new Button();
        dropShadow0 = new DropShadow();
        userNameValueTxt = new Text();
        glow = new Glow();

        setPrefHeight(400.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #F27B7A;");

        incomingInviteTxt.setLayoutX(160.0);
        incomingInviteTxt.setLayoutY(150.0);
        incomingInviteTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        incomingInviteTxt.setStrokeWidth(0.0);
        incomingInviteTxt.setText("Wants To Play With You?");
        incomingInviteTxt.setFont(new Font("Bauhaus 93", 24.0));

        acceptBtn.setLayoutX(304.0);
        acceptBtn.setLayoutY(318.0);
        acceptBtn.setMnemonicParsing(false);
        acceptBtn.setPrefHeight(38.0);
        acceptBtn.setPrefWidth(99.0);
        acceptBtn.setStyle("-fx-background-color: #ffffff;");
        acceptBtn.setText("Accept");
        acceptBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        acceptBtn.setFont(new Font("Bauhaus 93", 20.0));

        acceptBtn.setEffect(dropShadow);

        cancelBtn.setLayoutX(98.0);
        cancelBtn.setLayoutY(318.0);
        cancelBtn.setMnemonicParsing(false);
        cancelBtn.setPrefHeight(38.0);
        cancelBtn.setPrefWidth(99.0);
        cancelBtn.setStyle("-fx-background-color: #ffffff;");
        cancelBtn.setText("Cancel");
        cancelBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        cancelBtn.setFont(new Font("Bauhaus 93", 20.0));

        cancelBtn.setEffect(dropShadow0);

        userNameValueTxt.setLayoutX(81.0);
        userNameValueTxt.setLayoutY(150.0);
        userNameValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        userNameValueTxt.setStrokeWidth(0.0);
        userNameValueTxt.setText("Ahmed");
        userNameValueTxt.setFont(new Font("Bauhaus 93", 24.0));

        setEffect(glow);

        getChildren().add(incomingInviteTxt);
        getChildren().add(acceptBtn);
        getChildren().add(cancelBtn);
        getChildren().add(userNameValueTxt);

        clientconnection = ClientConnection.getInstance();
        userNameValueTxt.setText(((UserDTO)players.get(Messages.keySender)).getUserName());

        ClientConnection.flag.addListener((observable, oldValue, newValue) -> {

//            if (newValue.equals("acceptTrue")) {
//               OnlineGameBoard root = new OnlineGameBoard();
//                Scene scene = new Scene(root);
//                //loggedOnUser = user;
//                TicTacToeClient.stage.setScene(scene);
//            } else if (newValue.equals("acceptFalse")) {
//                 parentStage.close();
//              
//            }
        });
        ClientConnection.flagObjct.addListener((observable, oldValue, newValue) -> {

            //UserDTO user = (UserDTO) newValue;
            //displayUserData(user);
        });

        acceptBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                System.out.println("Sending Playing Response From Client With True ");
                clientconnection.writeMessage(Messages.playingResponseTrue, players);
                OnlineGameBoard root = new OnlineGameBoard(players);
                Scene scene = new Scene(root);
                System.out.println("Opening GameBoard From Client Accepting ");
                //loggedOnUser = user;
                TicTacToeClient.stage.setScene(scene);
                parentStage.close();

            }
        });

        cancelBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sending Playing Response From Client with False ");
                clientconnection.writeMessage(Messages.playingResponseFalse, players);
                parentStage.close();
            }
        });

    }

}
