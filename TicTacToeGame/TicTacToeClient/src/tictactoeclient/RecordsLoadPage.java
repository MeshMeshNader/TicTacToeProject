package tictactoeclient;

import java.io.File;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.ToggleButton;
import javafx.scene.effect.Blend;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.RowConstraints;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RecordsLoadPage extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Glow glow;
    protected final Button backBtn;
    protected final DropShadow dropShadow;
    protected final Button loadBtn;
    protected final DropShadow dropShadow0;
    protected final Button homeBtn;
    protected final DropShadow dropShadow1;
    protected final Text gameListTxt;
    protected ListView RecordListView = new ListView<>();
    ;
    protected final AnchorPane anchorPane0;
    protected final Glow glow0;
    protected final Text soundTxt;
    protected final GridPane xoGridBane;
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
    protected final Text playerOneUserNameRValueTxt;
    protected final Text toeRightTxt;
    protected final Text aRightTxt;
    protected final Text ticRightTxt;
    protected final Text playerTwoUserNameRValueTxt;
    protected final ToggleButton soundToggleBtn;
    protected final DropShadow dropShadow2;

    Stage parentStage;
    int indexToFullREcord = 0;
    int indextocell = 0;
    int indexGame = -1;
    ArrayList<OfflineGameDTO> listOfrecord = new ArrayList<>();
    Button[][] cellsBtn;

    Thread th = new Thread();

    public RecordsLoadPage(Stage stage, ArrayList<OfflineGameDTO> listOfrecord) {
        this.listOfrecord = listOfrecord;
        parentStage = stage;
        anchorPane = new AnchorPane();
        glow = new Glow();
        backBtn = new Button();
        dropShadow = new DropShadow();
        loadBtn = new Button();
        dropShadow0 = new DropShadow();
        homeBtn = new Button();
        dropShadow1 = new DropShadow();
        gameListTxt = new Text();
        RecordListView = new ListView();
        anchorPane0 = new AnchorPane();
        glow0 = new Glow();
        soundTxt = new Text();
        xoGridBane = new GridPane();
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
        playerOneUserNameRValueTxt = new Text();
        toeRightTxt = new Text();
        aRightTxt = new Text();
        ticRightTxt = new Text();
        playerTwoUserNameRValueTxt = new Text();
        soundToggleBtn = new ToggleButton();
        dropShadow2 = new DropShadow();

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

        backBtn.setLayoutX(15.0);
        backBtn.setLayoutY(636.0);
        backBtn.setMnemonicParsing(false);
        backBtn.setPrefHeight(38.0);
        backBtn.setPrefWidth(85.0);
        backBtn.setStyle("-fx-background-color: #ffffff;");
        backBtn.setText("Back");
        backBtn.setFont(new Font("Bauhaus 93", 19.0));

        backBtn.setEffect(dropShadow);

        loadBtn.setLayoutX(121.0);
        loadBtn.setLayoutY(389.0);
        loadBtn.setMnemonicParsing(false);
        loadBtn.setPrefHeight(38.0);
        loadBtn.setPrefWidth(110.0);
        loadBtn.setStyle("-fx-background-color: #ffffff;");
        loadBtn.setText("load");
        loadBtn.setFont(new Font("Bauhaus 93", 19.0));

        loadBtn.setEffect(dropShadow0);

        homeBtn.setLayoutX(250.0);
        homeBtn.setLayoutY(636.0);
        homeBtn.setMnemonicParsing(false);
        homeBtn.setPrefHeight(38.0);
        homeBtn.setPrefWidth(85.0);
        homeBtn.setStyle("-fx-background-color: #ffffff;");
        homeBtn.setText("Home");
        homeBtn.setFont(new Font("Bauhaus 93", 19.0));

        homeBtn.setEffect(dropShadow1);

        gameListTxt.setLayoutX(97.0);
        gameListTxt.setLayoutY(56.0);
        gameListTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        gameListTxt.setStrokeWidth(0.0);
        gameListTxt.setText("Games-List");
        gameListTxt.setFont(new Font("Bauhaus 93", 36.0));

        RecordListView.setLayoutX(30.0);
        RecordListView.setLayoutY(90.0);
        RecordListView.setPrefHeight(258.0);
        RecordListView.setPrefWidth(280.0);
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        anchorPane0.setEffect(glow0);

        soundTxt.setLayoutX(410.0);
        soundTxt.setLayoutY(692.0);
        soundTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        soundTxt.setStrokeWidth(0.0);
        soundTxt.setText("Sound");
        soundTxt.setFont(new Font("Bauhaus 93", 30.0));

        xoGridBane.setHgap(10.0);
        xoGridBane.setLayoutX(143.0);
        xoGridBane.setLayoutY(219.0);
        xoGridBane.setPrefHeight(390.0);
        xoGridBane.setPrefWidth(390.0);
        xoGridBane.setVgap(10.0);

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
        xoGridBane.setPadding(new Insets(10.0));

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
        cellPos2_1.setPrefHeight(107.0);
        cellPos2_1.setPrefWidth(118.0);
        cellPos2_1.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust.setBrightness(-0.02);
        colorAdjust.setContrast(0.19);
        colorAdjust.setHue(-0.04);
        colorAdjust.setSaturation(0.25);
        cellPos2_1.setEffect(colorAdjust);
        cellPos2_1.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(cellPos1_1, 1);
        GridPane.setRowIndex(cellPos1_1, 1);
        cellPos1_1.setMnemonicParsing(false);
        cellPos1_1.setPrefHeight(121.0);
        cellPos1_1.setPrefWidth(118.0);
        cellPos1_1.setFont(new Font("Bauhaus 93", 64.0));
        cellPos1_1.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        colorAdjust0.setBrightness(-0.02);
        colorAdjust0.setContrast(0.19);
        colorAdjust0.setHue(-0.04);
        colorAdjust0.setSaturation(0.25);
        cellPos1_1.setEffect(colorAdjust0);

        cellPos0_0.setMnemonicParsing(false);
        cellPos0_0.setPrefHeight(121.0);
        cellPos0_0.setPrefWidth(118.0);
        cellPos0_0.setText("");
        cellPos0_0.setFont(new Font("Bauhaus 93", 64.0));
        cellPos0_0.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        colorAdjust1.setBrightness(-0.02);
        colorAdjust1.setContrast(0.19);
        colorAdjust1.setHue(-0.04);
        colorAdjust1.setSaturation(0.25);
        cellPos0_0.setEffect(colorAdjust1);

        GridPane.setColumnIndex(cellPos1_2, 2);
        GridPane.setRowIndex(cellPos1_2, 1);
        cellPos1_2.setMnemonicParsing(false);
        cellPos1_2.setPrefHeight(121.0);
        cellPos1_2.setPrefWidth(118.0);
        cellPos1_2.setFont(new Font("Bauhaus 93", 64.0));
        cellPos1_2.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
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
        cellPos0_2.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        colorAdjust3.setBrightness(-0.02);
        colorAdjust3.setContrast(0.19);
        colorAdjust3.setHue(-0.04);
        colorAdjust3.setSaturation(0.25);
        cellPos0_2.setEffect(colorAdjust3);
        cellPos0_2.setCursor(Cursor.HAND);

        GridPane.setRowIndex(cellPos1_0, 1);
        cellPos1_0.setMnemonicParsing(false);
        cellPos1_0.setPrefHeight(121.0);
        cellPos1_0.setPrefWidth(118.0);
        cellPos1_0.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust4.setBrightness(-0.02);
        colorAdjust4.setContrast(0.19);
        colorAdjust4.setHue(-0.04);
        colorAdjust4.setSaturation(0.25);
        cellPos1_0.setEffect(colorAdjust4);
        cellPos1_0.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        GridPane.setColumnIndex(cellPos2_2, 2);
        GridPane.setRowIndex(cellPos2_2, 2);
        cellPos2_2.setMnemonicParsing(false);
        cellPos2_2.setPrefHeight(107.0);
        cellPos2_2.setPrefWidth(118.0);
        cellPos2_2.setFont(new Font("Bauhaus 93", 64.0));

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
        cellPos0_1.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        colorAdjust6.setBrightness(-0.02);
        colorAdjust6.setContrast(0.19);
        colorAdjust6.setHue(-0.04);
        colorAdjust6.setSaturation(0.25);
        cellPos0_1.setEffect(colorAdjust6);

        GridPane.setRowIndex(cellPos2_0, 2);
        cellPos2_0.setMnemonicParsing(false);
        cellPos2_0.setPrefHeight(107.0);
        cellPos2_0.setPrefWidth(118.0);
        cellPos2_0.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust7.setBrightness(-0.02);
        colorAdjust7.setContrast(0.19);
        colorAdjust7.setHue(-0.04);
        colorAdjust7.setSaturation(0.25);
        cellPos2_0.setEffect(colorAdjust7);
        GridPane.setMargin(cellPos2_0, new Insets(0.0));
        cellPos2_0.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        playerOneUserNameRValueTxt.setLayoutX(225.0);
        playerOneUserNameRValueTxt.setLayoutY(81.0);
        playerOneUserNameRValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneUserNameRValueTxt.setStrokeWidth(0.0);
        playerOneUserNameRValueTxt.setText("player");
        playerOneUserNameRValueTxt.setFont(new Font("Bauhaus 93", 24.0));

        toeRightTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        toeRightTxt.setLayoutX(312.0);
        toeRightTxt.setLayoutY(82.0);
        toeRightTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeRightTxt.setStrokeWidth(0.0);
        toeRightTxt.setText("T     O     E");
        toeRightTxt.setFont(new Font("Bauhaus 93", 24.0));

        aRightTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        aRightTxt.setLayoutX(311.0);
        aRightTxt.setLayoutY(122.0);
        aRightTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aRightTxt.setStrokeWidth(0.0);
        aRightTxt.setText("A");
        aRightTxt.setFont(new Font("Bauhaus 93", 24.0));

        ticRightTxt.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        ticRightTxt.setLayoutX(229.0);
        ticRightTxt.setLayoutY(159.0);
        ticRightTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticRightTxt.setStrokeWidth(0.0);
        ticRightTxt.setText("T     I     C");
        ticRightTxt.setFont(new Font("Bauhaus 93", 24.0));

        playerTwoUserNameRValueTxt.setLayoutX(351.0);
        playerTwoUserNameRValueTxt.setLayoutY(157.0);
        playerTwoUserNameRValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoUserNameRValueTxt.setStrokeWidth(0.0);
        playerTwoUserNameRValueTxt.setText("player");
        playerTwoUserNameRValueTxt.setFont(new Font("Bauhaus 93", 24.0));

        soundToggleBtn.setLayoutX(512.0);
        soundToggleBtn.setLayoutY(660.0);
        soundToggleBtn.setMnemonicParsing(false);
        soundToggleBtn.setPrefHeight(42.0);
        soundToggleBtn.setPrefWidth(130.0);

        soundToggleBtn.setText("On");

        soundToggleBtn.setEffect(dropShadow2);
        soundToggleBtn.setFont(new Font("Bauhaus 93", 19.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(backBtn);
        anchorPane.getChildren().add(loadBtn);
        anchorPane.getChildren().add(homeBtn);
        anchorPane.getChildren().add(gameListTxt);
        anchorPane.getChildren().add(RecordListView);
        anchorPane0.getChildren().add(soundTxt);
        xoGridBane.getColumnConstraints().add(columnConstraints);
        xoGridBane.getColumnConstraints().add(columnConstraints0);
        xoGridBane.getColumnConstraints().add(columnConstraints1);
        xoGridBane.getRowConstraints().add(rowConstraints);
        xoGridBane.getRowConstraints().add(rowConstraints0);
        xoGridBane.getRowConstraints().add(rowConstraints1);
        xoGridBane.getChildren().add(xoRectangle);
        xoGridBane.getChildren().add(cellPos2_1);
        xoGridBane.getChildren().add(cellPos1_1);
        xoGridBane.getChildren().add(cellPos0_0);
        xoGridBane.getChildren().add(cellPos1_2);
        xoGridBane.getChildren().add(cellPos0_2);
        xoGridBane.getChildren().add(cellPos1_0);
        xoGridBane.getChildren().add(cellPos2_2);
        xoGridBane.getChildren().add(cellPos0_1);
        xoGridBane.getChildren().add(cellPos2_0);
        anchorPane0.getChildren().add(xoGridBane);
        anchorPane0.getChildren().add(playerOneUserNameRValueTxt);
        anchorPane0.getChildren().add(toeRightTxt);
        anchorPane0.getChildren().add(aRightTxt);
        anchorPane0.getChildren().add(ticRightTxt);
        anchorPane0.getChildren().add(playerTwoUserNameRValueTxt);
        anchorPane0.getChildren().add(soundToggleBtn);

        soundToggleBtn.setStyle("-fx-background-color: green;");

        cellsBtn = new Button[][]{
            {cellPos0_0, cellPos0_1, cellPos0_2},
            {cellPos1_0, cellPos1_1, cellPos1_2},
            {cellPos2_0, cellPos2_1, cellPos2_2}

        };

        tableViewElements(listOfrecord);

        RecordListView.setOnMousePressed(event -> {
            indexGame = RecordListView.getSelectionModel().getSelectedIndex();
            System.out.println("index= " + indexGame);
        });

        backBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                OfflineMenuPage root = new OfflineMenuPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });

        loadBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                unhighlightCell(cellsBtn);
                th.stop();
                getMovement(listOfrecord, indexGame);
                // Load The Record From File Chooser
            }
        });

        homeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                WelcomPage root = new WelcomPage(parentStage);
                Scene scene = new Scene(root);
                parentStage.setScene(scene);
            }
        });

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

    }

    private void unhighlightCell(Button[][] cells) {

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                Button cell = cells[i][j];
                cell.setStyle("");
                cell.setText("");
                cell.setDisable(false);
            }
        }
    }

    void getMovement(ArrayList<OfflineGameDTO> gameRecord, int indexOfRecord) {

        th = new Thread(new Runnable() {
            int order = 0;
            String shape = "X";
            ArrayList<OfflineMoveDTO> point = gameRecord.get(indexOfRecord).getRecord();

            @Override
            public void run() {
                for (int i = 0; i < point.size(); i++) {
                    if (order % 2 == 0) {
                        shape = "X";
                        order = 1;
                    } else if (order % 2 == 1) {
                        shape = "O";
                        order = 0;
                    }
                    int row = point.get(i).getRow();
                    int col = point.get(i).getCol();
                    Platform.runLater(() -> cellsBtn[row][col].setText(shape));
                    try {
                        Thread.sleep(750);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(RecordsLoadPage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        th.start();
    }

    void tableViewElements(ArrayList<OfflineGameDTO> gameRecord) {

        ObservableList<String> items = FXCollections.observableArrayList();
        RecordListView.setItems(items);
        RecordListView.setCellFactory(param -> new ListCell<String>() {
            private final HBox hbox = new HBox();
            private final Label opponentTableCol = new Label();
            private final Label dateTable = new Label();

            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    String[] parts = item.split("\\|");
                    opponentTableCol.setText(parts[0]);
                    dateTable.setText(parts[1]);
                    hbox.getChildren().addAll(opponentTableCol, dateTable);
                    setGraphic(hbox);
                }
            }
        });

        for (int i = 0; i < gameRecord.size(); i++) {
            String players = gameRecord.get(i).getUserOne() + " Vs " + gameRecord.get(i).getUserTwo();
            String date = gameRecord.get(i).getDate();
            items.add(players + " / " + " " + date);
        }
        RecordListView.refresh();
        RecordListView.setPrefHeight(200);
        RecordListView.setPrefWidth(300);
        RecordListView.setFixedCellSize(50);
        RecordListView.setStyle("-fx-control-inner-background: #f5f5f5;");
        RecordListView.setCellFactory(lv -> new ListCell<String>() {
            @Override
            public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                setText(item);
            }
        });
        RecordListView.setOrientation(Orientation.VERTICAL);
    }
}
