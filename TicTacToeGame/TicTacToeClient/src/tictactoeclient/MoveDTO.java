/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.io.Serializable;
import java.sql.Date;


public class MoveDTO implements Serializable{

    private int moveID;
    private int gameID;
    private String playerUserName;
    private int row;
    private int col;
    Date createdAt;

    public MoveDTO() {
    }
    
    

    
    public MoveDTO(int moveID, int gameID, String playerUserName, int row, int col, Date createdAt) {
        this.moveID = moveID;
        this.gameID = gameID;
        this.playerUserName = playerUserName;
        this.row = row;
        this.col = col;
        this.createdAt = createdAt;
    }

    public int getMoveID() {
        return moveID;
    }

    public void setMoveID(int moveID) {
        this.moveID = moveID;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getplayerUserName() {
        return playerUserName;
    }

    public void setplayerUserName(String playerUserName) {
        this.playerUserName = playerUserName;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public MoveDTO(String playerUserName, int row, int col) {
        this.playerUserName = playerUserName;
        this.row = row;
        this.col = col;
    }

    
    
}
