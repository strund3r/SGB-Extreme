import java.net.*;
import java.io.*;
public class ServerHandler extends TCPServer {
    public void run(Socket data) {
        try {
            //InputStream is = data.getInputStream();
            //OutputStream os = data.getOutputStream();
            // Process the data socket here.
            String clientSentence;
            String capitalizedSentence;

            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(data.getInputStream()));;
            DataOutputStream outToClient = new DataOutputStream(data.getOutputStream());
            clientSentence = inFromClient.readLine();
            System.out.println(clientSentence);
            capitalizedSentence= clientSentence +'\n';
            outToClient.writeBytes(capitalizedSentence);
        } catch (Exception e) {}
    }
}