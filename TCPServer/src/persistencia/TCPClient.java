package persistencia;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

    public String enviarReceber(String strOut) throws UnknownHostException, IOException {
        // TODO code application logic here
        String strIn;

        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("34.224.209.18", 2020);
        DataOutputStream outServer = new DataOutputStream(clientSocket.getOutputStream());

        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        outServer.writeBytes(strOut + '\n');
        strIn = inFromServer.readLine();
        System.out.println("Do Servidor: "+ strIn);
        clientSocket.close();
        return strIn;
    }
}
