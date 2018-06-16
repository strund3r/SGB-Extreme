package br.service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerHandler extends TCPServer {
    public void run(Socket data) {
        try {
            //InputStream is = data.getInputStream();
            //OutputStream os = data.getOutputStream();
            // Process the data socket here.
            String dataStr;
            

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(data.getInputStream()));;
            DataOutputStream outToClient = new DataOutputStream(data.getOutputStream());
            
            dataStr = inFromClient.readLine();
            System.out.println(dataStr);
            
            if(dataStr.split(";")[0]=="br.model.Livro"){
                
            }
            
            outToClient.writeBytes("");
        } catch (Exception e) {}
    }
}