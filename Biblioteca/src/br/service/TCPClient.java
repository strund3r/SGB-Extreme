package br.service;


import java.io.*;
import java.net.*;

public class TCPClient {

    /**
     * @param args the command line arguments
     */
    public String sendReceiveSever(String data) throws UnknownHostException, IOException {
        // TODO code application logic here
               
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("127.0.0.1", 6789);
        DataOutputStream outServer = new DataOutputStream(clientSocket.getOutputStream());
        
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        outServer.writeBytes(data + '\n');
        data = inFromServer.readLine();
        System.out.println("Do Servidor: " + data);
        clientSocket.close();
        return data;
    }
}
