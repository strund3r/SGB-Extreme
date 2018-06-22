package servidor;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {

    public String enviarReceberServidor(String dados) throws UnknownHostException, IOException {
        // TODO code application logic here
               
        BufferedReader noUsuario = new BufferedReader(new InputStreamReader(System.in));
        Socket socketDoCliente = new Socket("34.224.209.18", 2020);
        DataOutputStream saidaServidor = new DataOutputStream(socketDoCliente.getOutputStream());
        
        BufferedReader noServidor = new BufferedReader(new InputStreamReader(socketDoCliente.getInputStream()));

        saidaServidor.writeBytes(dados + '\n');
        dados = noServidor.readLine();
        System.out.println("Do Servidor: " + dados);
        socketDoCliente.close();
        return dados;
    }
}