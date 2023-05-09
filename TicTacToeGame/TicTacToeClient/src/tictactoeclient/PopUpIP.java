package tictactoeclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import tictactoeclient.UserDTO;

public class PopUpIP extends BorderPane {
    
    Stage parentStage;
    Stage popupstage;
    protected final AnchorPane anchorPane;
    protected final Text ipTxt;
    protected final TextField nameTxtField;
    protected final TextField ipValueTxtField;
    protected final Button okBtn;
    protected final DropShadow dropShadow;
    protected final Glow glow;
    InputStream inputstream;
    OutputStream outpuststream;
    ObjectInputStream objectinputstream;
    ObjectOutputStream objectoutputstream;
    Socket socket;
    String ip;
    ClientConnection clientconnection;
    
    public PopUpIP(Stage stage, Stage popupstage) {
        parentStage = stage;
        this.popupstage = popupstage;
        
        anchorPane = new AnchorPane();
        ipTxt = new Text();
        nameTxtField = new TextField();
        ipValueTxtField = new TextField();
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
        anchorPane.setPrefWidth(300.0);
        anchorPane.setStyle("-fx-background-color: #F27B7A;");
        
        ipTxt.setLayoutX(118.0);
        ipTxt.setLayoutY(76.0);
        ipTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ipTxt.setStrokeWidth(0.0);
        ipTxt.setText("Please Enter IP");
        ipTxt.setWrappingWidth(232.142578125);
        ipTxt.setFont(new Font("Bauhaus 93", 30.0));
        
        nameTxtField.setAlignment(javafx.geometry.Pos.CENTER);
        nameTxtField.setEditable(false);
        nameTxtField.setLayoutX(25.0);
        nameTxtField.setLayoutY(162.0);
        nameTxtField.setPrefHeight(35.0);
        nameTxtField.setPrefWidth(150.0);
        nameTxtField.setText("IP");
        nameTxtField.setFont(new Font("Bauhaus 93", 20.0));
        
        ipValueTxtField.setEditable(true);
        ipValueTxtField.setLayoutX(236.0);
        ipValueTxtField.setLayoutY(165.0);
        ipValueTxtField.setPrefHeight(32.0);
        ipValueTxtField.setPrefWidth(227.0);
        
        okBtn.setLayoutX(175.0);
        okBtn.setLayoutY(287.0);
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
        
        anchorPane.getChildren().add(ipTxt);
        anchorPane.getChildren().add(nameTxtField);
        anchorPane.getChildren().add(ipValueTxtField);
        anchorPane.getChildren().add(okBtn);
        
        okBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ip = ipValueTxtField.getText();
                new Thread() {
                    public void run() {
                        clientconnection = ClientConnection.getInstance();
                        clientconnection.initConnection(ip);
                    }
                }.start();
                OnlineLoginPage root = new OnlineLoginPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
                popupstage.close();
                
            }
        });
        
    }
    
}
