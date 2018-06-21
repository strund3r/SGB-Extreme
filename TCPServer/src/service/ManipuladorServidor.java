package service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import persistencia.ClienteDAO;
import persistencia.LivroDAO;
import regras_de_negocio.Cliente;
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
            
            Livro livro = null;
            if ("persistencia.LivroDAO".equals(dadoString.split(";")[0])) {
                livro = new Livro(
                    Integer.parseInt(dadoString.split(";")[1]),
                    dadoString.split(";")[2],
                    Integer.parseInt(dadoString.split(";")[3]),
                    dadoString.split(";")[4],
                    dadoString.split(";")[5],
                    Integer.parseInt(dadoString.split(";")[6]),
                    dadoString.split(";")[7],
                    Integer.parseInt(dadoString.split(";")[8]),
                    dadoString.split(";")[9]
                 );
                
                LivroDAO livroDAO = new LivroDAO("/home/ec2-user/cadastroLivro.csv");

                livroDAO.incluir(livro);
            }else if ("persistencia.ClienteDAO".equals(dadoString.split(";")[0])) {
                Cliente cliente = new Cliente(
                    Integer.parseInt(dadoString.split(";")[1]),
                    dadoString.split(";")[2],
                    dadoString.split(";")[3],
                    dadoString.split(";")[4],
                    dadoString.split(";")[5],
                    dadoString.split(";")[6],
                    dadoString.split(";")[7],
                    dadoString.split(";")[8],
                    dadoString.split(";")[9],
                    dadoString.split(";")[10],
                    dadoString.split(";")[11],
                    dadoString.split(";")[12],
                    dadoString.split(";")[13],
                    dadoString.split(";")[14],
                    dadoString.split(";")[15]
                );
                ClienteDAO cadastroClientes = new ClienteDAO("/home/ec2-user/cadastroCliente.csv");
                cadastroClientes.incluir(cliente);
            }
            
            saidaCliente.writeBytes("");
        } catch (Exception e) {}
    }
}