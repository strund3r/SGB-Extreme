package service;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer implements Cloneable, Runnable {

    Thread corredor = null;
    ServerSocket servidor = null;
    Socket dados = null;
    volatile boolean deveParar = false;
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public synchronized void iniciarServidor(int port) throws IOException {
        if (corredor == null) {
            servidor = new ServerSocket(port);
            corredor = new Thread(this);
            corredor.start();
        }
    }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public synchronized void pararServidor() {
        if (servidor != null) {
            deveParar = true;
            corredor.interrupt();
            corredor = null;
            try {
                servidor.close();
            } catch (IOException ioe) {
            }
            servidor = null;
        }
    }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public void run() {
        if (servidor != null) {
            while (!deveParar) {
                try {
                    Socket datasocket = servidor.accept();
                    TCPServer newSocket = (TCPServer) clone();
                    newSocket.servidor = null;
                    newSocket.dados = datasocket;
                    newSocket.corredor = new Thread(newSocket);
                    newSocket.corredor.start();
                } catch (Exception e) {
                }
            }
        } else {
            run(dados);
        }
    }
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public void run(Socket data) {}
}