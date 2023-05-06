/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.io.Serializable;
import java.util.Date;

public class UserDTO implements Serializable{

    private int userID;
    private String userName;
    private String userNickName;
    private String password;
    private int score;
    private int noOfWins;
    private int noOfLosses;
    private boolean isOnline;
    private boolean isPlaying;
    Date createdAt;

    public UserDTO(){}
    public UserDTO(int userID, String userName, String userNickName, String password, int score, int noOfWins, int noOfLosses, boolean isOnline, boolean isPlaying, Date createdAt) {
        this.userID = userID;
        this.userName = userName;
        this.userNickName = userNickName;
        this.password = password;
        this.score = score;
        this.noOfWins = noOfWins;
        this.noOfLosses = noOfLosses;
        this.isOnline = isOnline;
        this.isPlaying = isPlaying;
        this.createdAt = createdAt;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNoOfWins() {
        return noOfWins;
    }

    public void setNoOfWins(int noOfWins) {
        this.noOfWins = noOfWins;
    }

    public int getNoOfLosses() {
        return noOfLosses;
    }

    public void setNoOfLosses(int noOfLosses) {
        this.noOfLosses = noOfLosses;
    }

    public boolean isIsOnline() {
        return isOnline;
    }

    public void setIsOnline(boolean isOnline) {
        this.isOnline = isOnline;
    }

    public boolean isIsPlaying() {
        return isPlaying;
    }

    public void setIsPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
