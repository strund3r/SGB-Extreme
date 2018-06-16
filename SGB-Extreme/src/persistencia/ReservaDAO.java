package persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import regras_de_negocio.Reserva;
import interfaces.CRUDReserva;

public class ReservaDAO implements CRUDReserva{
    private String nomeDoArquivo = "";

    public ReservaDAO(String nomeDoArquivo) {
        this.nomeDoArquivo = nomeDoArquivo;
    }
    
    @Override
    public int autoincrement() throws Exception{
        ArrayList<Reserva> listaDeReserva = this.recuperar();
        int maior = 0;
        if (listaDeReserva.isEmpty()) {
            return maior;
        }else{
            for (int i = 0; i < listaDeReserva.size(); i++) {
                Reserva aux = listaDeReserva.get(i);
                if (aux.getId_reserva()> maior) {
                    maior = aux.getId_reserva();
                }
            }
            return maior + 1;
        }
    }

    @Override
    public void incluir(Reserva objeto) throws Exception {
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo, true);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        //Escreve no arquivo
        bw.write(objeto.desmaterializar() + "\n");
        //fecha o arquivo
        bw.close();
    }

    @Override
    public ArrayList<Reserva> recuperar() throws Exception {
        ArrayList<Reserva> listaDeClientes = new ArrayList<>();
        FileReader fr = new FileReader(nomeDoArquivo);
        BufferedReader br = new BufferedReader(fr);
        String linha = "";
        while ((linha = br.readLine()) != null) {
            Reserva objetoCliente = new Reserva();
            objetoCliente.materializar(linha);
            listaDeClientes.add(objetoCliente);
        }
        br.close();
        return listaDeClientes;
    }
    
    @Override
    public void alterar(int id, Reserva dados) throws Exception {
        ArrayList<Reserva> listaDeEmprestimo = this.recuperar();

        for (int i = 0; i < listaDeEmprestimo.size(); i++) {
            Reserva aux = listaDeEmprestimo.get(i);
            if (aux.getId_reserva()== id) {
                this.excluir(id);
                this.incluir(dados);
            }
        }
    }

    @Override
    public void excluir(int id) throws Exception {
        ArrayList<Reserva> listaDeEmprestimos = this.recuperar();
        //cria o arquivo
        FileWriter fw = new FileWriter(nomeDoArquivo);
        //Criar o buffer do arquivo
        BufferedWriter bw = new BufferedWriter(fw);
        for (int i = 0; i < listaDeEmprestimos.size(); i++) {
            Reserva aux = listaDeEmprestimos.get(i);
            if (!(aux.getId_reserva() == id)) {
                bw.write(aux.desmaterializar() + "\n");
            }
        }
        bw.close();
    }
}