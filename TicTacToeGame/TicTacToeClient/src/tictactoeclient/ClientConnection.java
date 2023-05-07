/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoeclient;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class ClientConnection {

    InputStream inputstream;
    OutputStream outpuststream;
    ObjectInputStream objectinputstream;
    ObjectOutputStream objectoutputstream;
    Socket socket;
    String ip;
    String request;
    UserDTO user = new UserDTO();
    Integer result;

    public ClientConnection(String ip) {
        try {
            if (socket == null || !socket.isConnected() || socket.isClosed()) {
                socket = new Socket(ip, 5005);
                outpuststream = socket.getOutputStream();
                objectoutputstream = new ObjectOutputStream(outpuststream);
                readMessage();

            }
            ip = socket.getLocalAddress().getHostAddress();
        } catch (IOException ex) {
            Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ClientConnection(UserDTO user) {
        if (socket == null || !socket.isConnected() || socket.isClosed()) {
            try {
                socket = new Socket("192.168.1.11", 5005);
                outpuststream = socket.getOutputStream();
                objectoutputstream = new ObjectOutputStream(outpuststream);
                inputstream = socket.getInputStream();
                objectinputstream = new ObjectInputStream(inputstream);
                readMessage();
            } catch (IOException ex) {
                Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        ip = socket.getLocalAddress().getHostAddress();

    }

    public ClientConnection(GameDTO game) {
        if (socket == null || !socket.isConnected() || socket.isClosed()) {
            try {
                socket = new Socket(ip, 5005);
                outpuststream = socket.getOutputStream();
                objectoutputstream = new ObjectOutputStream(outpuststream);
                inputstream = socket.getInputStream();
                objectinputstream = new ObjectInputStream(inputstream);
                readMessage();
            } catch (IOException ex) {
                Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        ip = socket.getLocalAddress().getHostAddress();

    }

    public ClientConnection(MoveDTO move) {
        if (socket == null || !socket.isConnected() || socket.isClosed()) {
            try {
                socket = new Socket(ip, 5005);
                outpuststream = socket.getOutputStream();
                objectoutputstream = new ObjectOutputStream(outpuststream);
                inputstream = socket.getInputStream();
                objectinputstream = new ObjectInputStream(inputstream);
                readMessage();
            } catch (IOException ex) {
                Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        ip = socket.getLocalAddress().getHostAddress();

    }

    public Integer readMessage() {
        new Thread() {

            @Override
            public void run() {
                try {
                    while (socket.isConnected() && !socket.isClosed()) {

                      result = (Integer) objectinputstream.readObject();
                        System.out.println(result + " ");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        }.start();
        //return i;
        return result;

    }

    public void writeMessage(Object object) {
        new Thread() {
            @Override
            public void run() {
                try {
                    objectoutputstream.writeObject(object);
                } catch (IOException ex) {
                    Logger.getLogger(ClientConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }.start();
    }

}
