package persistencia;

import interfaces.CRUDMulta;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import regras_de_negocio.Multa;
import servidor.TCPClient;

public class MultaDAO implements CRUDMulta{
    private TCPClient clienteServidor;
    private String nomeDoArquivo = "";

    public MultaDAO(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
        clienteServidor = new TCPClient();
    }
    
    @Override
    public int autoincrement() throws Exception{
        ArrayList<Multa> listaDeMulta = this.recuperar();
        int maior = 0;
        if (listaDeMulta.isEmpty()) {
            return maior;
        }else{
            for (int i = 0; i < listaDeMulta.size(); i++) {
                Multa aux = listaDeMulta.get(i);
                if (aux.getId_multa()> maior) {
                    maior = aux.getId_multa();
                }
            }
            return maior + 1;
        }
    }

    @Override
    public void incluir(Multa objeto) throws Exception {
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
    public ArrayList<Multa> recuperar() throws Exception {
        ArrayList<Multa> listaDeMulta = new ArrayList<>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Multa objetoMulta = new Multa();
            objetoMulta.materializar(linha);
            listaDeMulta.add(objetoMulta);
        }
        br.close();
        return listaDeMulta;
    }
    
    @Override
    public void alterar(int id, Multa dados) throws Exception {
        ArrayList<Multa> listaDeMulta = this.recuperar();

        for (int i = 0; i < listaDeMulta.size(); i++) {
            Multa aux = listaDeMulta.get(i);
            if (aux.getId_multa()== id) {
                this.excluir(id);
                this.incluir(dados);
            }
        }
    }

    @Override
    public void excluir(int id) throws Exception {
        ArrayList<Multa> listaDeMulta = this.recuperar();
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < listaDeMulta.size(); i++) {
            Multa aux = listaDeMulta.get(i);
            if (!(aux.getId_multa() == id)) {
                bw.write(aux.desmaterializar() + "\n");
            }
        }
        bw.close();
    }
}