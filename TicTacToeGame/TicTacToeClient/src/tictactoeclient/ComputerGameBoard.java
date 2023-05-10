package tictactoeclient;

 import java.io.File;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.Blend;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Reflection;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
 
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;

import javafx.stage.Stage;
import tictactoeclient.ComputerLevelPage.Difficulty;
import tictactoeclient.ComputerLevelPage.xOrO;

public class ComputerGameBoard extends BorderPane {

    GameManager gameManager;
    
    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final Glow glow;
    protected final Button backBtn;
    protected final DropShadow dropShadow;
    protected final Button rematchBtn;
    protected final DropShadow dropShadow0;
    protected final Button homeBtn;
    protected final DropShadow dropShadow1;
    protected final Text playerTwoUserNameLTxt;
    protected final Text toeLTxt;
    protected final Text aLTxt;
    protected final Text ticLTxt;
    protected final Text playerOneUserNameLValueTxt;
    protected final ToggleButton recordToggleBtn;
    protected final DropShadow dropShadow2;
    protected final Text recordTxt;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final Glow glow0;
    protected final Text playerTwoUserNameRTxt;
    protected final Text toeRTxt;
    protected final Text aRTxt;
    protected final Text ticRTxt;
 
    protected final ToggleButton soundToggleBtn;
    
     protected final DropShadow dropShadow3;
    protected final Text soundTxt;
    protected final Text playerOneUserNameRValueTxt;
    protected final GridPane xoGridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Rectangle xoRectangle;
    protected final Blend blend;
    protected final Reflection reflection;
    protected final Button cellPos2_1;
    protected final ColorAdjust colorAdjust;
    protected final Button cellPos1_1;
    protected final ColorAdjust colorAdjust0;
    protected final Button cellPos0_0;
    protected final ColorAdjust colorAdjust1;
    protected final Button cellPos1_2;
    protected final ColorAdjust colorAdjust2;
    protected final Button cellPos0_2;
    protected final ColorAdjust colorAdjust3;
    protected final Button cellPos1_0;
    protected final ColorAdjust colorAdjust4;
    protected final Button cellPos2_2;
    protected final ColorAdjust colorAdjust5;
    protected final Button cellPos0_1;
    protected final ColorAdjust colorAdjust6;
    protected final Button cellPos2_0;
    protected final ColorAdjust colorAdjust7;
    private ArrayList<Button> buttonsBoard;
    private int playerTurn = 0;
    private boolean gameIsOver = false;
    String playerOneNameValue;
    boolean hasWinner = false;

    public ComputerGameBoard(String playerName, Difficulty mode, xOrO xoState) {
       
         anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        glow = new Glow();
        backBtn = new Button();
        dropShadow = new DropShadow();
        rematchBtn = new Button();
        dropShadow0 = new DropShadow();
        homeBtn = new Button();
        dropShadow1 = new DropShadow();
        playerTwoUserNameLTxt = new Text();
        toeLTxt = new Text();
        aLTxt = new Text();
        ticLTxt = new Text();
        playerOneUserNameLValueTxt = new Text();
        recordToggleBtn = new ToggleButton();
        dropShadow2 = new DropShadow();
        recordTxt = new Text();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        glow0 = new Glow();
        playerTwoUserNameRTxt = new Text();
        toeRTxt = new Text();
        aRTxt = new Text();
        ticRTxt = new Text();
 
        soundToggleBtn = new ToggleButton();
        dropShadow3 = new DropShadow();
        soundTxt = new Text();
 
        playerOneUserNameRValueTxt = new Text();
        xoGridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        xoRectangle = new Rectangle();
        blend = new Blend();
        reflection = new Reflection();
        cellPos2_1 = new Button();
        colorAdjust = new ColorAdjust();
        cellPos1_1 = new Button();
        colorAdjust0 = new ColorAdjust();
        cellPos0_0 = new Button();
        colorAdjust1 = new ColorAdjust();
        cellPos1_2 = new Button();
        colorAdjust2 = new ColorAdjust();
        cellPos0_2 = new Button();

        colorAdjust3 = new ColorAdjust();
        cellPos1_0 = new Button();
        colorAdjust4 = new ColorAdjust();
        cellPos2_2 = new Button();
        colorAdjust5 = new ColorAdjust();
        cellPos0_1 = new Button();
        colorAdjust6 = new ColorAdjust();
        cellPos2_0 = new Button();
        colorAdjust7 = new ColorAdjust();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(1024.0);

        BorderPane.setAlignment(anchorPane, javafx.geometry.Pos.CENTER);
        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);

        anchorPane0.setPrefHeight(720.0);
        anchorPane0.setPrefWidth(350.0);
        anchorPane0.setStyle("-fx-background-color: #F27B7A;");

        anchorPane0.setEffect(glow);

        backBtn.setLayoutX(15.0);
        backBtn.setLayoutY(636.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(38.0);
        backBtn.setPrefWidth(85.0);
        backBtn.setStyle("-fx-background-color: #ffffff;");
        backBtn.setText("Back");
        backBtn.setFont(new Font("Bauhaus 93", 19.0));

        backBtn.setEffect(dropShadow);

        rematchBtn.setLayoutX(120.0);
        rematchBtn.setLayoutY(636.0);
        rematchBtn.setMnemonicParsing(false);
        rematchBtn.setPrefHeight(38.0);
        rematchBtn.setPrefWidth(110.0);
        rematchBtn.setStyle("-fx-background-color: #ffffff;");
        rematchBtn.setText("Rematch");
        rematchBtn.setFont(new Font("Bauhaus 93", 19.0));

        rematchBtn.setEffect(dropShadow0);

        homeBtn.setLayoutX(250.0);
        homeBtn.setLayoutY(636.0);
        homeBtn.setMnemonicParsing(false);
        homeBtn.setPrefHeight(38.0);
        homeBtn.setPrefWidth(85.0);
        homeBtn.setStyle("-fx-background-color: #ffffff;");
        homeBtn.setText("Home");
        homeBtn.setFont(new Font("Bauhaus 93", 19.0));

        homeBtn.setEffect(dropShadow1);

        playerTwoUserNameLTxt.setLayoutX(199.0);
        playerTwoUserNameLTxt.setLayoutY(517.0);
        playerTwoUserNameLTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoUserNameLTxt.setStrokeWidth(0.0);
        playerTwoUserNameLTxt.setText("Computer");
        playerTwoUserNameLTxt.setFont(new Font("Bauhaus 93", 31.0));

        toeLTxt.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        toeLTxt.setLayoutX(169.0);
        toeLTxt.setLayoutY(412.0);
        toeLTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeLTxt.setStrokeWidth(0.0);
        toeLTxt.setText("T     O     E");
        toeLTxt.setFont(new Font("Bauhaus 93", 31.0));

        aLTxt.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        aLTxt.setLayoutX(168.0);
        aLTxt.setLayoutY(466.0);
        aLTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aLTxt.setStrokeWidth(0.0);
        aLTxt.setText("A");
        aLTxt.setFont(new Font("Bauhaus 93", 31.0));

        ticLTxt.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        ticLTxt.setLayoutX(61.0);
        ticLTxt.setLayoutY(516.0);
        ticLTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticLTxt.setStrokeWidth(0.0);
        ticLTxt.setText("T     I     C");
        ticLTxt.setFont(new Font("Bauhaus 93", 31.0));

        playerOneUserNameLValueTxt.setLayoutX(52.0);
        playerOneUserNameLValueTxt.setLayoutY(411.0);
        playerOneUserNameLValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneUserNameLValueTxt.setStrokeWidth(0.0);
        playerOneUserNameLValueTxt.setText(playerName);
        playerOneUserNameLValueTxt.setFont(new Font("Bauhaus 93", 31.0));

        recordToggleBtn.setLayoutX(174.0);
        recordToggleBtn.setLayoutY(26.0);
        recordToggleBtn.setMnemonicParsing(false);
        recordToggleBtn.setPrefHeight(42.0);
        recordToggleBtn.setPrefWidth(130.0);
 
        recordToggleBtn.setText("On / Off");

        recordToggleBtn.setEffect(dropShadow2);
        recordToggleBtn.setFont(new Font("Bauhaus 93", 19.0));

        recordTxt.setLayoutX(53.0);
        recordTxt.setLayoutY(58.0);
        recordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        recordTxt.setStrokeWidth(0.0);
        recordTxt.setText("Record");
        recordTxt.setFont(new Font("Bauhaus 93", 30.0));
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane1, javafx.geometry.Pos.CENTER);
        anchorPane1.setPrefHeight(200.0);
        anchorPane1.setPrefWidth(200.0);

        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(200.0);

        anchorPane2.setEffect(glow0);

        playerTwoUserNameRTxt.setLayoutX(351.0);
        playerTwoUserNameRTxt.setLayoutY(157.0);
        playerTwoUserNameRTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoUserNameRTxt.setStrokeWidth(0.0);
        playerTwoUserNameRTxt.setText("Computer");
        playerTwoUserNameRTxt.setFont(new Font("Bauhaus 93", 24.0));

        toeRTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        toeRTxt.setLayoutX(312.0);
        toeRTxt.setLayoutY(82.0);
        toeRTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeRTxt.setStrokeWidth(0.0);
        toeRTxt.setText("T     O     E");
        toeRTxt.setFont(new Font("Bauhaus 93", 24.0));

        aRTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        aRTxt.setLayoutX(311.0);
        aRTxt.setLayoutY(122.0);
        aRTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aRTxt.setStrokeWidth(0.0);
        aRTxt.setText("A");
        aRTxt.setFont(new Font("Bauhaus 93", 24.0));

        ticRTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        ticRTxt.setLayoutX(229.0);
        ticRTxt.setLayoutY(159.0);
        ticRTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticRTxt.setStrokeWidth(0.0);
        ticRTxt.setText("T     I     C");
        ticRTxt.setFont(new Font("Bauhaus 93", 24.0));

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

        playerOneUserNameRValueTxt.setLayoutX(225.0);
        playerOneUserNameRValueTxt.setLayoutY(81.0);
        playerOneUserNameRValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneUserNameRValueTxt.setStrokeWidth(0.0);
        playerOneUserNameRValueTxt.setText(playerName);
        playerOneUserNameRValueTxt.setFont(new Font("Bauhaus 93", 24.0));

        xoGridPane.setHgap(10.0);
        xoGridPane.setLayoutX(143.0);
        xoGridPane.setLayoutY(219.0);
        xoGridPane.setPrefHeight(390.0);
        xoGridPane.setPrefWidth(390.0);
        xoGridPane.setVgap(10.0);

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMaxHeight(117.9999755859375);
        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(91.33331909179688);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMaxHeight(106.4666809082031);
        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(106.4666809082031);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);
        xoGridPane.setPadding(new Insets(10.0));

        GridPane.setColumnSpan(xoRectangle, 3);
        GridPane.setRowSpan(xoRectangle, 3);
        xoRectangle.setArcHeight(20.0);
        xoRectangle.setArcWidth(20.0);
        xoRectangle.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        xoRectangle.setHeight(390.0);
        xoRectangle.setOpacity(0.55);
        xoRectangle.setStroke(javafx.scene.paint.Color.valueOf("#f2cdcd"));
        xoRectangle.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        xoRectangle.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.ROUND);
        xoRectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        xoRectangle.setTranslateX(-10.0);
        xoRectangle.setWidth(390.0);

        blend.setMode(javafx.scene.effect.BlendMode.LIGHTEN);
        blend.setOpacity(0.0);

        blend.setTopInput(reflection);
        xoRectangle.setEffect(blend);

        GridPane.setColumnIndex(cellPos2_1, 1);
        GridPane.setRowIndex(cellPos2_1, 2);
        cellPos2_1.setMnemonicParsing(false);
        cellPos2_1.setPrefHeight(121.0);
        cellPos2_1.setPrefWidth(118.0);
        cellPos2_1.setMaxWidth(cellPos2_1.getPrefWidth());
        cellPos2_1.setFont(new Font("Bauhaus 93", 64.0));
        cellPos2_1.setCursor(Cursor.HAND);
        cellPos2_1.setId("7");

        colorAdjust.setBrightness(-0.02);
        colorAdjust.setContrast(0.19);
        colorAdjust.setHue(-0.04);
        colorAdjust.setSaturation(0.25);
        cellPos2_1.setEffect(colorAdjust);
        cellPos2_1.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        cellPos0_1.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        cellPos1_1.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        cellPos1_0.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        cellPos1_2.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        cellPos0_0.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        cellPos0_2.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(cellPos1_1, 1);
        GridPane.setRowIndex(cellPos1_1, 1);
        cellPos1_1.setMnemonicParsing(false);
        cellPos1_1.setPrefHeight(121.0);
        cellPos1_1.setPrefWidth(118.0);
        cellPos1_1.setFont(new Font("Bauhaus 93", 64.0));
        cellPos1_1.setCursor(Cursor.HAND);
        cellPos1_1.setId("4");

        colorAdjust0.setBrightness(-0.02);
        colorAdjust0.setContrast(0.19);
        colorAdjust0.setHue(-0.04);
        colorAdjust0.setSaturation(0.25);
        cellPos1_1.setEffect(colorAdjust0);

        cellPos0_0.setMnemonicParsing(false);
        cellPos0_0.setPrefHeight(121.0);
        cellPos0_0.setPrefWidth(118.0);
        cellPos0_0.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust1.setBrightness(-0.02);
        colorAdjust1.setContrast(0.19);
        colorAdjust1.setHue(-0.04);
        colorAdjust1.setSaturation(0.25);
        cellPos0_0.setEffect(colorAdjust1);
        cellPos0_0.setCursor(Cursor.HAND);
        cellPos0_0.setId("0");

        GridPane.setColumnIndex(cellPos1_2, 2);
        GridPane.setRowIndex(cellPos1_2, 1);
        cellPos1_2.setMnemonicParsing(false);
        cellPos1_2.setPrefHeight(121.0);
        cellPos1_2.setPrefWidth(118.0);
        cellPos1_2.setFont(new Font("Bauhaus 93", 64.0));
        cellPos1_2.setCursor(Cursor.HAND);
        cellPos1_2.setId("5");

        colorAdjust2.setBrightness(-0.02);
        colorAdjust2.setContrast(0.19);
        colorAdjust2.setHue(-0.04);
        colorAdjust2.setSaturation(0.25);
        cellPos1_2.setEffect(colorAdjust2);

        GridPane.setColumnIndex(cellPos0_2, 2);
        cellPos0_2.setCache(true);
        cellPos0_2.setMnemonicParsing(false);
        cellPos0_2.setPrefHeight(121.0);
        cellPos0_2.setPrefWidth(118.0);
        cellPos0_2.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust3.setBrightness(-0.02);
        colorAdjust3.setContrast(0.19);
        colorAdjust3.setHue(-0.04);
        colorAdjust3.setSaturation(0.25);
        cellPos0_2.setEffect(colorAdjust3);
        cellPos0_2.setCursor(Cursor.HAND);
        cellPos0_2.setId("2");

        GridPane.setRowIndex(cellPos1_0, 1);
        cellPos1_0.setMnemonicParsing(false);
        cellPos1_0.setPrefHeight(121.0);
        cellPos1_0.setPrefWidth(118.0);
        cellPos1_0.setFont(new Font("Bauhaus 93", 64.0));
        cellPos1_0.setCursor(Cursor.HAND);
        cellPos1_0.setId("3");

        colorAdjust4.setBrightness(-0.02);
        colorAdjust4.setContrast(0.19);
        colorAdjust4.setHue(-0.04);
        colorAdjust4.setSaturation(0.25);
        cellPos1_0.setEffect(colorAdjust4);

        GridPane.setColumnIndex(cellPos2_2, 2);
        GridPane.setRowIndex(cellPos2_2, 2);
        cellPos2_2.setMnemonicParsing(false);
        cellPos2_2.setPrefHeight(121.0);
        cellPos2_2.setPrefWidth(118.0);
        cellPos2_2.setFont(new Font("Bauhaus 93", 64.0));
        cellPos2_2.setCursor(Cursor.HAND);
        cellPos2_2.setId("8");

        colorAdjust5.setBrightness(-0.02);
        colorAdjust5.setContrast(0.19);
        colorAdjust5.setHue(-0.04);
        colorAdjust5.setSaturation(0.25);
        cellPos2_2.setEffect(colorAdjust5);
        cellPos2_2.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(cellPos0_1, 1);
        cellPos0_1.setMnemonicParsing(false);
        cellPos0_1.setPrefHeight(121.0);
        cellPos0_1.setPrefWidth(118.0);
        cellPos0_1.setFont(new Font("Bauhaus 93", 64.0));
        cellPos0_1.setCursor(Cursor.HAND);
        cellPos0_1.setId("1");
        colorAdjust6.setBrightness(-0.02);
        colorAdjust6.setContrast(0.19);
        colorAdjust6.setHue(-0.04);
        colorAdjust6.setSaturation(0.25);
        cellPos0_1.setEffect(colorAdjust6);

        GridPane.setRowIndex(cellPos2_0, 2);
        cellPos2_0.setMnemonicParsing(false);
        cellPos2_0.setPrefHeight(121.0);
        cellPos2_0.setPrefWidth(118.0);
        cellPos2_0.setFont(new Font("Bauhaus 93", 64.0));
        cellPos2_0.setCursor(Cursor.HAND);
        cellPos2_0.setId("6");

        colorAdjust7.setBrightness(-0.02);
        colorAdjust7.setContrast(0.19);
        colorAdjust7.setHue(-0.04);
        colorAdjust7.setSaturation(0.25);
        cellPos2_0.setEffect(colorAdjust7);
        GridPane.setMargin(cellPos2_0, new Insets(0.0));
        cellPos2_0.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        setCenter(anchorPane1);

        anchorPane0.getChildren().add(backBtn);
        anchorPane0.getChildren().add(rematchBtn);
        anchorPane0.getChildren().add(homeBtn);
        anchorPane0.getChildren().add(playerTwoUserNameLTxt);
        anchorPane0.getChildren().add(toeLTxt);
        anchorPane0.getChildren().add(aLTxt);
        anchorPane0.getChildren().add(ticLTxt);
        anchorPane0.getChildren().add(playerOneUserNameLValueTxt);
        anchorPane0.getChildren().add(recordToggleBtn);
        anchorPane0.getChildren().add(recordTxt);
        anchorPane.getChildren().add(anchorPane0);
        anchorPane2.getChildren().add(playerTwoUserNameRTxt);
        anchorPane2.getChildren().add(toeRTxt);
        anchorPane2.getChildren().add(aRTxt);
        anchorPane2.getChildren().add(ticRTxt);
        anchorPane2.getChildren().add(soundToggleBtn);
        anchorPane2.getChildren().add(soundTxt);
        anchorPane2.getChildren().add(playerOneUserNameRValueTxt);
        xoGridPane.getColumnConstraints().add(columnConstraints);
        xoGridPane.getColumnConstraints().add(columnConstraints0);
        xoGridPane.getColumnConstraints().add(columnConstraints1);
        xoGridPane.getRowConstraints().add(rowConstraints);
        xoGridPane.getRowConstraints().add(rowConstraints0);
        xoGridPane.getRowConstraints().add(rowConstraints1);
        xoGridPane.getChildren().add(xoRectangle);
        xoGridPane.getChildren().add(cellPos2_1);
        xoGridPane.getChildren().add(cellPos1_1);
        xoGridPane.getChildren().add(cellPos0_0);
        xoGridPane.getChildren().add(cellPos1_2);
        xoGridPane.getChildren().add(cellPos0_2);
        xoGridPane.getChildren().add(cellPos1_0);
        xoGridPane.getChildren().add(cellPos2_2);
        xoGridPane.getChildren().add(cellPos0_1);
        xoGridPane.getChildren().add(cellPos2_0);
        anchorPane2.getChildren().add(xoGridPane);
        anchorPane1.getChildren().add(anchorPane2);

        buttonsBoard = new ArrayList<>(Arrays.asList(cellPos0_0, cellPos0_1, cellPos0_2, cellPos1_0, cellPos1_1, cellPos1_2, cellPos2_0, cellPos2_1, cellPos2_2));

        Button[][] buttonsBoardArray = new Button[3][3];
        int index = 0;
 
        for (int row = 0; row < buttonsBoardArray.length; row++) {
             
            for (int col = 0; col < buttonsBoardArray[row].length; col++) {
                buttonsBoardArray[row][col] = buttonsBoard.get(index++);
            }
        }

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
                ComputerLevelPage root = new ComputerLevelPage();
                Scene scene = new Scene(root);
                TicTacToeClient.stage.setScene(scene);
             }
        });

        rematchBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                newGame();
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

        if (mode == Difficulty.EASY) {
            buttonsBoard.forEach((button) -> {
                setButtonsMouseListener(button, xoState);
            });

            gameManager = new GameManager(playerName);
            newGame();
            if (xoState == xOrO.O) {
                generateCompStep(xoState);
            }
        } else if (mode == Difficulty.MEDIUM) {
 
        } else if (mode == Difficulty.HARD) {
            if (xoState == xOrO.O) {
                gameManager = new GameManager(playerName);
                newGame();
                generateCompStep(xoState);
            }
            for (Button[] row : buttonsBoardArray) {
                for (Button cell : row) {
                    setupButton(cell, buttonsBoardArray);
                    cell.setFocusTraversable(false);
                }

            }
        }
    }

    public void generateCompStep(xOrO state) {
        int compStep = new Random().nextInt(9);

        while (gameManager.getCell(compStep).state != CellState.EMPTY) {
            compStep = new Random().nextInt(9);
        }
        if (state == xOrO.X) {
            gameManager.setCell(compStep, CellState.OSTATE);
            buttonsBoard.get(compStep).setText(gameManager.getCell(compStep).state.getCellState());
            buttonsBoard.get(compStep).setMouseTransparent(true);
            if (gameManager.isPlayerOWon()) {
                setTextDisabled();
            }
        } else {
            gameManager.setCell(compStep, CellState.XSTATE);
            buttonsBoard.get(compStep).setText(gameManager.getCell(compStep).state.getCellState());
            buttonsBoard.get(compStep).setMouseTransparent(true);
            if (gameManager.isPlayerXWon()) {
                setTextDisabled();
            }
        }

    }

    public void setButtonsMouseListener(Button button, xOrO state) {

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                int index = Integer.parseInt(button.getId());
                if (state == xOrO.O) {
                    gameManager.setCell(index, CellState.OSTATE);
                    button.setText(gameManager.getCell(index).state.getCellState());
                    button.setMouseTransparent(true);
                    if (gameManager.isDraw()) {
                        showGameState("The Ended With Draw!!");
                    } else if (gameManager.isPlayerOWon()) {
                        showGameState("You Won!!");
                        setTextDisabled();
                    } else {
                        generateCompStep(xOrO.O);
                    }

                } else {
                    gameManager.setCell(index, CellState.XSTATE);
                    button.setText(gameManager.getCell(index).state.getCellState());
                    button.setMouseTransparent(true);
                    if (gameManager.isPlayerXWon()) {
                        showGameState("You Won!!");
                        setTextDisabled();
                    } else if (gameManager.isDraw()) {
                        showGameState("The Ended With Draw!!");
                    } else {
                        generateCompStep(xOrO.X);
                    }
                }

            }

        });
    }

    private void setTextEnabled() {
        for (int i = 0; i < buttonsBoard.size(); i++) {
            buttonsBoard.get(i).setDisable(false);
        }
    }

    private void setTextDisabled() {
        for (int i = 0; i < buttonsBoard.size(); i++) {
            buttonsBoard.get(i).setDisable(true);
        }
    }

    void newGame() {
        gameManager.newGame();
        //for()
        //button.setText(gameManager.getCell(index).state.getCellState());
        for (int i = 0; i < buttonsBoard.size(); i++) {
            buttonsBoard.get(i).setText("");
            setTextEnabled();
            buttonsBoard.get(i).setMouseTransparent(false);
        }
    }

 
    void showGameState(String txt) {
        //this section concern to show a winning video when the player x won 
        if (gameManager.isPlayerXWon()) {
            // show the game over video
            Stage dialogStage = new Stage();
            dialogStage.initModality(Modality.APPLICATION_MODAL);

            File videoFile = new File("src\\tictactoeclient\\sounds\\winnerVideo.mp4");
            Media media = new Media(videoFile.toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            MediaView mediaView = new MediaView(mediaPlayer);
            StackPane root = new StackPane();
            root.getChildren().add(mediaView);

            Scene scene = new Scene(root, 640, 360);

            dialogStage.setTitle("Winner");
            dialogStage.setScene(scene);
            dialogStage.show();

            mediaPlayer.play();
            mediaPlayer.setOnEndOfMedia(()
                    -> {
                mediaPlayer.stop();
                dialogStage.close();
            });
            dialogStage.setOnCloseRequest(event
                    -> {
                mediaPlayer.stop();
            });
        }
 
    }

    //////////////////////////////////////////// End of morad Code And Start of Nasr Code //////////////////////
    public int minimax(Button board[][], int depth, boolean isMaximizing, boolean fristTime) {
        int result = checkWinner(board);
        if (depth == 0 || result != 1) {//depth ==0 out
            return result;
        }
        if (isMaximizing) {
            //in maxmizing
            int finalScore = -10;
            int finalI = 0, finalJ = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j].getText().equals("")) {
                        board[i][j].setText("X");
                        int score = minimax(board, depth - 1, false, false);
                        board[i][j].setText("");
                        if (score > finalScore) {
                            finalScore = score;
                            finalI = i;
                            finalJ = j;
                        }
                        if (fristTime) {
                            //System.out.println("score= " + score + ":: i= " + i + " :: j= " + j);
                        }
                    }
                }
            }
            if (fristTime) {
                board[finalI][finalJ].setText("O");
                board[finalI][finalJ].setDisable(true);
            }
            return finalScore;
        } else {
            //in minimizing
            int finalScore = 10;
            int finalI = 0, finalJ = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j].getText().equals("")) {
                        board[i][j].setText("O");
                        int score = minimax(board, depth - 1, true, false);
                        board[i][j].setText("");
                        if (score < finalScore) {
                            finalScore = score;
                            finalI = i;
                            finalJ = j;
                        }
                        if (fristTime) {
                            //System.out.println("score= " + score + ":: i= " + i + " :: j= " + j);
                        }
                    }
                }

            }
            if (fristTime) {
                board[finalI][finalJ].setText("O");
                board[finalI][finalJ].setDisable(true);
            }
            return finalScore;
        }
    }

    boolean haveTheSameValueAndNotEmpty(String x, String y, String z) {
        boolean checker = false;
        if ((x.equals(y)) && (x.equals(z)) && (y.equals(z)) && !x.equals("")) {
            checker = true;
        }
        return checker;
    }

    int checkWinner(Button[][] board) {
 
        //  2: X winner
        // -2: O winner
        //  0: Tie
        //  1: No winner and game not finish

        // For rows
        for (int i = 0; i < 3; i++) {
            if (haveTheSameValueAndNotEmpty(board[i][0].getText(), board[i][1].getText(), board[i][2].getText())) {

                return (board[i][0].getText().equals("X") ? 2 : -2);
            }
        }

        // For columns
        for (int i = 0; i < 3; i++) {
            if (haveTheSameValueAndNotEmpty(board[0][i].getText(), board[1][i].getText(), board[2][i].getText())) {
                return (board[0][i].getText().equals("X") ? 2 : -2);
            }
        }

        // Diagonal 1
        if (haveTheSameValueAndNotEmpty(board[0][0].getText(), board[1][1].getText(), board[2][2].getText())) {
            return (board[0][0].getText().equals("X") ? 2 : -2);
        }

        // Diagonal 2
        if (haveTheSameValueAndNotEmpty(board[0][2].getText(), board[1][1].getText(), board[2][0].getText())) {
            return (board[0][2].getText().equals("X") ? 2 : -2);
        }

        boolean tie = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].getText().equals("")) {
                    tie = false;
                }
            }
        }
        if (tie) {
            return 0;
        }

        // Else
        return 1;
    }

    private void setupButton(Button cellBtn, Button[][] cells) {
        cellBtn.setOnMouseClicked(mouseEvent -> {
            if (!hasWinner) {
                if (cellBtn.getText().equals("")) {
                    cellBtn.setText("X");
                    cellBtn.setDisable(true);

                    int result = minimax(cells, 100, false, true);
                    //System.out.println("result= " + result);

                    hasWinner = checkWinner(cells) != 1;

                    //game will contain when checkWinner return 1 as still
                } else {
                    System.out.println("The field is not empty \n");
                }
            }
            int result = checkWinner(cells);
            if (result == 0) {
                // System.out.println("Tie \n");
            } else {
                if (result == 2) {
                    //  System.out.println("X is winner");
                } else if (result == -2) {

                    // System.out.println("O is winner");
                } else {
                    // System.out.println("No winner yet");
                }
            }
        });
    }

}
