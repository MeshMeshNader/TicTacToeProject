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
import tictactoeclient.MoveDTO;
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
    Object obj;
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

                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.loginResponse, loginValidation());

                        } else if (msg.equals(Messages.registrationRequest)) {

                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.registrationResponse, registrationValidation());

                        } else if (msg.equals(Messages.getOnlineUsersRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.getOnlineUsersResponse, retriveOnlineUsers());

                        } else if (msg.equals(Messages.incNumOfWinsRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.incNumOfWinsResponse, incNumOfWins());

                        } else if (msg.equals(Messages.incNumOflossesRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.incNumOflossesResponse, incNumOfLossess());

                        } else if (msg.equals(Messages.setGameRequest)) {
                            obj = (GameDTO) objectinputstream.readObject();
                            sendMessage(Messages.setGameResponse, setGameResponse());

                        } else if (msg.equals(Messages.getGameRequest)) {
                            obj = (GameDTO) objectinputstream.readObject();
                            sendMessage(Messages.getGameResponse, retriveGame());

                        } else if (msg.equals(Messages.deleteGameRequest)) {
                            obj = (GameDTO) objectinputstream.readObject();
                            sendMessage(Messages.deleteGameResponse, gameDeleted());

                        } else if (msg.equals(Messages.deleteMoveRequest)) {
                            obj = (MoveDTO) objectinputstream.readObject();
                            sendMessage(Messages.deleteMoveResponse, moveDeleted());

                        } else if (msg.equals(Messages.makeUserOnlineRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.makeUserOnlineResponse, makeUserOnline());

                        } else if (msg.equals(Messages.makeUserOfflineRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.makeUserOfflineResponse, makeuserOffline());

                        } else if (msg.equals(Messages.getNumberOfWinsRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.getNumberOfWinsResponse, getNumberOfWins());

                        } else if (msg.equals(Messages.getNumberOfLossessRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.getNumberOfLossesResponse, getNumberOfLossess());
                            
                        } else if (msg.equals(Messages.updatedResultRequest)) {
                            obj = (GameDTO) objectinputstream.readObject();
                            sendMessage(Messages.updatedResultResponse, updatedResult());

                        } else if (msg.equals(Messages.setMovesRequest)) {
                            obj = (MoveDTO) objectinputstream.readObject();
                            sendMessage(Messages.setMovesResponse, setMove());

                        } else if (msg.equals(Messages.getMovesRequest)) {
                            obj = (MoveDTO) objectinputstream.readObject();
                            sendMessage(Messages.getMovesResponse, getMoves());

                        } else if (msg.equals(Messages.userExistRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.userExistRespons, checkUserExist());
                            
                        } else if (msg.equals(Messages.offlineUsersRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.offlineUsersResponse, getOfflineUsers());
                            
                        } else if (msg.equals(Messages.getAllInfoRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.getAllInfoResponse, getUserInfo());
                            
                        } else if (msg.equals(Messages.getOnlinePlayerNumRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.getOnlinePlayerNumResponse, getOnlinePlayersNum());
                            
                        } else if (msg.equals(Messages.getbusyPlayersNumRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.getbusyPlayersNumResponse, getbusyPlayersNum());
                            
                        } else if (msg.equals(Messages.getOfflinePlayersNumRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.getOfflinePlayersNumResponse, getOfflinePlayersNumValidation());

                        } else if (msg.equals(Messages.logoutRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.logoutResponse, logoutValidation());

                        } else if (msg.equals(Messages.makePlayerOneBusyRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.makePlayerOneBusyResponse, makePlayerOneBusyValidation());

                        } else if (msg.equals(Messages.makePlayerTwoBusyRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.makePlayerTwoBusyResponse, makePlayerTwoBusyValidation());

                        } else if (msg.equals(Messages.getPlayerScoreRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.getPlayerScoreResponse, getPlayerScoreValidation());

                        } else if (msg.equals(Messages.getPlayerScoreRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.getPlayerScoreResponse, getPlayerScoreValidation());

                        } else if (msg.equals(Messages.updateScoreRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.updateScoreResponse, updateScoreValidation());

                        } else if (msg.equals(Messages.getAllPlayersRequest)) {
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.getAllPLayersResponse, retriveAllPlayersData());
                        
                        } else if (msg.equals(Messages.viewUserProfileRequest)){
                            obj = (UserDTO) objectinputstream.readObject();
                            sendMessage(Messages.viewUserProfileResponse, getUserInfo());
                            
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

    public Boolean loginValidation() {
        // check database and return true if exist and true and false if failed
        UserDTO user = (UserDTO) obj;
        if (DataAccessLayer.login(user.getUserName(), ((UserDTO) user).getPassword())) {
            return true;
        } else {
            return false;
        }
        //return true;
    }

    public Boolean registrationValidation() throws SQLException {
        // insert in database and return true if sucess and false if failed
        UserDTO user = (UserDTO) obj;
        return DataAccessLayer.register(user);
    }

    public ArrayList<UserDTO> retriveOnlineUsers() throws SQLException {
        ArrayList<UserDTO> usersOnline;
        usersOnline = DataAccessLayer.getOnlinePlayers();
        if (usersOnline != null) {
            return usersOnline;
        } else {
            return (new ArrayList<UserDTO>());
        }

    }

    public Boolean checkUserExist() throws SQLException {
        Boolean isExist = false;
        UserDTO user = (UserDTO) obj;
        System.out.println("checkUserExist Test");
        if (DataAccessLayer.checkIfUserExist(user.getUserName())) {
            isExist = true;
        }
        return isExist;
    }

    public ArrayList<UserDTO> getOfflineUsers() throws SQLException {

        ArrayList<UserDTO> UserList = DataAccessLayer.getOfflinePlayers();
        if (UserList.isEmpty()) {
            UserList = new ArrayList<UserDTO>();
        }
        return UserList;
    }

    public UserDTO getUserInfo() throws SQLException {

        UserDTO user = DataAccessLayer.getAllInfo(((UserDTO) obj).getUserName());

        return user;
    }

    public Integer getOnlinePlayersNum() throws SQLException {
        Integer onlinePlayersNum = 0;
        onlinePlayersNum = DataAccessLayer.getOnlinePlayersNum();
        return onlinePlayersNum;
    }

    public Integer getbusyPlayersNum() throws SQLException {
        Integer busyPlayersNum = 0;
        busyPlayersNum = DataAccessLayer.getbusyPlayersNum();
        return busyPlayersNum;
    }

    public GameDTO retriveGame() throws SQLException {
        GameDTO Game;
        Game = DataAccessLayer.getGame(((GameDTO) obj).getGameID());
        if (Game != null) {
            return Game;
        } else {
            return (new GameDTO());
        }

    }

    public Boolean incNumOfWins() {
        Boolean result = DataAccessLayer.incrementNumberOfWins(((UserDTO) obj).getUserName());

        return result;

    }

    public Boolean incNumOfLossess() {
        Boolean result = DataAccessLayer.incrementNumberOfLosses(((UserDTO) obj).getUserName());
        return result;
    }

    public Boolean setGameResponse() {
        Boolean result = DataAccessLayer.setGame((GameDTO) obj);
        return result;
    }

    public Boolean gameDeleted() throws SQLException {
        Boolean result = DataAccessLayer.deleteGame(((GameDTO) obj).getGameID());
        return result;
    }

    public Boolean moveDeleted() throws SQLException {
        int result = DataAccessLayer.deleteMove(((MoveDTO) obj).getMoveID());
        if (result == 1) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean makeUserOnline() {
        Boolean result = DataAccessLayer.makeuserOnline(((UserDTO) obj).getUserName());
        return result;

    }

    public Boolean makeuserOffline() {
        Boolean result = DataAccessLayer.makeuserOffline(((UserDTO) obj).getUserName());
        return result;

    }

    public Integer getNumberOfWins() {
        Integer wins;
        wins = DataAccessLayer.getNumberOfWins(((UserDTO) obj).getUserName());
        return wins;
    }

    public Integer getNumberOfLossess() {
        Integer losses;
        losses = DataAccessLayer.getNumberOfLosses(((UserDTO) obj).getUserName());
        return losses;
    }

    public Boolean updatedResult() {
        GameDTO objGame = (GameDTO) obj;
        Boolean result = DataAccessLayer.updateResults(objGame.getResults(), objGame);
        return result;

    }

    public Boolean setMove() {
        Boolean result = DataAccessLayer.setMove((MoveDTO) obj);
        return result;
    }

    public ArrayList<MoveDTO> getMoves() throws SQLException {
        ArrayList<MoveDTO> moves;
        moves = DataAccessLayer.getMoves(((MoveDTO) obj).getMoveID());
        if (moves != null) {
            return moves;
        } else {
            return (new ArrayList<MoveDTO>());
        }
    }

    public Integer getOfflinePlayersNumValidation() {

        System.out.println("OfflinePlayersNum Validation Test");

        try {
            return DataAccessLayer.getOfflinePlayersNum();

        } catch (SQLException ex) {
            Logger.getLogger(ServerConnection.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public Boolean logoutValidation() {
        UserDTO objUser = (UserDTO) obj;
        return DataAccessLayer.logout(objUser.getUserName());
    }

    public Boolean makePlayerOneBusyValidation() {
        UserDTO objUser = (UserDTO) obj;
        return DataAccessLayer.makePlayerOneBusy(objUser.getUserName());
    }

    public Boolean makePlayerTwoBusyValidation() {
        UserDTO objUser = (UserDTO) obj;
        return DataAccessLayer.makePlayerTwoBusy(objUser.getUserName());
    }

    public Integer getPlayerScoreValidation() throws SQLException {
        UserDTO objUser = (UserDTO) obj;

        return DataAccessLayer.getPlayerScore(objUser.getUserName());

    }

    public Boolean updateScoreValidation() {
        UserDTO objUser = (UserDTO) obj;
        return DataAccessLayer.updateScore(objUser);
    }

    public ArrayList<UserDTO> retriveAllPlayersData() throws SQLException {
        UserDTO objUser = (UserDTO) obj;

        ArrayList<UserDTO> allPlayers = DataAccessLayer.getAllPlayers();
        allPlayers.remove(objUser);

        return allPlayers;
    }

}
