package tictactoeserver;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.ClientDriver;
import tictactoeclient.GameDTO;
import tictactoeclient.MoveDTO;
import tictactoeclient.UserDTO;

public class DataAccessLayer {

    static Connection con = null;

    public DataAccessLayer() {

    }

    public static void connect() {
        try {
            DriverManager.registerDriver(new ClientDriver());
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/TicTacToeDB", "root", "root");

        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean login(String userName, String password) {

        try {
            PreparedStatement pst = con.prepareStatement("Select PASSWORD from USERS where USERNAME = ?");
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {

                if (rs.getString(1).equals(password)) {
                    pst = con.prepareStatement("update USERS set ROOT.\"USERS\".\"ISONLINE\" = true where ROOT.\"USERS\".\"USERNAME\" = ?");
                    pst.setString(1, userName);
                    pst.executeUpdate();

                    // "login successfully"
                    return true;
                } else {
                    //"Invalid data! please try to login again.."
                    return false;
                }
            }

            //TODO handle no user found
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    }

    public static Boolean register(UserDTO userInfo) throws SQLException {

        Boolean result = false;
        try {
            PreparedStatement pst = con.prepareStatement(
                    "INSERT INTO USERS VALUES(DEFAULT ,?,?, ? ,?,?,?,?,?,?)");
            pst.setString(1, userInfo.getUserName());
            pst.setString(2, userInfo.getUserNickName());
            pst.setString(3, userInfo.getPassword());
            pst.setInt(4, userInfo.getScore());
            pst.setInt(5, userInfo.getNoOfWins());
            pst.setInt(6, userInfo.getNoOfLosses());
            pst.setBoolean(7, userInfo.isIsOnline());
            pst.setBoolean(8, userInfo.isIsPlaying());
            pst.setTimestamp(9, userInfo.getCreatedAt());
            pst.executeUpdate();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    /////////////////////////////////////////////////////
    
    
   
    public static ArrayList<GameDTO> getAllGames() throws SQLException {

        ArrayList<GameDTO> games = new ArrayList<>();

        PreparedStatement pst = con.prepareStatement(" SELECT * FROM GAME ");
        ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            games.add(new GameDTO(
                    resultSet.getInt("GAMEID"),
                    resultSet.getString("MODE"),
                    resultSet.getString("RESULTS"),
                    resultSet.getString("PLAYE1"),
                    resultSet.getString("PLAYE2"),
                    resultSet.getInt("WINNERID"),
                    resultSet.getInt("LOSERID"),
                    resultSet.getDate("CREATEDAT")
            ));
        }
       return games;
    }
    
    public static boolean checkIfUserExist(String userName) throws SQLException {

        PreparedStatement pst = con.prepareStatement(" SELECT ROOT.\"USERS\".\"USERNAME\" FROM  ROOT.\"USERS\" Where ROOT.\"USERS\".\"USERNAME\"=? ");
        pst.setString(1, userName);
        ResultSet rs = pst.executeQuery();
        boolean found = false;

        while (rs.next()) {
            if (userName.equals(rs.getString("USERNAME"))) {
                found = true;
                return found;
            }
        }
        return found;
    }

    public static ArrayList<UserDTO> getOnlinePlayers() throws SQLException {

        ArrayList<UserDTO> onlinePlayers = new ArrayList<>();

        PreparedStatement pst = con.prepareStatement(" SELECT * FROM  ROOT.\"USERS\" Where ROOT.\"USERS\".\"ISONLINE\"=true ");
//int userID, String userName, String userNickName, String password, int score, int noOfWins, int noOfLosses, boolean isOnline, boolean isPlaying, Timestamp createdAt
        ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            onlinePlayers.add(new UserDTO(
                    resultSet.getInt("userID"),
                    resultSet.getString("username"),
                    resultSet.getString("userNickname"),
                    resultSet.getString("password"),
                    resultSet.getInt("score"),
                    resultSet.getInt("noOfWins"),
                    resultSet.getInt("noOfLosses"),
                    resultSet.getBoolean("isOnline"),
                    resultSet.getBoolean("isPlaying"),
                    resultSet.getTimestamp("createdAt")
            ));
        }
        return onlinePlayers;
    }

    public static ArrayList<UserDTO> getOfflinePlayers() throws SQLException {

        ArrayList<UserDTO> offlinePlayers = new ArrayList<>();

        PreparedStatement pst = con.prepareStatement(" SELECT * FROM  ROOT.\"USERS\" Where ROOT.\"USERS\".\"ISONLINE\"=false ");

        ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            offlinePlayers.add(new UserDTO(
                    resultSet.getInt("userID"),
                    resultSet.getString("username"),
                    resultSet.getString("userNickname"),
                    resultSet.getString("password"),
                    resultSet.getInt("score"),
                    resultSet.getInt("noOfWins"),
                    resultSet.getInt("noOfLosses"),
                    resultSet.getBoolean("isOnline"),
                    resultSet.getBoolean("isPlaying"),
                    resultSet.getTimestamp("createdAt")
            ));
        }
        return offlinePlayers;
    }

    public static ArrayList<UserDTO> getAllPlayers() throws SQLException {

        ArrayList<UserDTO> allPlayers = new ArrayList<>();

        PreparedStatement pst = con.prepareStatement(" SELECT * FROM  USERS ");

        ResultSet resultSet = pst.executeQuery();

        while (resultSet.next()) {
            allPlayers.add(new UserDTO(
                    resultSet.getInt("userID"),
                    resultSet.getString("username"),
                    resultSet.getString("userNickname"),
                    resultSet.getString("password"),
                    resultSet.getInt("score"),
                    resultSet.getInt("noOfWins"),
                    resultSet.getInt("noOfLosses"),
                    resultSet.getBoolean("isOnline"),
                    resultSet.getBoolean("isPlaying"),
                    resultSet.getTimestamp("createdAt")
            ));
        }
        return allPlayers;
    }

    public static UserDTO getAllInfo(String userName) throws SQLException {

        UserDTO user = null;
        PreparedStatement pst = con.prepareStatement(" SELECT * FROM  USERS WHERE USERNAME = ?");
        pst.setString(1, userName);
        ResultSet resultSet = pst.executeQuery();

        if (resultSet.next()) {
            user = new UserDTO(
                    resultSet.getInt("userID"),
                    resultSet.getString("username"),
                    resultSet.getString("userNickname"),
                    resultSet.getString("password"),
                    resultSet.getInt("score"),
                    resultSet.getInt("noOfWins"),
                    resultSet.getInt("noOfLosses"),
                    resultSet.getBoolean("isOnline"),
                    resultSet.getBoolean("isPlaying"),
                    resultSet.getTimestamp("createdAt")
            );
        }

        return user;
    }

    public static int getOnlinePlayersNum() throws SQLException {

        String sql = "select count( ROOT.\"USERS\".\"USERID\") AS total FROM  ROOT.\"USERS\" Where ROOT.\"USERS\".\"ISONLINE\"=? ";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setBoolean(1, true);
        int count = 0;
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            count = rs.getInt("total");
        }
        return count;
    }

    public static int getbusyPlayersNum() throws SQLException {
        String sql = "select count( ROOT.\"USERS\".\"USERID\") AS total FROM  ROOT.\"USERS\" Where ROOT.\"USERS\".\"ISPLAYING\"=? ";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setBoolean(1, true);
        int count = 0;
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            count = rs.getInt("total");
        }
        return count;
    }

    public static int getOfflinePlayersNum() throws SQLException {

        String sql = "select count( ROOT.\"USERS\".\"USERID\") AS total FROM  ROOT.\"USERS\" Where ROOT.\"USERS\".\"ISONLINE\"=? ";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setBoolean(1, false);
        int count = 0;
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            count = rs.getInt("total");
        }
        return count;
    }

    public static Boolean logout(String userName) {
        try {
            PreparedStatement pst = con.prepareStatement("update ROOT.\"USERS\" set ROOT.\"USERS\".\"ISONLINE\" = false where ROOT.\"USERS\".\"USERNAME\" = ?");
            pst.setString(1, userName);
            pst.executeUpdate();
            return true;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public static Boolean makePlayerOneBusy(String userName1) {
        try {
            PreparedStatement pst = con.prepareStatement("Update ROOT.\"USERS\" set ROOT.\"USERS\".\"ISPLAYING\" = ? where ROOT.\"USERS\".\"USERNAME\" = ? ");
            pst.setBoolean(1, true);
            pst.setString(2, userName1);
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Boolean makePlayerTwoBusy(String userName2) {
        try {
            PreparedStatement pst = con.prepareStatement("Update ROOT.\"USERS\" set ROOT.\"USERS\".\"ISPLAYING\" = ? where ROOT.\"USERS\".\"USERNAME\" = ? ");
            pst.setBoolean(1, true);
            pst.setString(2, userName2);
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static int getPlayerScore(String userName) throws SQLException {

        PreparedStatement pst = con.prepareStatement(" SELECT * FROM  ROOT.\"USERS\" Where ROOT.\"USERS\".\"USERNAME\"=? ");
        pst.setString(1, userName);
        ResultSet resultSet = pst.executeQuery();

        if (resultSet.next()) {
            return resultSet.getInt("score");
        } else {
            return 0;
        }
    }

    public static Boolean updateScore(UserDTO userInfo) {
        try {
            PreparedStatement pst = con.prepareStatement("Update ROOT.\"USERS\" set ROOT.\"USERS\".\"SCORE\" = ? where ROOT.\"USERS\".\"USERNAME\" = ?");
            pst.setInt(1, userInfo.getScore());
            pst.setString(2, userInfo.getUserName());
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static Boolean makeuserOnline(String userName) {
        try {
            String sqlUpdate = "Update ROOT.\"users\" set ROOT.\"USERS\".\"ISONLINE\" = ? where ROOT.\"USERS\".\"USERNAME\" = ?";
            PreparedStatement pst = con.prepareStatement(sqlUpdate);
            pst.setBoolean(1, true);
            pst.setString(2, userName);
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static Boolean makeuserOffline(String userName) {

        try {
            String sqlUpdate = "Update ROOT.\"users\" set ROOT.\"USERS\".\"ISONLINE\" = ? where ROOT.\"USERS\".\"USERNAME\" = ?";
            PreparedStatement pst = con.prepareStatement(sqlUpdate);
            pst.setBoolean(1, false);
            pst.setString(2, userName);
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public Connection getConnection() {
        return con;
    }

    public static int getNumberOfWins(String userName) {
        int numberOfWins = 0;
        try {
            PreparedStatement pst = con.prepareStatement("SELECT ROOT.\"USERS\".\"NOOFWINS\" FROM  ROOT.\"USERS\" WHERE ROOT.\"USERS\".\"USERNAME\" = ?");
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                numberOfWins = rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numberOfWins;
    }

    public static int getNumberOfLosses(String userName) {
        int numberOfLoses = 0;
        try {
            PreparedStatement pst = con.prepareStatement("SELECT ROOT.\"USERS\".\"NOOFLOSSES\" FROM  ROOT.\"USERS\" WHERE ROOT.\"USERS\".\"USERNAME\" = ?");
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                numberOfLoses = rs.getInt(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return numberOfLoses;
    }

    public static Boolean incrementNumberOfLosses(String userName) {

        try {
            PreparedStatement pst = con.prepareStatement("UPDATE ROOT.\"USERS\" SET ROOT.\"USERS\".\"NOOFLOSSES\" = ROOT.\"USERS\".\"NOOFLOSSES\" + 1 WHERE ROOT.\"USERS\".\"USERNAME\" = ?");
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static Boolean incrementNumberOfWins(String userName) {

        try {

            PreparedStatement pst = con.prepareStatement("UPDATE ROOT.\"USERS\" SET ROOT.\"USERS\".\"NOOFWINS\" = ROOT.\"USERS\".\"NOOFWINS\" + 1 WHERE ROOT.\"USERS\".\"USERNAME\" = ?");
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static Boolean setGame(GameDTO game) {

        try {
            PreparedStatement pst = con.prepareStatement(
                    "INSERT INTO GAME VALUES(DEFAULT ,?,?, ? ,?,?,?,?)");
            pst.setString(2, game.getMode());
            pst.setString(3, game.getResults());
            pst.setString(4, game.getPlaye1());
            pst.setString(5, game.getPlaye2());
            pst.setInt(6, game.getWinnerID());
            pst.setInt(7, game.getLoserID());

            pst.setDate(8, game.getCreatedAt());

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static Boolean setMove(MoveDTO move) {

        try {
            PreparedStatement pst = con.prepareStatement(
                    "INSERT INTO MOVE VALUES(DEFAULT ,?,?, ? ,?,?)");
            pst.setInt(2, move.getGameID());
            pst.setInt(3, move.getPlayerID());
            pst.setInt(4, move.getRow());
            pst.setInt(5, move.getCol());
            pst.setDate(6, move.getCreatedAt());

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public static ArrayList<MoveDTO> getMoves(int moveId) throws SQLException {

        ArrayList<MoveDTO> moves = new ArrayList<>();

        PreparedStatement pst = con.prepareStatement(" SELECT * FROM MOVE WHERE MOVEID = ? ");
        pst.setInt(1, moveId);
        ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            moves.add(new MoveDTO(moveId,
                    resultSet.getInt("GAMEID"),
                    resultSet.getInt("PLAYERID"),
                    resultSet.getInt("ROW"),
                    resultSet.getInt("COL"),
                    resultSet.getDate("CREATEDAT")
            ));
        }
        return moves;
    }

    public static GameDTO getGame(int gameId) throws SQLException {

        GameDTO game;

        PreparedStatement pst = con.prepareStatement(" SELECT * FROM GAME WHERE GAMEID = ?");
        pst.setInt(1, gameId);
        ResultSet resultSet = pst.executeQuery();
        if (resultSet.next()) {
            game = new GameDTO(gameId,
                    resultSet.getString("MODE"),
                    resultSet.getString("RESULTS"),
                    resultSet.getString("PLAYE1"),
                    resultSet.getString("PLAYE2"),
                    resultSet.getInt("WINNERID"),
                    resultSet.getInt("LOSERID"),
                    resultSet.getDate("CREATEDAT")
            );
        } else {
            game = new GameDTO();
        }
        return game;
    }

    public static Boolean deleteGame(int gameId) {

        try {
            PreparedStatement pst = con.prepareStatement(" DELETE FROM GAME WHERE GAMEID = ?");
            pst.setInt(1, gameId);
            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public static int deleteMove(int moveId) throws SQLException {
        int result;
        PreparedStatement pst = con.prepareStatement(" DELETE FROM MOVE WHERE MOVEID = ?");
        pst.setInt(1, moveId);
        result = pst.executeUpdate();
        return result;
    }

    public static Boolean updateResults(String result, GameDTO game) {
        try {
            PreparedStatement pst = con.prepareStatement("UPDATE GAME SET RESULTS = ? WHERE GAMEID = ?");
            pst.setString(1, result);
            pst.setString(2, game.getGameID() + "");

            pst.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessLayer.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
