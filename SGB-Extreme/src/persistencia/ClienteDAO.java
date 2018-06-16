package persistencia;
import interfaces.CRUDCliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import regras_de_negocio.Cliente;

public class ClienteDAO implements CRUDCliente {
    private String nomeDoArquivo = "";
    private TCPClient clientServer = new TCPClient();

    public ClienteDAO(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }
    
    @Override
    public int autoincrement() throws Exception{
        ArrayList<Cliente> listaDeClientes = this.recuperar();
        int maior = 0;
        if (listaDeClientes.isEmpty()) {
            return maior;
        }else{
            for (int i = 0; i < listaDeClientes.size(); i++) {
                Cliente aux = listaDeClientes.get(i);
                if (aux.getId() > maior) {
                    maior = aux.getId();
                }
            }
            return maior + 1;
        }
    }

    @Override
    public void incluir(Cliente objeto) throws Exception {
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo, true);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        //Escreve no arquivo
        //clientServer.enviarReceber(objeto.desmaterializar());
        bw.write(objeto.desmaterializar() + "\n");
        //fecha o arquivo
        bw.close();
    }

    @Override
    public ArrayList<Cliente> recuperar() throws Exception {
        ArrayList<Cliente> listaDeClientes = new ArrayList<>();
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
    }
    
    @Override
    public void alterar(int id, Cliente dados) throws Exception {
        ArrayList<Cliente> listaDeClientes = this.recuperar();

        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente aux = listaDeClientes.get(i);
            if (aux.getId() == id) {
                this.excluir(id);
                this.incluir(dados);
            }
        }
    }

    @Override
    public void excluir(int id) throws Exception {
        ArrayList<Cliente> listaDeClientes = this.recuperar();
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < listaDeClientes.size(); i++) {
            Cliente aux = listaDeClientes.get(i);
            if (!(aux.getId() == id)) {
                bw.write(aux.desmaterializar() + "\n");
            }
        }
        bw.close();
    }
}