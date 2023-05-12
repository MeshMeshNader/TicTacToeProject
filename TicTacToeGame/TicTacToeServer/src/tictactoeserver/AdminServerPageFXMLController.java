///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package tictactoeserver;
//
//import java.net.URL;
//import java.util.ResourceBundle;
//import javafx.collections.ObservableList;
//import javafx.collections.FXCollections;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.chart.BarChart;
//import javafx.scene.chart.CategoryAxis;
//import javafx.scene.chart.NumberAxis;
//import javafx.scene.control.Button;
//import javafx.scene.control.TableColumn;
//import javafx.scene.control.TableView;
//import javafx.scene.control.ToggleButton;
//import javafx.scene.control.cell.PropertyValueFactory;
//import javafx.scene.text.Text;
//import tictactoeclient.UserDTO;
//
///**
// * FXML Controller class
// *
// * @author ahmed
// */
//public class AdminServerPageFXMLController implements Initializable
//{
//
//    @FXML
//    private Button logOutBtn;
//    @FXML
//    private TableView<?> onlineUsersTable;
//    @FXML
//    private TableColumn<?, ?> userNameOnlineTableCol;
//    @FXML
//    private TableColumn<?, ?> statusOnlineTableCol;
//    @FXML
//    private Text onlineUsersValueTxt;
//    @FXML
//    private TableView<?> offlineUsersTable;
//    @FXML
//    private TableColumn<?, ?> userNameOfflineTableCol;
//    @FXML
//    private Text offlineUsersValueTxt;
//    @FXML
//    private ToggleButton connectionToggleBtn;
//    @FXML
//    private Text serverConnectionTxt;
//    @FXML
//    private Text ticTacToePlayersTxt;
//    @FXML
//    private TableView<?> usersInfoTable;
//    @FXML
//    private TableColumn<?, ?> playeOneInfoTableCol;
//    @FXML
//    private TableColumn<?, ?> playeTwoInfoTableCol;
//    @FXML
//    private TableColumn<?, ?> gameStatusInfoTableCol;
//    @FXML
//    private Text onlineUsersPlayingInfoTxt;
//    @FXML
//    private BarChart<?, ?> usersBarChart;
//    @FXML
//    private NumberAxis usersNumbersAxis;
//    @FXML
//    private CategoryAxis usersCategoryAxis;
//
//    private ObservableList<UserDTO> data;
//    /**
//     * Initializes the controller class.
//     */
//    @Override
//    public void initialize(URL url, ResourceBundle rb) 
//    {
//         // Create an ObservableList of UserDTO objects
//    ObservableList<UserDTO> userList = FXCollections.observableArrayList(
//    new UserDTO("Alice"),
//    new UserDTO("Bob"),
//    new UserDTO("Charlie")
//);
//
//        // Set the items of the TableView to the ObservableList of UserDTO objects
//        offlineUsersTable.setItems(userList);
//        // Set up the columns
//        userNameOfflineTableCol.setCellValueFactory(new PropertyValueFactory<>("name"));
//    
//    }     
