package regras_de_negocio;

import interfaces.TratamentoDeDados;

public class Emprestimo implements TratamentoDeDados{
    
    private int id_emprestimo;
    private int id_cliente;
    private int id_livro;
    private String data_emprestimo;
    private String data_devolucao;

    public Emprestimo() {
    }   

    public Emprestimo(int id_emprestimo, int id_cliente, int id_livro, String data_emprestimo, String data_devolucao) throws Exception {
        Boolean[] empty = {
            String.valueOf(id_cliente).isEmpty(),
            String.valueOf(id_livro).isEmpty()
        };
        String[] excessao = {"Cliente","Livro"};
        
        for (int i = 0; i < empty.length; i++) {
            if (empty[i]) {
                throw new Exception("Escolha um " + excessao[i]);
            }
        }
        
        this.id_emprestimo = id_emprestimo;
        this.id_cliente = id_cliente;
        this.id_livro = id_livro;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

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

    public String getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(String data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
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
        
        setId_emprestimo(id_emprestimo);
        setId_cliente(id_cliente);
        setId_livro(id_livro);
        setData_emprestimo(vetorString[3]);
        setData_devolucao(vetorString[4]);
    }

    @Override
    public String desmaterializar() {
        String saida = getId_emprestimo()+ ";" + getId_cliente()+ ";" + getId_livro() + ";" + getData_emprestimo()+ ";" + getData_devolucao();
        return saida;
    }
}