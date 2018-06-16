package br.service;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyServer {
    public static void main(String[] args) {
        TCPServer server = new ServerHandler();
        
        try {
            server.startServer(6789);
        } catch (IOException ex) {
            Logger.getLogger(MyServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}