package persistencia;

import interfaces.CRUDLivro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import regras_de_negocio.Livro;
import servidor.TCPClient;

public class LivroDAO implements CRUDLivro {
    private TCPClient clienteServidor;
    private String nomeDoArquivo = "/app/database/cadastroLivro.csv";


    public LivroDAO(){
        clienteServidor = new TCPClient();
    }

    @Override
    public int autoincrement() throws Exception{
        ArrayList<Livro> listaDeClientes = this.recuperar();
        int maior = 0;
        if (listaDeClientes.isEmpty()) {
            return maior;
        }else{
            for (int i = 0; i < listaDeClientes.size(); i++) {
                Livro aux = listaDeClientes.get(i);
                if (aux.getId() > maior) {
                    maior = aux.getId();
                }
            }
            return maior + 1;
        }
    }

    @Override
    public void incluir(Livro obj) {
        try {
            this.clienteServidor.enviarReceberServidor(this.getClass().getName() + ";" + obj.desmaterializar());
        } catch (IOException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<Livro> recuperar() throws Exception {
        ArrayList<Livro> listaDeClientes = new ArrayList<>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Livro objetoCliente = new Livro();
            objetoCliente.materializar(linha);
            listaDeClientes.add(objetoCliente);
        }
        br.close();
        return listaDeClientes;
    }

    @Override
    public void alterar(int id, Livro dados) throws Exception {
        ArrayList<Livro> listaDeClientes = this.recuperar();
        for (int i = 0; i < listaDeClientes.size(); i++) {
            Livro aux = listaDeClientes.get(i);
            if (aux.getId() == id) {
                this.excluir(id);
                this.incluir(dados);
            }
        }
    }

    @Override
    public void excluir(int id) throws Exception {
        ArrayList<Livro> listaDeClientes = this.recuperar();
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < listaDeClientes.size(); i++) {
            Livro aux = listaDeClientes.get(i);
            if (!(aux.getId() == id)) {
                bw.write(aux.desmaterializar() + "\n");
            }
        }
        bw.close();
    }
}
