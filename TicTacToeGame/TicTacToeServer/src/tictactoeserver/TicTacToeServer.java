/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeserver;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author meshm
 */
public class TicTacToeServer extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
     
        Parent root = new AdminLoginPage(stage);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("Tic Tac Toe Server");
        stage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
