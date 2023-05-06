/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeserver;

import java.io.DataInputStream;
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
import tictactoeclient.UserDTO;
import tictactoeclient.temp;

/**
 *
 * @author dell
 */
public class connection {
    InputStream inputstream;
    OutputStream outputstream;
    ObjectInputStream objectinputstream;
    ObjectOutputStream objectoutputstream;
    Socket socket;
    String ip;
    int portNum;
    UserDTO obj;
     
     
     
     public connection(Socket socket){
        try {
            this.socket = socket;
            ip = socket.getInetAddress().getHostAddress();
            portNum = socket.getPort();
            inputstream = socket.getInputStream();
            outputstream = socket.getOutputStream();
            objectinputstream = new ObjectInputStream(inputstream);
            readMessage();
            /*int isValid = loginValidation();
            objectoutputstream = new ObjectOutputStream(outputstream);
            objectoutputstream.write(isValid);*/
            
        } catch (IOException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
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

                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException ex) {
                        Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }.start();

    }
    public void sendMessage(){
    
    
    }
    
    public int loginValidation() {
        int result;
        if (obj.getUserName() == "root" && obj.getPassword() == "root") {
            result = 1;
        } else {
            result = 0;
        }
        return result;

    }
}
