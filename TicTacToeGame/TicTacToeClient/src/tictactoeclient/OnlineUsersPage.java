package tictactoeclient;

import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.cell.PropertyValueFactory;
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
import static tictactoeclient.OnlineLoginPage.loggedOnUser;

public class OnlineUsersPage extends BorderPane {

    ClientConnection clientconnection;
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
    protected final ToggleButton soundToggleBtn;
    protected final DropShadow dropShadow3;
    protected final Text soundTxt;
    protected final Text ticTacToePlayersTxt;
    protected final TableView usersTable;
    protected final TableColumn userNameTableCol;
    protected final TableColumn availabilityTableCol;
    protected final TableColumn statusTableCol;
    protected final DropShadow dropShadow4;
    protected final Button viewBtn;
    protected final DropShadow dropShadow5;
    protected final Button inviteBtn;
    protected final DropShadow dropShadow6;

    public OnlineUsersPage() {

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
        soundToggleBtn = new ToggleButton();
        dropShadow3 = new DropShadow();
        soundTxt = new Text();
        ticTacToePlayersTxt = new Text();
        usersTable = new TableView();
        userNameTableCol = new TableColumn();
        availabilityTableCol = new TableColumn();
        statusTableCol = new TableColumn();
        dropShadow4 = new DropShadow();
        viewBtn = new Button();
        dropShadow5 = new DropShadow();
        inviteBtn = new Button();
        dropShadow6 = new DropShadow();

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

        soundToggleBtn.setLayoutX(519.0);
        soundToggleBtn.setLayoutY(656.0);
        soundToggleBtn.setMnemonicParsing(false);
        soundToggleBtn.setPrefHeight(42.0);
        soundToggleBtn.setPrefWidth(130.0);

        soundToggleBtn.setEffect(dropShadow3);
        soundToggleBtn.setFont(new Font("Bauhaus 93", 19.0));

        soundTxt.setLayoutX(410.0);
        soundTxt.setLayoutY(692.0);
        soundTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        soundTxt.setStrokeWidth(0.0);
        soundTxt.setText("Sound");
        soundTxt.setFont(new Font("Bauhaus 93", 30.0));

        ticTacToePlayersTxt.setLayoutX(180.0);
        ticTacToePlayersTxt.setLayoutY(100.0);
        ticTacToePlayersTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticTacToePlayersTxt.setStrokeWidth(0.0);
        ticTacToePlayersTxt.setText("Tic-Tac-Toe Players ");
        ticTacToePlayersTxt.setFont(new Font("Bauhaus 93", 35.0));

        usersTable.setLayoutX(60.0);
        usersTable.setLayoutY(130.0);
        usersTable.setPrefHeight(400.0);
        usersTable.setPrefWidth(550.0);
        usersTable.setStyle("-fx-background-color: #ffffff;");

        userNameTableCol.setEditable(false);
        userNameTableCol.setPrefWidth(75.0);
        userNameTableCol.setStyle("-fx-font-size: 18; -fx-font-family: Bauhaus 93;");
        userNameTableCol.setText("User Name");

        availabilityTableCol.setPrefWidth(75.0);
        availabilityTableCol.setStyle("-fx-font-size: 18; -fx-font-family: Bauhaus 93;");
        availabilityTableCol.setText("Availability");

        statusTableCol.setPrefWidth(75.0);
        statusTableCol.setStyle("-fx-font-size: 18; -fx-font-family: Bauhaus 93;");
        statusTableCol.setText("Status");

        usersTable.setEffect(dropShadow4);
        usersTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        viewBtn.setLayoutX(141.0);
        viewBtn.setLayoutY(583.0);
        viewBtn.setMnemonicParsing(false);
        viewBtn.setPrefHeight(38.0);
        viewBtn.setPrefWidth(85.0);
        viewBtn.setStyle("-fx-background-color: #ffffff;");
        viewBtn.setText("View");
        viewBtn.setFont(new Font("Bauhaus 93", 19.0));

        viewBtn.setEffect(dropShadow5);

        inviteBtn.setLayoutX(462.0);
        inviteBtn.setLayoutY(581.0);
        inviteBtn.setMnemonicParsing(false);
        inviteBtn.setPrefHeight(38.0);
        inviteBtn.setPrefWidth(85.0);
        inviteBtn.setStyle("-fx-background-color: #ffffff;");
        inviteBtn.setText("Invite");
        inviteBtn.setFont(new Font("Bauhaus 93", 19.0));

        inviteBtn.setEffect(dropShadow6);
        setCenter(anchorPane0);

        anchorPane.getChildren().add(userImg);
        anchorPane.getChildren().add(myProfileBtn);
        anchorPane.getChildren().add(usersImg);
        anchorPane.getChildren().add(onlineUsersBtn);
        anchorPane.getChildren().add(backBtn);
        anchorPane.getChildren().add(homeBtn);
        anchorPane0.getChildren().add(soundToggleBtn);
        anchorPane0.getChildren().add(soundTxt);
        anchorPane0.getChildren().add(ticTacToePlayersTxt);
        usersTable.getColumns().add(userNameTableCol);
        usersTable.getColumns().add(availabilityTableCol);
        usersTable.getColumns().add(statusTableCol);
        anchorPane0.getChildren().add(usersTable);
        anchorPane0.getChildren().add(viewBtn);
        anchorPane0.getChildren().add(inviteBtn);

        checkSoundToggleBtn();

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

        viewBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                //Don't Forget To Handel Ex (cannot press withour select user)
                //Show PopUpViewProfile
                //OPen PopUp
                Stage popUpStage = new Stage();
                Scene popUpPage = new Scene(new PopUpViewProfile(popUpStage));

                popUpStage.setScene(popUpPage);
                popUpStage.initModality(Modality.APPLICATION_MODAL);
                popUpStage.showAndWait();

            }
        });

        inviteBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                //Don't Forget To Handel Ex (cannot press withour select user)
                //Show PopUpInviteUser
                //OPen PopUp
                Stage popUpStage = new Stage();
                Scene popUpPage = new Scene(new PopUpInviteWaiting(popUpStage));

                popUpStage.setScene(popUpPage);
                popUpStage.initModality(Modality.APPLICATION_MODAL);
                popUpStage.showAndWait();

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

        clientconnection = ClientConnection.getInstance();
        clientconnection.writeMessage(Messages.getAllPlayersRequest, OnlineLoginPage.loggedOnUser);

        ClientConnection.flagObjct.addListener((observable, oldValue, newValue) -> {

            ArrayList<UserDTO> allPlayers = (ArrayList<UserDTO>) newValue;
            getAll(allPlayers);
        });

    }

    void checkSoundToggleBtn() {
        if (WelcomPage.mediaPlayer.getStatus() == MediaPlayer.Status.PLAYING) {
            soundToggleBtn.setText("On");
            soundToggleBtn.setStyle("-fx-background-color: green;");
            soundToggleBtn.setSelected(true);
        } else {
            soundToggleBtn.setText("Off");
            soundToggleBtn.setStyle("-fx-background-color: red;");
            soundToggleBtn.setSelected(false);
        }

        soundToggleBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (soundToggleBtn.isSelected()) {
                    WelcomPage.mediaPlayer.pause();
                    soundToggleBtn.setText("Off");
                    soundToggleBtn.setStyle("-fx-background-color: red;");
                    soundToggleBtn.setSelected(true);
                } else {
                    WelcomPage.mediaPlayer.play();
                    soundToggleBtn.setText("On");
                    soundToggleBtn.setStyle("-fx-background-color: green;");
                    soundToggleBtn.setSelected(false);
                }
            }
        });
    }

    private void getAll(ArrayList<UserDTO> allPlayers) {

        ObservableList<UserDTO> allPlayersList = FXCollections.observableArrayList();

        userNameTableCol.setCellValueFactory(new PropertyValueFactory<>("userName"));
        availabilityTableCol.setCellValueFactory(new PropertyValueFactory<>("isPlaying"));
        statusTableCol.setCellValueFactory(new PropertyValueFactory<>("isOnline"));

        new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {

                        Platform.runLater(() -> {

                            allPlayersList.clear();

                            for (UserDTO user : allPlayers) {
                                allPlayersList.add(user);
                            }

                        });

                        Thread.sleep(100); // Wait for 5 seconds before updating again
                        // Set the items property of the TableView to the user lists
                        usersTable.setItems(allPlayersList);

                    }
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }.start();
    }
    
    
    
    
    
    
    
    

}