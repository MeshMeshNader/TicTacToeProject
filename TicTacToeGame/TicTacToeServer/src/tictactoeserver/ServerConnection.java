/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeserver;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import tictactoeclient.GameDTO;
import tictactoeclient.Messages;
import tictactoeclient.UserDTO;

/**
 *
 * @author dell
 */
public class ServerConnection {
    
    InputStream inputstream;
    OutputStream outputstream;
    ObjectInputStream objectinputstream;
    ObjectOutputStream objectoutputstream;
    Socket socket;
    String ip;
    int portNum;
    UserDTO objUser;
    GameDTO objGame;
    String msg;

    public ServerConnection(Socket socket) {
        try {
            this.socket = socket;
            ip = socket.getInetAddress().getHostAddress();
            portNum = socket.getPort();
            inputstream = socket.getInputStream();
            outputstream = socket.getOutputStream();
            objectinputstream = new ObjectInputStream(inputstream);
            objectoutputstream = new ObjectOutputStream(outputstream);
            
            DataAccessLayer.connect();
            readMessage();

        } catch (IOException ex) {
            Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getIp() {
        return ip;
    }
    
    
    

    public void readMessage() {
        new Thread() {
            @Override
            public void run() {

                while (!socket.isClosed() && socket.isConnected()) {
                    try {
                        msg = (String) objectinputstream.readObject();

                        if (msg.equals(Messages.loginRequest)) {

                            objUser = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.loginResponse, loginValidation());

                        } else if (msg.equals(Messages.registrationRequest)) {

                            objUser = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.registrationResponse, registrationValidation());

                        } else if (msg.equals(Messages.getOnlineUsersRequest)) {
                            sendMessage(Messages.getOnlineUsersResponse, retriveOnlineUsers());
                            

                        } else if (msg.equals(Messages.incNumOfWinsRequest)){
                            sendMessage(Messages.getOnlineUsersResponse, incNumOfWins());
                            
                        
                        } else if (msg.equals(Messages.setGameRequest)){
                             objGame = (GameDTO) objectinputstream.readObject();
                              sendMessage(Messages.setGameResponse, setGameResponse());
                              
                        } else if (msg.equals(Messages.getGameRequest)){
                            sendMessage(Messages.getGameResponse, retriveGame());
                            
                        } else if (msg.equals(Messages.deleteGameRequest)){
                            sendMessage(Messages.deleteGameResponse, gameDeleted());
                            
                        }else if (msg.equals(Messages.deleteMoveRequest)){
                            sendMessage(Messages.deleteMoveResponse, moveDeleted());
                        }

                    } catch (IOException ex) {
                        Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }

        }.start();
    }



    public void sendMessage(String msg, Object obj) {
        new Thread() {
            @Override
            public void run() {

                try {
                    objectoutputstream.writeObject(msg);
                    objectoutputstream.writeObject(obj);
                } catch (IOException ex) {
                    Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }.start();
    }
    public ArrayList <UserDTO> retriveOnlineUsers () throws SQLException{
        ArrayList <UserDTO> usersOnline ;
        usersOnline = DataAccessLayer.getOnlinePlayers();
        if (usersOnline != null)
            return usersOnline;
        else 
            return (new ArrayList<UserDTO>());

    }
    public ArrayList <GameDTO> retriveGame () throws SQLException{
        ArrayList <GameDTO> Game ;
        Game = DataAccessLayer.getGame(objGame.getGameID());
        if (Game != null)
            return Game;
        else 
            return (new ArrayList<GameDTO>());

    }
    
    public Boolean incNumOfWins(){
    return true;
    }
    public Boolean  setGameResponse(){
       
      return true;  
    }
    public Boolean gameDeleted(){
    return true;
    }
    public Boolean moveDeleted(){
    return true;
    }
    
    
    public Boolean loginValidation() {
        // check database and return true if exist and true and false if failed
        System.out.println("Login Validation Test");
      /*  if (DataAccessLayer.login(obj.getUserName(), obj.getPassword())) {
            return true;
        } else {
            return false;
        }*/
      return true;
    }

    public boolean registrationValidation() {
        // insert in database and return true if sucess and false if failed
        System.out.println("Login Validation Test");
        return false;
    }

}
