package tictactoe;

import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class RecordsLoadPage extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Glow glow;
    protected final Button backBtn;
    protected final DropShadow dropShadow;
    protected final Button loadeBtn;
    protected final DropShadow dropShadow0;
    protected final Button homeBtn;
    protected final DropShadow dropShadow1;
    protected final Text text;
    protected final TableView list;
    protected final TableColumn opponent;
    protected final TableColumn date;
    protected final AnchorPane anchorPane0;
    protected final Glow glow0;
    protected final Text playerTwoUserNameValueTxt;
    protected final Text text0;
    protected final Text text1;
    protected final Text text2;
    protected final Text text3;
    protected final Text playerOneUserNameValueTxt;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Rectangle rectangle;
    protected final Blend blend;
    protected final Reflection reflection;
    protected final Button CellPos2_1;
    protected final ColorAdjust colorAdjust;
    protected final Button CellPos1_1;
    protected final ColorAdjust colorAdjust0;
    protected final Button CellPos0_0;
    protected final ColorAdjust colorAdjust1;
    protected final Button CellPos1_2;
    protected final ColorAdjust colorAdjust2;
    protected final Button CellPos0_2;
    protected final ColorAdjust colorAdjust3;
    protected final Button CellPos1_0;
    protected final ColorAdjust colorAdjust4;
    protected final Button CellPos2_2;
    protected final ColorAdjust colorAdjust5;
    protected final Button CellPos0_1;
    protected final ColorAdjust colorAdjust6;
    protected final Button CellPos2_0;
    protected final ColorAdjust colorAdjust7;
    protected final ToggleButton soundBtn;

    public RecordsLoadPage() {

        anchorPane = new AnchorPane();
        glow = new Glow();
        backBtn = new Button();
        dropShadow = new DropShadow();
        loadeBtn = new Button();
        dropShadow0 = new DropShadow();
        homeBtn = new Button();
        dropShadow1 = new DropShadow();
        text = new Text();
        list = new TableView();
        opponent = new TableColumn();
        date = new TableColumn();
        anchorPane0 = new AnchorPane();
        glow0 = new Glow();
        playerTwoUserNameValueTxt = new Text();
        text0 = new Text();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        playerOneUserNameValueTxt = new Text();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rectangle = new Rectangle();
        blend = new Blend();
        reflection = new Reflection();
        CellPos2_1 = new Button();
        colorAdjust = new ColorAdjust();
        CellPos1_1 = new Button();
        colorAdjust0 = new ColorAdjust();
        CellPos0_0 = new Button();
        colorAdjust1 = new ColorAdjust();
        CellPos1_2 = new Button();
        colorAdjust2 = new ColorAdjust();
        CellPos0_2 = new Button();
        colorAdjust3 = new ColorAdjust();
        CellPos1_0 = new Button();
        colorAdjust4 = new ColorAdjust();
        CellPos2_2 = new Button();
        colorAdjust5 = new ColorAdjust();
        CellPos0_1 = new Button();
        colorAdjust6 = new ColorAdjust();
        CellPos2_0 = new Button();
        colorAdjust7 = new ColorAdjust();
        soundBtn = new ToggleButton();

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

        loadeBtn.setLayoutX(120.0);
        loadeBtn.setLayoutY(360.0);
        loadeBtn.setMnemonicParsing(false);
        loadeBtn.setPrefHeight(38.0);
        loadeBtn.setPrefWidth(110.0);
        loadeBtn.setStyle("-fx-background-color: #ffffff;");
        loadeBtn.setText("load");
        loadeBtn.setFont(new Font("Bauhaus 93", 19.0));

        loadeBtn.setEffect(dropShadow0);

        homeBtn.setLayoutX(250.0);
        homeBtn.setLayoutY(636.0);
        homeBtn.setMnemonicParsing(false);
        homeBtn.setPrefHeight(38.0);
        homeBtn.setPrefWidth(85.0);
        homeBtn.setStyle("-fx-background-color: #ffffff;");
        homeBtn.setText("Home");
        homeBtn.setFont(new Font("Bauhaus 93", 19.0));

        homeBtn.setEffect(dropShadow1);

        text.setLayoutX(97.0);
        text.setLayoutY(56.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Games-List");
        text.setFont(new Font("System Bold", 30.0));

        list.setLayoutX(55.0);
        list.setLayoutY(114.0);
        list.setPrefHeight(226.0);
        list.setPrefWidth(240.0);

        opponent.setPrefWidth(75.0);
        opponent.setText("Oppenent");

        date.setPrefWidth(75.0);
        date.setText("Date");
        list.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        anchorPane0.setEffect(glow0);

        playerTwoUserNameValueTxt.setLayoutX(453.0);
        playerTwoUserNameValueTxt.setLayoutY(184.0);
        playerTwoUserNameValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoUserNameValueTxt.setStrokeWidth(0.0);
        playerTwoUserNameValueTxt.setText("player");
        playerTwoUserNameValueTxt.setWrappingWidth(136.640625);
        playerTwoUserNameValueTxt.setFont(new Font(50.0));

        text0.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        text0.setLayoutX(312.0);
        text0.setLayoutY(82.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("T     O     E");
        text0.setFont(new Font(50.0));

        text1.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        text1.setLayoutX(309.0);
        text1.setLayoutY(136.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("A");
        text1.setFont(new Font(50.0));

        text2.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        text2.setLayoutX(224.0);
        text2.setLayoutY(187.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("T     I     C");
        text2.setFont(new Font(50.0));

        text3.setLayoutX(410.0);
        text3.setLayoutY(692.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setText("Sound");
        text3.setFont(new Font("Bauhaus 93", 30.0));

        playerOneUserNameValueTxt.setLayoutX(170.0);
        playerOneUserNameValueTxt.setLayoutY(79.0);
        playerOneUserNameValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneUserNameValueTxt.setStrokeWidth(0.0);
        playerOneUserNameValueTxt.setText("player");
        playerOneUserNameValueTxt.setFont(new Font(50.0));

        gridPane.setHgap(10.0);
        gridPane.setLayoutX(143.0);
        gridPane.setLayoutY(219.0);
        gridPane.setPrefHeight(390.0);
        gridPane.setPrefWidth(390.0);
        gridPane.setVgap(10.0);

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
        gridPane.setPadding(new Insets(10.0));

        GridPane.setColumnSpan(rectangle, 3);
        GridPane.setRowSpan(rectangle, 3);
        rectangle.setArcHeight(20.0);
        rectangle.setArcWidth(20.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#f27b7a"));
        rectangle.setHeight(390.0);
        rectangle.setOpacity(0.55);
        rectangle.setStroke(javafx.scene.paint.Color.valueOf("#f2cdcd"));
        rectangle.setStrokeLineCap(javafx.scene.shape.StrokeLineCap.ROUND);
        rectangle.setStrokeLineJoin(javafx.scene.shape.StrokeLineJoin.ROUND);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setTranslateX(-10.0);
        rectangle.setWidth(390.0);

        blend.setMode(javafx.scene.effect.BlendMode.LIGHTEN);
        blend.setOpacity(0.0);

        blend.setTopInput(reflection);
        rectangle.setEffect(blend);

        GridPane.setColumnIndex(CellPos2_1, 1);
        GridPane.setRowIndex(CellPos2_1, 2);
        CellPos2_1.setMnemonicParsing(false);
        CellPos2_1.setPrefHeight(107.0);
        CellPos2_1.setPrefWidth(118.0);
        CellPos2_1.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust.setBrightness(-0.02);
        colorAdjust.setContrast(0.19);
        colorAdjust.setHue(-0.04);
        colorAdjust.setSaturation(0.25);
        CellPos2_1.setEffect(colorAdjust);
        CellPos2_1.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(CellPos1_1, 1);
        GridPane.setRowIndex(CellPos1_1, 1);
        CellPos1_1.setMnemonicParsing(false);
        CellPos1_1.setPrefHeight(121.0);
        CellPos1_1.setPrefWidth(118.0);
        CellPos1_1.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust0.setBrightness(-0.02);
        colorAdjust0.setContrast(0.19);
        colorAdjust0.setHue(-0.04);
        colorAdjust0.setSaturation(0.25);
        CellPos1_1.setEffect(colorAdjust0);

        CellPos0_0.setMnemonicParsing(false);
        CellPos0_0.setPrefHeight(121.0);
        CellPos0_0.setPrefWidth(118.0);
        CellPos0_0.setText("x");
        CellPos0_0.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust1.setBrightness(-0.02);
        colorAdjust1.setContrast(0.19);
        colorAdjust1.setHue(-0.04);
        colorAdjust1.setSaturation(0.25);
        CellPos0_0.setEffect(colorAdjust1);

        GridPane.setColumnIndex(CellPos1_2, 2);
        GridPane.setRowIndex(CellPos1_2, 1);
        CellPos1_2.setMnemonicParsing(false);
        CellPos1_2.setPrefHeight(121.0);
        CellPos1_2.setPrefWidth(118.0);
        CellPos1_2.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust2.setBrightness(-0.02);
        colorAdjust2.setContrast(0.19);
        colorAdjust2.setHue(-0.04);
        colorAdjust2.setSaturation(0.25);
        CellPos1_2.setEffect(colorAdjust2);

        GridPane.setColumnIndex(CellPos0_2, 2);
        CellPos0_2.setCache(true);
        CellPos0_2.setMnemonicParsing(false);
        CellPos0_2.setPrefHeight(121.0);
        CellPos0_2.setPrefWidth(118.0);
        CellPos0_2.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust3.setBrightness(-0.02);
        colorAdjust3.setContrast(0.19);
        colorAdjust3.setHue(-0.04);
        colorAdjust3.setSaturation(0.25);
        CellPos0_2.setEffect(colorAdjust3);
        CellPos0_2.setCursor(Cursor.HAND);

        GridPane.setRowIndex(CellPos1_0, 1);
        CellPos1_0.setMnemonicParsing(false);
        CellPos1_0.setPrefHeight(121.0);
        CellPos1_0.setPrefWidth(118.0);
        CellPos1_0.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust4.setBrightness(-0.02);
        colorAdjust4.setContrast(0.19);
        colorAdjust4.setHue(-0.04);
        colorAdjust4.setSaturation(0.25);
        CellPos1_0.setEffect(colorAdjust4);

        GridPane.setColumnIndex(CellPos2_2, 2);
        GridPane.setRowIndex(CellPos2_2, 2);
        CellPos2_2.setMnemonicParsing(false);
        CellPos2_2.setPrefHeight(107.0);
        CellPos2_2.setPrefWidth(118.0);
        CellPos2_2.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust5.setBrightness(-0.02);
        colorAdjust5.setContrast(0.19);
        colorAdjust5.setHue(-0.04);
        colorAdjust5.setSaturation(0.25);
        CellPos2_2.setEffect(colorAdjust5);
        CellPos2_2.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(CellPos0_1, 1);
        CellPos0_1.setMnemonicParsing(false);
        CellPos0_1.setPrefHeight(121.0);
        CellPos0_1.setPrefWidth(118.0);
        CellPos0_1.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust6.setBrightness(-0.02);
        colorAdjust6.setContrast(0.19);
        colorAdjust6.setHue(-0.04);
        colorAdjust6.setSaturation(0.25);
        CellPos0_1.setEffect(colorAdjust6);

        GridPane.setRowIndex(CellPos2_0, 2);
        CellPos2_0.setMnemonicParsing(false);
        CellPos2_0.setPrefHeight(107.0);
        CellPos2_0.setPrefWidth(118.0);
        CellPos2_0.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust7.setBrightness(-0.02);
        colorAdjust7.setContrast(0.19);
        colorAdjust7.setHue(-0.04);
        colorAdjust7.setSaturation(0.25);
        CellPos2_0.setEffect(colorAdjust7);
        GridPane.setMargin(CellPos2_0, new Insets(0.0));
        CellPos2_0.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        soundBtn.setLayoutX(514.0);
        soundBtn.setLayoutY(665.0);
        soundBtn.setMnemonicParsing(false);
        soundBtn.setPrefHeight(36.0);
        soundBtn.setPrefWidth(72.0);
        soundBtn.setText("Off");
        soundBtn.setFont(new Font(19.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(backBtn);
        anchorPane.getChildren().add(loadeBtn);
        anchorPane.getChildren().add(homeBtn);
        anchorPane.getChildren().add(text);
        list.getColumns().add(opponent);
        list.getColumns().add(date);
        anchorPane.getChildren().add(list);
        anchorPane0.getChildren().add(playerTwoUserNameValueTxt);
        anchorPane0.getChildren().add(text0);
        anchorPane0.getChildren().add(text1);
        anchorPane0.getChildren().add(text2);
        anchorPane0.getChildren().add(text3);
        anchorPane0.getChildren().add(playerOneUserNameValueTxt);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(rectangle);
        gridPane.getChildren().add(CellPos2_1);
        gridPane.getChildren().add(CellPos1_1);
        gridPane.getChildren().add(CellPos0_0);
        gridPane.getChildren().add(CellPos1_2);
        gridPane.getChildren().add(CellPos0_2);
        gridPane.getChildren().add(CellPos1_0);
        gridPane.getChildren().add(CellPos2_2);
        gridPane.getChildren().add(CellPos0_1);
        gridPane.getChildren().add(CellPos2_0);
        anchorPane0.getChildren().add(gridPane);
        anchorPane0.getChildren().add(soundBtn);

    }
}
