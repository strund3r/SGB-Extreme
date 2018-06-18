package regras_de_negocio;

import interfaces.TratamentoDeDados;

public class Multa implements TratamentoDeDados{
    private int id_multa;
    private int id_cliente;
    private String data;
    private float valor;

    public Multa(int id_multa, int id_cliente, String data, float valor) {
        this.id_multa = id_multa;
        this.id_cliente = id_cliente;
        this.data = data;
        this.valor = valor;
    }

    public Multa() {}

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");
        if(vetorString.length != 4) {
            for (String i : vetorString) {
                throw new Exception("Faltam dados na posição " + i);
            }
        }
  
        int id_multa = Integer.parseInt(vetorString[0]);
        int id_cliente = Integer.parseInt(vetorString[1]);
        float valor = Float.parseFloat(vetorString[2]);
        
        setId_multa(id_multa);
        setId_cliente(id_cliente);
        setData(vetorString[3]);
        setValor(valor);
    }

    @Override
    public String desmaterializar() {
        String saida = getId_multa()+ ";" + getId_cliente()+ ";" + getData()+ ";" + getValor();
        return saida;
    }
}