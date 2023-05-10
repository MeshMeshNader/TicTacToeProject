/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author dell
 */
public class GameDTO implements Serializable{

    private int gameID;
    private String mode;
    private String results;
    private int playe1;
    private int playe2;
    private int winnerID;
    private int loserID;
    Date createdAt;

    public GameDTO(int gameID, String mode, String results, int playe1, int playe2, int winnerID, int loserID, Date createdAt) {
        this.gameID = gameID;
        this.mode = mode;
        this.results = results;
        this.playe1 = playe1;
        this.playe2 = playe2;
        this.winnerID = winnerID;
        this.loserID = loserID;
        this.createdAt = createdAt;
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

    public int getPlaye1() {
        return playe1;
    }

    public void setPlaye1(int playe1) {
        this.playe1 = playe1;
    }

    public int getPlaye2() {
        return playe2;
    }

    public void setPlaye2(int playe2) {
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

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
