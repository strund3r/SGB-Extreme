package service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import persistencia.LivroDAO;
import regras_de_negocio.Livro;

public class ManipuladorServidor extends TCPServer {
    @Override
    public void run(Socket data) {
        try {
            //InputStream is = data.getInputStream();
            //OutputStream os = data.getOutputStream();
            // Process the data socket here.
            String dadoString;
            

            BufferedReader noCliente = new BufferedReader(new InputStreamReader(data.getInputStream()));
            DataOutputStream saidaCliente = new DataOutputStream(data.getOutputStream());
            
            dadoString = noCliente.readLine();
            System.out.println(dadoString);
            
            Livro livro = new Livro(
                    Integer.parseInt(dadoString.split(";")[0]),
                    dadoString.split(";")[1],
                    Integer.parseInt(dadoString.split(";")[2]),
                    dadoString.split(";")[3],
                    dadoString.split(";")[4],
                    Integer.parseInt(dadoString.split(";")[5]),
                    dadoString.split(";")[6],
                    Integer.parseInt(dadoString.split(";")[7]),
                    dadoString.split(";")[8]
                 );
                    
            LivroDAO livroDAO = new LivroDAO("/home/umbrellatec/Documentos/cadastroLivro.csv");

            livroDAO.incluir(livro);
            
            saidaCliente.writeBytes("");
        } catch (Exception e) {}
    }
}