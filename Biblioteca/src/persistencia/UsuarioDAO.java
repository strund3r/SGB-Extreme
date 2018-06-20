package persistencia;
import interfaces.CRUDUsuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import regras_de_negocio.Usuario;
import servidor.TCPClient;

public class UsuarioDAO implements CRUDUsuario {
    private TCPClient clienteServidor;
    private String nomeDoArquivo = "";

    public UsuarioDAO(String nomeDoArquivo) {
        clienteServidor = new TCPClient();
        this.nomeDoArquivo = nomeDoArquivo;
    }
    
    @Override
    public int autoincrement() throws Exception{
        ArrayList<Usuario> listaDeUsuario = this.recuperar();
        int maior = 0;
        if (listaDeUsuario.isEmpty()) {
            return maior;
        }else{
            for (int i = 0; i < listaDeUsuario.size(); i++) {
                Usuario aux = listaDeUsuario.get(i);
                if (aux.getId() > maior) {
                    maior = aux.getId();
                }
            }
            return maior + 1;
        }
    }

    @Override
    public void incluir(Usuario objeto) throws Exception {
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo, true);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        //Escreve no arquivo
        bw.write(objeto.desmaterializar() + "\n");
        //fecha o arquivo
        bw.close();
        //ENVIAR PARA O SERVIDOR
        this.clienteServidor.enviarReceberServidor(this.getClass().getName() + ";" + objeto.desmaterializar());
    }

    @Override
    public ArrayList<Usuario> recuperar() throws Exception {
        ArrayList<Usuario> listaDeUsuario = new ArrayList<>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Usuario objetoUsuario = new Usuario();
            objetoUsuario.materializar(linha);
            listaDeUsuario.add(objetoUsuario);
        }
        br.close();
        return listaDeUsuario;
    }
    
    @Override
    public void alterar(int id, Usuario dados) throws Exception {
        ArrayList<Usuario> listaDeUsuario = this.recuperar();

        for (int i = 0; i < listaDeUsuario.size(); i++) {
            Usuario aux = listaDeUsuario.get(i);
            if (aux.getId() == id) {
                this.excluir(id);
                this.incluir(dados);
            }
        }
    }

    @Override
    public void excluir(int id) throws Exception {
        ArrayList<Usuario> listaDeUsuario = this.recuperar();
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < listaDeUsuario.size(); i++) {
            Usuario aux = listaDeUsuario.get(i);
            if (!(aux.getId() == id)) {
                bw.write(aux.desmaterializar() + "\n");
            }
        }
        bw.close();
    }
}