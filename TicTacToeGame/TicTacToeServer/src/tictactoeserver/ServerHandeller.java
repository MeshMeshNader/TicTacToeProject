/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeserver;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class ServerHandeller {

    ServerSocket serverSocket;
    Socket socket;

    static Vector<ServerConnection> ClinetsNum = new Vector<ServerConnection>();
    

    public ServerHandeller() {
        try {
            serverSocket = new ServerSocket(5005);
            acceptClient();
        } catch (IOException ex) {
            Logger.getLogger(ServerHandeller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void acceptClient() {
        new Thread() {
            @Override
            public void run() {

                while (!serverSocket.isClosed()) {

                    try {
                        System.out.println("hello server ");
                        socket = serverSocket.accept();
                        System.out.println("Client connected from " + socket.getInetAddress());
                        ClinetsNum.add(new ServerConnection(socket));
                        System.out.println("server number of clients " + ClinetsNum.size());

                        //System.out.println("Accept new Client is running.......");
                    } catch (IOException ex) {
                        Logger.getLogger(ServerHandeller.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
        }.start();

    }

    public void closeConnection() {
        try {
            for (int i = 0; i < ClinetsNum.size(); i++) {

                try {
                    socket = ClinetsNum.get(i).socket;
                    socket.close();

                    System.err.println(" socket isclosed " + socket.isClosed());
                    System.err.println(" socket isConnected " + socket.isConnected());
                } catch (IOException ex) {
                    Logger.getLogger(ServerHandeller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            serverSocket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServerHandeller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
