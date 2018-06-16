package regras_de_negocio;

import interfaces.TratamentoDeDados;

public class Reserva implements TratamentoDeDados{
    
    private int id_reserva;
    private int id_cliente;
    private int id_livro;
    private String data_reserva;
    private String dia_emprestimo;

    public Reserva() {}

    public Reserva(int id_reserva, int id_cliente, int id_livro, String data_reserva, String dia_emprestimo) throws Exception {
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
        
        this.id_reserva = id_reserva;
        this.id_cliente = id_cliente;
        this.id_livro = id_livro;
        this.data_reserva = data_reserva;
        this.dia_emprestimo = dia_emprestimo;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_emprestimo) {
        this.id_reserva = id_emprestimo;
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

    public String getData_reserva() {
        return data_reserva;
    }

    public void setData_reserva(String data_reserva) {
        this.data_reserva = data_reserva;
    }

    public String getDia_emprestimo() {
        return dia_emprestimo;
    }

    public void setDia_emprestimo(String dia_emprestimo) {
        this.dia_emprestimo = dia_emprestimo;
    }

    @Override
    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");
        if(vetorString.length != 5) {
            for (int i = 0; i < vetorString.length; i++) {
                throw new Exception("Faltam dados na posição " + i);
            }
        }
  
        int id_reserva = Integer.parseInt(vetorString[0]);
        int id_cliente = Integer.parseInt(vetorString[1]);
        int id_livro = Integer.parseInt(vetorString[2]);
        
        setId_reserva(id_reserva);
        setId_cliente(id_cliente);
        setId_livro(id_livro);
        setData_reserva(vetorString[3]);
        setDia_emprestimo(vetorString[4]);
    }

    @Override
    public String desmaterializar() {
        String saida = getId_reserva()+ ";" + getId_cliente()+ ";" + getId_livro() + ";" + getData_reserva()+ ";" + getDia_emprestimo();
        return saida;
    }
}