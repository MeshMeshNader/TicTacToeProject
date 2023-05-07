/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeserver;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import static java.lang.System.in;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import tictactoeclient.PopUpIP;
import tictactoeclient.UserDTO;
import tictactoeclient.temp;

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
  UserDTO obj;

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

                        obj = (UserDTO) objectinputstream.readObject();
                        System.out.println(obj.getUserName());
                        System.out.println(obj.getPassword());

                        Integer isValid = loginValidation();
                        objectoutputstream.writeObject(isValid);

                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException ex) {
                        //Logger.getLogger(ServerConnection.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println("end of file ");
                    } 
                }


            }
        }.start();

    }

    public void sendMessage() {

    }

    public Integer loginValidation() {
        int result = 1;
        /*if (obj.getUserName() == "root" && obj.getPassword() == "root") {
            result = 1;
        } else {
            result = 0;
        }*/
        return result;

    }
}
