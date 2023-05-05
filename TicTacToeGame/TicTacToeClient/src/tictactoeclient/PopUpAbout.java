package tictactoeclient;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Glow;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PopUpAbout extends AnchorPane {

    Stage parentStage;
    protected final Button cancelBtn;
    protected final DropShadow dropShadow;
    protected final Text aboutUsTxt;
    protected final TextArea aboutUsInfoTxt;
    protected final DropShadow dropShadow0;
    protected final Glow glow;

    public PopUpAbout(Stage stage) {

        parentStage = stage;
        cancelBtn = new Button();
        dropShadow = new DropShadow();
        aboutUsTxt = new Text();
        aboutUsInfoTxt = new TextArea();
        dropShadow0 = new DropShadow();
        glow = new Glow();

        setPrefHeight(400.0);
        setPrefWidth(500.0);
        setStyle("-fx-background-color: #F27B7A;");

        cancelBtn.setLayoutX(170.0);
        cancelBtn.setLayoutY(347.0);
        cancelBtn.setMnemonicParsing(false);
        cancelBtn.setPrefHeight(38.0);
        cancelBtn.setPrefWidth(154.0);
        cancelBtn.setStyle("-fx-background-color: #ffffff;");
        cancelBtn.setText("Cancel");
        cancelBtn.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        cancelBtn.setFont(new Font("Bauhaus 93", 20.0));

        cancelBtn.setEffect(dropShadow);

        aboutUsTxt.setLayoutX(205.0);
        aboutUsTxt.setLayoutY(41.0);
        aboutUsTxt.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        aboutUsTxt.setStrokeWidth(0.0);
        aboutUsTxt.setText("About US");
        aboutUsTxt.setWrappingWidth(90.58978271484375);
        aboutUsTxt.setFont(new Font("Bauhaus 93", 22.0));

        aboutUsInfoTxt.setEditable(false);
        aboutUsInfoTxt.setLayoutX(58.0);
        aboutUsInfoTxt.setLayoutY(65.0);
        aboutUsInfoTxt.setPrefHeight(270.0);
        aboutUsInfoTxt.setPrefWidth(385.0);
        aboutUsInfoTxt.setStyle("-fx-border-color: #000000; -fx-border-width: 2;");
        aboutUsInfoTxt.setText("ThiS game iS deSigned and implemented by: \n\n1-Mohmmed Mohammed Nader \n2-Ahmed Abd elhamid YouSef OSman\n3-Ahmed Mohamed Mohamed Ahmed\n4-Ahmed NaSr Mohamed Hamed\n5-EhSan Ahmed ElSaeed mohamed\n\nVersion: 1.0");
        aboutUsInfoTxt.setFont(new Font("Bauhaus 93", 18.0));

        aboutUsInfoTxt.setEffect(dropShadow0);

        setEffect(glow);

        getChildren().add(cancelBtn);
        getChildren().add(aboutUsTxt);
        getChildren().add(aboutUsInfoTxt);

        
        cancelBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                parentStage.close();
            }
        });
        
        
        
    }
}
