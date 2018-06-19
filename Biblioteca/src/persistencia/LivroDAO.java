package persistencia;

import interfaces.CRUDLivro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import servidor.TCPClient;

public class LivroDAO implements CRUDLivro {
    private TCPClient clienteServidor;
    
   
    public LivroDAO(){
        clienteServidor = new TCPClient();
        
    }
    
    @Override
    public int autoincrement() throws Exception{
        /*
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
        */
        return 1;
    }

    @Override
    public void incluir(String str) {
        try {
            this.clienteServidor.enviarReceberServidor(str);
        } catch (IOException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public ArrayList<String> recuperar() throws Exception {
        ArrayList<String> listaDeClientes = new ArrayList<>();
        /*
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Livro objetoCliente = new Livro();
            objetoCliente.materializar(linha);
            listaDeClientes.add(objetoCliente);
        }
        br.close();
        */
        return listaDeClientes;
    }
    
    @Override
    public void alterar(int id, String dados) throws Exception {
        /*
        ArrayList<Livro> listaDeClientes = this.recuperar();
        for (int i = 0; i < listaDeClientes.size(); i++) {
            Livro aux = listaDeClientes.get(i);
            if (aux.getId() == id) {
                this.excluir(id);
                this.incluir(dados);
            }
        }
        */
    }

    @Override
    public void excluir(int id) throws Exception {
        /*
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
        */
    }
}