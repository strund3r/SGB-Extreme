package service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import persistencia.ClienteDAO;
import persistencia.EmprestimoDAO;
import persistencia.LivroDAO;
import persistencia.ReservaDAO;
import persistencia.UsuarioDAO;
import regras_de_negocio.Cliente;
import regras_de_negocio.Emprestimo;
import regras_de_negocio.Livro;
import regras_de_negocio.Reserva;
import regras_de_negocio.Usuario;

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
                
                LivroDAO livroDAO = new LivroDAO("/app/database/cadastroLivro.csv");

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
                ClienteDAO cadastroClientes = new ClienteDAO("/app/database/cadastroCliente.csv");
                cadastroClientes.incluir(cliente);
            }else if ("persistencia.ReservaDAO".equals(dadoString.split(";")[0])) {
                ReservaDAO cadastroReserva = new ReservaDAO("/app/database/cadastroReserva.csv");
                Reserva reserva = new Reserva(
                        Integer.parseInt(dadoString.split(";")[1]),
                        Integer.parseInt(dadoString.split(";")[2]),
                        Integer.parseInt(dadoString.split(";")[3]),
                        dadoString.split(";")[4],
                        dadoString.split(";")[5]
                );
                cadastroReserva.incluir(reserva);
            }else if ("persistencia.EmprestimoDAO".equals(dadoString.split(";")[0])) {
                EmprestimoDAO cadastroEmprestimo = new EmprestimoDAO("/app/database/cadastroEmprestimo.csv");
                Emprestimo emprestimo = new Emprestimo(
                        Integer.parseInt(dadoString.split(";")[1]),
                        Integer.parseInt(dadoString.split(";")[2]),
                        Integer.parseInt(dadoString.split(";")[3]),
                        dadoString.split(";")[4],
                        dadoString.split(";")[5]
                );
                cadastroEmprestimo.incluir(emprestimo);
            }else if ("persistencia.UsuarioDAO".equals(dadoString.split(";")[0])) {
                UsuarioDAO cadastroUsuario = new UsuarioDAO("/app/database/cadastroUsuarios.csv");
                Usuario usuario = new Usuario(
                        Integer.parseInt(dadoString.split(";")[1]),
                        dadoString.split(";")[2],
                        dadoString.split(";")[3]
                );
                cadastroUsuario.incluir(usuario);
            }
            
            saidaCliente.writeBytes("");
        } catch (Exception e) {}
    }
}