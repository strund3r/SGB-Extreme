package persistencia;

import interfaces.CRUDEmprestimo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import regras_de_negocio.Emprestimo;
import servidor.TCPClient;

public class EmprestimoDAO implements CRUDEmprestimo{
    private TCPClient clienteServidor;
    private String nomeDoArquivo = "";
    
    public EmprestimoDAO(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
        clienteServidor = new TCPClient();
    }

    @Override
    public int autoincrement() throws Exception{
        ArrayList<Emprestimo> listaDeEmprestimo = this.recuperar();
        int maior = 0;
        if (listaDeEmprestimo.isEmpty()) {
            return maior;
        }else{
            for (int i = 0; i < listaDeEmprestimo.size(); i++) {
                Emprestimo aux = listaDeEmprestimo.get(i);
                if (aux.getId_emprestimo()> maior) {
                    maior = aux.getId_emprestimo();
                }
            }
            return maior + 1;
        }
    }

    @Override
    public void incluir(Emprestimo objeto) throws Exception {
        //ENVIAR PARA O SERVIDOR
        this.clienteServidor.enviarReceberServidor(this.getClass().getName() + ";" + objeto.desmaterializar());
    }

    @Override
    public ArrayList<Emprestimo> recuperar() throws Exception {
        ArrayList<Emprestimo> listaDeClientes = new ArrayList<>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Emprestimo objetoCliente = new Emprestimo();
            objetoCliente.materializar(linha);
            listaDeClientes.add(objetoCliente);
        }
        br.close();
        return listaDeClientes;
    }
    
    @Override
    public void alterar(int id, Emprestimo dados) throws Exception {
        ArrayList<Emprestimo> listaDeClientes = this.recuperar();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            Emprestimo aux = listaDeClientes.get(i);
            if (aux.getId_emprestimo()== id) {
                this.excluir(id);
                this.incluir(dados);
            }
        }
    }

    @Override
    public void excluir(int id) throws Exception {
        ArrayList<Emprestimo> listaDeClientes = this.recuperar();
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < listaDeClientes.size(); i++) {
            Emprestimo aux = listaDeClientes.get(i);
            if (!(aux.getId_emprestimo() == id)) {
                bw.write(aux.desmaterializar() + "\n");
            }
        }
        bw.close();
    }
}