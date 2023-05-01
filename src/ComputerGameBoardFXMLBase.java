
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

public class ComputerGameBoardFXMLBase extends BorderPane {

    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final Glow glow;
    protected final Button backBtn;
    protected final DropShadow dropShadow;
    protected final Button rematchBtn;
    protected final DropShadow dropShadow0;
    protected final Button homeBtn;
    protected final DropShadow dropShadow1;
    protected final Text playerTwoUserNameLValueTxt;
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
    protected final Text playerTwoUserNameRValueTxt;
    protected final Text toeRTxt;
    protected final Text aRTxt;
    protected final Text ticRTxt;
    protected final ToggleButton soundToggleBtn;
    protected final DropShadow dropShadow3;
    protected final Text soundTxt;
    protected final Text playerOneUserNameRValueTxt;
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

    public ComputerGameBoardFXMLBase() {

        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        glow = new Glow();
        backBtn = new Button();
        dropShadow = new DropShadow();
        rematchBtn = new Button();
        dropShadow0 = new DropShadow();
        homeBtn = new Button();
        dropShadow1 = new DropShadow();
        playerTwoUserNameLValueTxt = new Text();
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
        playerTwoUserNameRValueTxt = new Text();
        toeRTxt = new Text();
        aRTxt = new Text();
        ticRTxt = new Text();
        soundToggleBtn = new ToggleButton();
        dropShadow3 = new DropShadow();
        soundTxt = new Text();
        playerOneUserNameRValueTxt = new Text();
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

        playerTwoUserNameLValueTxt.setLayoutX(216.0);
        playerTwoUserNameLValueTxt.setLayoutY(514.0);
        playerTwoUserNameLValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoUserNameLValueTxt.setStrokeWidth(0.0);
        playerTwoUserNameLValueTxt.setText("player");
        playerTwoUserNameLValueTxt.setFont(new Font("Bauhaus 93", 36.0));

        toeLTxt.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        toeLTxt.setLayoutX(169.0);
        toeLTxt.setLayoutY(412.0);
        toeLTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        toeLTxt.setStrokeWidth(0.0);
        toeLTxt.setText("T     O     E");
        toeLTxt.setFont(new Font("Bauhaus 93", 36.0));

        aLTxt.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        aLTxt.setLayoutX(168.0);
        aLTxt.setLayoutY(466.0);
        aLTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aLTxt.setStrokeWidth(0.0);
        aLTxt.setText("A");
        aLTxt.setFont(new Font("Bauhaus 93", 36.0));

        ticLTxt.setFill(javafx.scene.paint.Color.valueOf("#f8e3e3"));
        ticLTxt.setLayoutX(46.0);
        ticLTxt.setLayoutY(518.0);
        ticLTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        ticLTxt.setStrokeWidth(0.0);
        ticLTxt.setText("T     I     C");
        ticLTxt.setFont(new Font("Bauhaus 93", 36.0));

        playerOneUserNameLValueTxt.setLayoutX(30.0);
        playerOneUserNameLValueTxt.setLayoutY(411.0);
        playerOneUserNameLValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerOneUserNameLValueTxt.setStrokeWidth(0.0);
        playerOneUserNameLValueTxt.setText("player");
        playerOneUserNameLValueTxt.setFont(new Font("Bauhaus 93", 36.0));

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

        playerTwoUserNameRValueTxt.setLayoutX(351.0);
        playerTwoUserNameRValueTxt.setLayoutY(157.0);
        playerTwoUserNameRValueTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        playerTwoUserNameRValueTxt.setStrokeWidth(0.0);
        playerTwoUserNameRValueTxt.setText("player");
        playerTwoUserNameRValueTxt.setFont(new Font("Bauhaus 93", 24.0));

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
        soundToggleBtn.setText("On / Off");

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
        playerOneUserNameRValueTxt.setText("player");
        playerOneUserNameRValueTxt.setFont(new Font("Bauhaus 93", 24.0));

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

        GridPane.setColumnIndex(cellPos1_2, 2);
        GridPane.setRowIndex(cellPos1_2, 1);
        cellPos1_2.setMnemonicParsing(false);
        cellPos1_2.setPrefHeight(121.0);
        cellPos1_2.setPrefWidth(118.0);
        cellPos1_2.setFont(new Font("Bauhaus 93", 64.0));

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
        setCenter(anchorPane1);

        anchorPane0.getChildren().add(backBtn);
        anchorPane0.getChildren().add(rematchBtn);
        anchorPane0.getChildren().add(homeBtn);
        anchorPane0.getChildren().add(playerTwoUserNameLValueTxt);
        anchorPane0.getChildren().add(toeLTxt);
        anchorPane0.getChildren().add(aLTxt);
        anchorPane0.getChildren().add(ticLTxt);
        anchorPane0.getChildren().add(playerOneUserNameLValueTxt);
        anchorPane0.getChildren().add(recordToggleBtn);
        anchorPane0.getChildren().add(recordTxt);
        anchorPane.getChildren().add(anchorPane0);
        anchorPane2.getChildren().add(playerTwoUserNameRValueTxt);
        anchorPane2.getChildren().add(toeRTxt);
        anchorPane2.getChildren().add(aRTxt);
        anchorPane2.getChildren().add(ticRTxt);
        anchorPane2.getChildren().add(soundToggleBtn);
        anchorPane2.getChildren().add(soundTxt);
        anchorPane2.getChildren().add(playerOneUserNameRValueTxt);
        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        gridPane.getChildren().add(rectangle);
        gridPane.getChildren().add(cellPos2_1);
        gridPane.getChildren().add(cellPos1_1);
        gridPane.getChildren().add(cellPos0_0);
        gridPane.getChildren().add(cellPos1_2);
        gridPane.getChildren().add(cellPos0_2);
        gridPane.getChildren().add(cellPos1_0);
        gridPane.getChildren().add(cellPos2_2);
        gridPane.getChildren().add(cellPos0_1);
        gridPane.getChildren().add(cellPos2_0);
        anchorPane2.getChildren().add(gridPane);
        anchorPane1.getChildren().add(anchorPane2);

    }
}
