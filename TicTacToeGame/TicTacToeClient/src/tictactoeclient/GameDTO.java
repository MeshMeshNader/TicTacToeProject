/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *
 * @author dell
 */
public class GameDTO implements Serializable{

    private int gameID;
    private String mode;
    private String results;
    private String playe1;
    private String playe2;
    private int winnerID;
    private int loserID;
    Timestamp createdAt;

    public GameDTO(int gameID, String mode, String results, String playe1, String playe2, int winnerID, int loserID, Timestamp createdAt) {
        this.gameID = gameID;
        this.mode = mode;
        this.results = results;
        this.playe1 = playe1;
        this.playe2 = playe2;
        this.winnerID = winnerID;
        this.loserID = loserID;
        this.createdAt = createdAt;
    }

    public GameDTO(String mode, String results, String playe1, String playe2, int winnerID, int loserID, Timestamp createdAt) {
        this.mode = mode;
        this.results = results;
        this.playe1 = playe1;
        this.playe2 = playe2;
        this.winnerID = winnerID;
        this.loserID = loserID;
        this.createdAt = createdAt;
    }
    

    public GameDTO() {
    }

    
    
    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public String getPlaye1() {
        return playe1;
    }

    public void setPlaye1(String playe1) {
        this.playe1 = playe1;
    }

    public String getPlaye2() {
        return playe2;
    }

    public void setPlaye2(String playe2) {
        this.playe2 = playe2;
    }

    public int getWinnerID() {
        return winnerID;
    }

    public void setWinnerID(int winnerID) {
        this.winnerID = winnerID;
    }

    public int getLoserID() {
        return loserID;
    }

    public void setLoserID(int loserID) {
        this.loserID = loserID;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

}
