import br.model.Cliente;
import java.io.*;
import java.net.*;

public class TCPClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here
        String sentence;
        String modifiedSentence;
        Cliente cliente = new Cliente();
       
        BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in));
        Socket clientSocket = new Socket("127.0.0.1", 6789);
        DataOutputStream outServer = new DataOutputStream(clientSocket.getOutputStream());
        
        BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        
        cliente.setNome("daniel correa da silva");
        cliente.setCpf("999.999.999.-99");
        cliente.setPeso(60);
        cliente.setIdade(20);
        
        sentence =  cliente.toString();
        //inFromUser.readLine();
        outServer.writeBytes(sentence + '\n');
        modifiedSentence = inFromServer.readLine();
        System.out.println("Do Servidor: "+modifiedSentence);
        clientSocket.close();
        
    }
}
