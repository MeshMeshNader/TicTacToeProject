package tictactoe;

import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
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

public class OnlineGameBoard extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final Glow glow;
    protected final Button backBtn;
    protected final DropShadow dropShadow;
    protected final Button rematchBtn;
    protected final DropShadow dropShadow0;
    protected final Button homeBtn;
    protected final DropShadow dropShadow1;
    protected final Text player1RightTxt;
    protected final Text toeLeftText;
    protected final Text aLeftText;
    protected final Text ticLeftText;
    protected final Text player1LeftTxt;
    protected final ToggleButton recordBtn;
    protected final DropShadow dropShadow2;
    protected final Text recordTxt;
    protected final Text player1Txt;
    protected final Text player2Txt;
    protected final Text scoreTxt;
    protected final Text player1ScoreTxt;
    protected final Text player2ScoreTxt;
    protected final AnchorPane anchorPane0;
    protected final Glow glow0;
    protected final Text player2RightTxt;
    protected final Text toeRightTxt;
    protected final Text aRightTxt;
    protected final Text ticRightTxt;
    protected final ToggleButton soundBtn;
    protected final DropShadow dropShadow3;
    protected final Text sountTxt;
    protected final Text player1RightTxt0;
    protected final GridPane grid;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Rectangle rectangle;
    protected final Blend blend;
    protected final Reflection reflection;
    protected final Button btn21;
    protected final ColorAdjust colorAdjust;
    protected final Button btn11;
    protected final ColorAdjust colorAdjust0;
    protected final Button btn00;
    protected final ColorAdjust colorAdjust1;
    protected final Button btn12;
    protected final ColorAdjust colorAdjust2;
    protected final Button btn02;
    protected final ColorAdjust colorAdjust3;
    protected final Button btn10;
    protected final ColorAdjust colorAdjust4;
    protected final Button btn22;
    protected final ColorAdjust colorAdjust5;
    protected final Button btn01;
    protected final ColorAdjust colorAdjust6;
    protected final Button btn20;
    protected final ColorAdjust colorAdjust7;

    public OnlineGameBoard() {

        anchorPane = new AnchorPane();
        glow = new Glow();
        backBtn = new Button();
        dropShadow = new DropShadow();
        rematchBtn = new Button();
        dropShadow0 = new DropShadow();
        homeBtn = new Button();
        dropShadow1 = new DropShadow();
        player1RightTxt = new Text();
        toeLeftText = new Text();
        aLeftText = new Text();
        ticLeftText = new Text();
        player1LeftTxt = new Text();
        recordBtn = new ToggleButton();
        dropShadow2 = new DropShadow();
        recordTxt = new Text();
        player1Txt = new Text();
        player2Txt = new Text();
        scoreTxt = new Text();
        player1ScoreTxt = new Text();
        player2ScoreTxt = new Text();
        anchorPane0 = new AnchorPane();
        glow0 = new Glow();
        player2RightTxt = new Text();
        toeRightTxt = new Text();
        aRightTxt = new Text();
        ticRightTxt = new Text();
        soundBtn = new ToggleButton();
        dropShadow3 = new DropShadow();
        sountTxt = new Text();
        player1RightTxt0 = new Text();
        grid = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        rectangle = new Rectangle();
        blend = new Blend();
        reflection = new Reflection();
        btn21 = new Button();
        colorAdjust = new ColorAdjust();
        btn11 = new Button();
        colorAdjust0 = new ColorAdjust();
        btn00 = new Button();
        colorAdjust1 = new ColorAdjust();
        btn12 = new Button();
        colorAdjust2 = new ColorAdjust();
        btn02 = new Button();
        colorAdjust3 = new ColorAdjust();
        btn10 = new Button();
        colorAdjust4 = new ColorAdjust();
        btn22 = new Button();
        colorAdjust5 = new ColorAdjust();
        btn01 = new Button();
        colorAdjust6 = new ColorAdjust();
        btn20 = new Button();
        colorAdjust7 = new ColorAdjust();

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

        player1RightTxt.setLayoutX(216.0);
        player1RightTxt.setLayoutY(514.0);
        player1RightTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player1RightTxt.setStrokeWidth(0.0);
        player1RightTxt.setText("player");
        player1RightTxt.setFont(new Font("Bauhaus 93", 36.0));

        toeLeftText.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        toeLeftText.setLayoutX(169.0);
        toeLeftText.setLayoutY(412.0);
        toeLeftText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeLeftText.setStrokeWidth(0.0);
        toeLeftText.setText("T     O     E");
        toeLeftText.setFont(new Font("Bauhaus 93", 36.0));

        aLeftText.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        aLeftText.setLayoutX(168.0);
        aLeftText.setLayoutY(466.0);
        aLeftText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aLeftText.setStrokeWidth(0.0);
        aLeftText.setText("A");
        aLeftText.setFont(new Font("Bauhaus 93", 36.0));

        ticLeftText.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        ticLeftText.setLayoutX(46.0);
        ticLeftText.setLayoutY(518.0);
        ticLeftText.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticLeftText.setStrokeWidth(0.0);
        ticLeftText.setText("T     I     C");
        ticLeftText.setFont(new Font("Bauhaus 93", 36.0));

        player1LeftTxt.setLayoutX(30.0);
        player1LeftTxt.setLayoutY(411.0);
        player1LeftTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player1LeftTxt.setStrokeWidth(0.0);
        player1LeftTxt.setText("player");
        player1LeftTxt.setFont(new Font("Bauhaus 93", 36.0));

        recordBtn.setLayoutX(174.0);
        recordBtn.setLayoutY(26.0);
        recordBtn.setMnemonicParsing(false);
        recordBtn.setPrefHeight(42.0);
        recordBtn.setPrefWidth(130.0);
        recordBtn.setText("On / Off");

        recordBtn.setEffect(dropShadow2);
        recordBtn.setFont(new Font("Bauhaus 93", 19.0));

        recordTxt.setLayoutX(53.0);
        recordTxt.setLayoutY(58.0);
        recordTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        recordTxt.setStrokeWidth(0.0);
        recordTxt.setText("Record");
        recordTxt.setFont(new Font("Bauhaus 93", 30.0));

        player1Txt.setLayoutX(31.0);
        player1Txt.setLayoutY(210.0);
        player1Txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player1Txt.setStrokeWidth(0.0);
        player1Txt.setText("player 1 (X) :");
        player1Txt.setFont(new Font("Bauhaus 93", 24.0));

        player2Txt.setLayoutX(31.0);
        player2Txt.setLayoutY(280.0);
        player2Txt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player2Txt.setStrokeWidth(0.0);
        player2Txt.setText("player 2 (O) :");
        player2Txt.setFont(new Font("Bauhaus 93", 24.0));

        scoreTxt.setLayoutX(31.0);
        scoreTxt.setLayoutY(149.0);
        scoreTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        scoreTxt.setStrokeWidth(0.0);
        scoreTxt.setText("Score :");
        scoreTxt.setFont(new Font("Bauhaus 93", 30.0));

        player1ScoreTxt.setLayoutX(227.0);
        player1ScoreTxt.setLayoutY(212.0);
        player1ScoreTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player1ScoreTxt.setStrokeWidth(0.0);
        player1ScoreTxt.setText("18");
        player1ScoreTxt.setFont(new Font("Bauhaus 93", 24.0));

        player2ScoreTxt.setLayoutX(227.0);
        player2ScoreTxt.setLayoutY(282.0);
        player2ScoreTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player2ScoreTxt.setStrokeWidth(0.0);
        player2ScoreTxt.setText("7");
        player2ScoreTxt.setFont(new Font("Bauhaus 93", 24.0));
        setLeft(anchorPane);

        BorderPane.setAlignment(anchorPane0, javafx.geometry.Pos.CENTER);
        anchorPane0.setPrefHeight(200.0);
        anchorPane0.setPrefWidth(200.0);

        anchorPane0.setEffect(glow0);

        player2RightTxt.setLayoutX(351.0);
        player2RightTxt.setLayoutY(157.0);
        player2RightTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player2RightTxt.setStrokeWidth(0.0);
        player2RightTxt.setText("player");
        player2RightTxt.setFont(new Font("Bauhaus 93", 24.0));

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

        soundBtn.setLayoutX(519.0);
        soundBtn.setLayoutY(656.0);
        soundBtn.setMnemonicParsing(false);
        soundBtn.setPrefHeight(42.0);
        soundBtn.setPrefWidth(130.0);
        soundBtn.setText("On / Off");

        soundBtn.setEffect(dropShadow3);
        soundBtn.setFont(new Font("Bauhaus 93", 19.0));

        sountTxt.setLayoutX(410.0);
        sountTxt.setLayoutY(692.0);
        sountTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        sountTxt.setStrokeWidth(0.0);
        sountTxt.setText("Sound");
        sountTxt.setFont(new Font("Bauhaus 93", 30.0));

        player1RightTxt0.setLayoutX(225.0);
        player1RightTxt0.setLayoutY(81.0);
        player1RightTxt0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        player1RightTxt0.setStrokeWidth(0.0);
        player1RightTxt0.setText("player");
        player1RightTxt0.setFont(new Font("Bauhaus 93", 24.0));

        grid.setHgap(10.0);
        grid.setLayoutX(143.0);
        grid.setLayoutY(219.0);
        grid.setPrefHeight(390.0);
        grid.setPrefWidth(390.0);
        grid.setVgap(10.0);

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
        grid.setPadding(new Insets(10.0));

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

        GridPane.setColumnIndex(btn21, 1);
        GridPane.setRowIndex(btn21, 2);
        btn21.setMnemonicParsing(false);
        btn21.setPrefHeight(107.0);
        btn21.setPrefWidth(118.0);
        btn21.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust.setBrightness(-0.02);
        colorAdjust.setContrast(0.19);
        colorAdjust.setHue(-0.04);
        colorAdjust.setSaturation(0.25);
        btn21.setEffect(colorAdjust);
        btn21.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(btn11, 1);
        GridPane.setRowIndex(btn11, 1);
        btn11.setMnemonicParsing(false);
        btn11.setPrefHeight(121.0);
        btn11.setPrefWidth(118.0);
        btn11.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust0.setBrightness(-0.02);
        colorAdjust0.setContrast(0.19);
        colorAdjust0.setHue(-0.04);
        colorAdjust0.setSaturation(0.25);
        btn11.setEffect(colorAdjust0);

        btn00.setMnemonicParsing(false);
        btn00.setPrefHeight(121.0);
        btn00.setPrefWidth(118.0);
        btn00.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust1.setBrightness(-0.02);
        colorAdjust1.setContrast(0.19);
        colorAdjust1.setHue(-0.04);
        colorAdjust1.setSaturation(0.25);
        btn00.setEffect(colorAdjust1);

        GridPane.setColumnIndex(btn12, 2);
        GridPane.setRowIndex(btn12, 1);
        btn12.setMnemonicParsing(false);
        btn12.setPrefHeight(121.0);
        btn12.setPrefWidth(118.0);
        btn12.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust2.setBrightness(-0.02);
        colorAdjust2.setContrast(0.19);
        colorAdjust2.setHue(-0.04);
        colorAdjust2.setSaturation(0.25);
        btn12.setEffect(colorAdjust2);

        GridPane.setColumnIndex(btn02, 2);
        btn02.setCache(true);
        btn02.setMnemonicParsing(false);
        btn02.setPrefHeight(121.0);
        btn02.setPrefWidth(118.0);
        btn02.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust3.setBrightness(-0.02);
        colorAdjust3.setContrast(0.19);
        colorAdjust3.setHue(-0.04);
        colorAdjust3.setSaturation(0.25);
        btn02.setEffect(colorAdjust3);
        btn02.setCursor(Cursor.HAND);

        GridPane.setRowIndex(btn10, 1);
        btn10.setMnemonicParsing(false);
        btn10.setPrefHeight(121.0);
        btn10.setPrefWidth(118.0);
        btn10.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust4.setBrightness(-0.02);
        colorAdjust4.setContrast(0.19);
        colorAdjust4.setHue(-0.04);
        colorAdjust4.setSaturation(0.25);
        btn10.setEffect(colorAdjust4);

        GridPane.setColumnIndex(btn22, 2);
        GridPane.setRowIndex(btn22, 2);
        btn22.setMnemonicParsing(false);
        btn22.setPrefHeight(107.0);
        btn22.setPrefWidth(118.0);
        btn22.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust5.setBrightness(-0.02);
        colorAdjust5.setContrast(0.19);
        colorAdjust5.setHue(-0.04);
        colorAdjust5.setSaturation(0.25);
        btn22.setEffect(colorAdjust5);
        btn22.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));

        GridPane.setColumnIndex(btn01, 1);
        btn01.setMnemonicParsing(false);
        btn01.setPrefHeight(121.0);
        btn01.setPrefWidth(118.0);
        btn01.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust6.setBrightness(-0.02);
        colorAdjust6.setContrast(0.19);
        colorAdjust6.setHue(-0.04);
        colorAdjust6.setSaturation(0.25);
        btn01.setEffect(colorAdjust6);

        GridPane.setRowIndex(btn20, 2);
        btn20.setMnemonicParsing(false);
        btn20.setPrefHeight(107.0);
        btn20.setPrefWidth(118.0);
        btn20.setFont(new Font("Bauhaus 93", 64.0));

        colorAdjust7.setBrightness(-0.02);
        colorAdjust7.setContrast(0.19);
        colorAdjust7.setHue(-0.04);
        colorAdjust7.setSaturation(0.25);
        btn20.setEffect(colorAdjust7);
        GridPane.setMargin(btn20, new Insets(0.0));
        btn20.setPadding(new Insets(10.0, 0.0, 0.0, 0.0));
        setCenter(anchorPane0);

        anchorPane.getChildren().add(backBtn);
        anchorPane.getChildren().add(rematchBtn);
        anchorPane.getChildren().add(homeBtn);
        anchorPane.getChildren().add(player1RightTxt);
        anchorPane.getChildren().add(toeLeftText);
        anchorPane.getChildren().add(aLeftText);
        anchorPane.getChildren().add(ticLeftText);
        anchorPane.getChildren().add(player1LeftTxt);
        anchorPane.getChildren().add(recordBtn);
        anchorPane.getChildren().add(recordTxt);
        anchorPane.getChildren().add(player1Txt);
        anchorPane.getChildren().add(player2Txt);
        anchorPane.getChildren().add(scoreTxt);
        anchorPane.getChildren().add(player1ScoreTxt);
        anchorPane.getChildren().add(player2ScoreTxt);
        anchorPane0.getChildren().add(player2RightTxt);
        anchorPane0.getChildren().add(toeRightTxt);
        anchorPane0.getChildren().add(aRightTxt);
        anchorPane0.getChildren().add(ticRightTxt);
        anchorPane0.getChildren().add(soundBtn);
        anchorPane0.getChildren().add(sountTxt);
        anchorPane0.getChildren().add(player1RightTxt0);
        grid.getColumnConstraints().add(columnConstraints);
        grid.getColumnConstraints().add(columnConstraints0);
        grid.getColumnConstraints().add(columnConstraints1);
        grid.getRowConstraints().add(rowConstraints);
        grid.getRowConstraints().add(rowConstraints0);
        grid.getRowConstraints().add(rowConstraints1);
        grid.getChildren().add(rectangle);
        grid.getChildren().add(btn21);
        grid.getChildren().add(btn11);
        grid.getChildren().add(btn00);
        grid.getChildren().add(btn12);
        grid.getChildren().add(btn02);
        grid.getChildren().add(btn10);
        grid.getChildren().add(btn22);
        grid.getChildren().add(btn01);
        grid.getChildren().add(btn20);
        anchorPane0.getChildren().add(grid);

    }
}
