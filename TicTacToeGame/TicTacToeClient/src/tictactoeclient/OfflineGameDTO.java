/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nasr
 */
public class OfflineGameDTO implements Serializable {

    private int winnerID;
    private String idUserOneName;
    String idUserOne="0";
    private String idUserTwoName;
    String idUserTwo="1";
    String createdAt;

    private ArrayList<OfflineMoveDTO> record=new ArrayList<>();
    // Date createdAt;

    public OfflineGameDTO(int winnerID, String idUserOneName, String idUserTwoName, Date currentDate, ArrayList<OfflineMoveDTO> record) {
        Date date = currentDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.createdAt = dateFormat.format(currentDate);
        this.idUserOneName = idUserOneName;
        this.idUserOne="0";
        this.idUserTwoName = idUserTwoName;
        this.idUserTwo="1";
        this.record = record;
        this.winnerID = winnerID;

    }

    public OfflineGameDTO() {
    }

    public int getWinnerID() {
        return winnerID;
    }

    public void setWinnerID(int winnerID) {
        this.winnerID = winnerID;
    }

    public String getDate() {
        return createdAt;
    }

    public ArrayList<OfflineMoveDTO> getRecord() {
        return record;
    }

    public String getUserOne() {
        return idUserOneName;
    }

    public String getUserTwo() {
        return idUserTwoName;
    }
}
