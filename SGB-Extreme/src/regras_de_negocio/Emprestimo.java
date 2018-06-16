package regras_de_negocio;

import interfaces.TratamentoDeDados;
import java.util.Date;
import helper.ConversorData;

public class Emprestimo implements TratamentoDeDados{
    private int id_emprestimo;
    private int id_cliente;
    private int id_livro;
    private Date dia_emprestimo;
    private Date data_devolucao;
    
    // 7 Dias em milisegundos
    //static final int DIAS_EMPRESTIMO = 60 * 60 * 24 * 7 * 1000;
    
    public Emprestimo(){}

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public Date getDia_emprestimo() {
        return dia_emprestimo;
    }

    public void setDia_emprestimo(Date dia_emprestimo) {
        this.dia_emprestimo = dia_emprestimo;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }   

    @Override
    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");
        if(vetorString.length != 5) {
            for (int i = 0; i < vetorString.length; i++) {
                throw new Exception("Faltam dados na posição " + i);
            }
        }
  
        int id_emprestimo = Integer.parseInt(vetorString[0]);
        int id_cliente = Integer.parseInt(vetorString[1]);
        int id_livro = Integer.parseInt(vetorString[2]);
        
        Date emprestimo = ConversorData.toDate(vetorString[3]);
        Date devolucao = ConversorData.toDate(vetorString[4]);
        
        setId_emprestimo(id_emprestimo);
        setId_cliente(id_cliente);
        setId_livro(id_livro);
        setDia_emprestimo(emprestimo);
        setData_devolucao(devolucao);
    }
    @Override
    public String desmaterializar() {
        String saida = getId_emprestimo()+ ";" + getId_cliente()+ ";" + getId_livro() + ";" + getDia_emprestimo()+ ";" + getData_devolucao();
        return saida;
    }
}