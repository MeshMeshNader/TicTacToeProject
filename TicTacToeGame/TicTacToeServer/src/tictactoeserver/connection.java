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
import tictactoeclient.temp;

/**
 *
 * @author dell
 */
public class connection {
    InputStream dis;
    PrintStream ps;
     Socket socket;
     String ip;
     int portNum;
     ObjectInputStream ois;
     
     
     public connection(Socket cs){
        try {
            socket = cs;
            ip = socket.getInetAddress().getHostAddress();
            portNum = socket.getPort();
            dis = cs.getInputStream();
            ois = new ObjectInputStream(dis);
            ps = new PrintStream(cs.getOutputStream());
            readMessage();
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
                       
                       temp obj =(temp) ois.readObject();
                       System.out.println(obj.getIP());
                        System.err.println(obj.getName());
                        System.err.println(obj.n);
                        

                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException ex) {
                        Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        }.start();

    }
}
