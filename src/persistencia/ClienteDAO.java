package persistencia;
import interfaces.CRUD;
import java.io.*;
import java.util.ArrayList;
import regras_de_negocio.Cliente;

public class ClienteDAO implements CRUD {
    private String nomeDoArquivo = "";

    public ClienteDAO(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }

    @Override
    public void incluir(Cliente objeto) throws Exception {
        try {
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivo, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escreve no arquivo
            bw.write(objeto.desmaterializar() + "\n");
            //fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public ArrayList < Cliente > recuperar() throws Exception {
        try {
            ArrayList < Cliente > listaDeClientes = new ArrayList < > ();
            FileReader fr = new FileReader(nomeDoArquivo);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine()) != null) {
                Cliente objetoCliente = new Cliente();
                objetoCliente.materializar(linha);
                listaDeClientes.add(objetoCliente);
            }
            br.close();
            return listaDeClientes;
        } catch (Exception erro) {
            throw erro;
        }
    }

    @Override
    public void excluir(String nome) throws Exception {
        try {
            ArrayList < Cliente > listaDeClientes = this.recuperar();
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivo);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            for (int pos = 0; pos < listaDeClientes.size(); pos++) {
                Cliente aux = listaDeClientes.get(pos);
                if (!(aux.getNome().equals(nome))) {
                    bw.write(aux.desmaterializar() + "\n");
                }
            }
            bw.close();
        } catch (Exception erro) {
            throw erro;
        }
    }
}