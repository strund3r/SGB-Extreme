package service;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MeuServidor {
    public static void main(String[] args) {
        TCPServer server = new ManipuladorServidor();
        
        try {
            server.iniciarServidor(6789);
        } catch (IOException ex) {
            Logger.getLogger(MeuServidor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}