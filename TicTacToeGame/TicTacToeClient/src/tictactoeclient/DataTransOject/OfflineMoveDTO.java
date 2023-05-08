/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient.RelatedRecored;

/**
 *
 * @author Nasr
 */
import java.io.Serializable;


public class OfflineMoveDTO implements Serializable{

    private int moveID;
    private int playerID;
    private int row;
    private int col;

    public OfflineMoveDTO(int moveID,int playerID, int row, int col) {
        this.moveID = moveID;
        this.playerID = playerID;
        this.row = row;
        this.col = col;
    }
    

    public int getMoveID() {
        return moveID;
    }
    public int getPlayerID() {
        return playerID;
    }
    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

}

