package regras_de_negocio;

import interfaces.TratamentoDeDados;

public class Livro implements TratamentoDeDados {
    
    private int id;
    private String exemplar;
    private String autor;
    private byte edicao;
    private short ano;
    private String disponibilidade;

    public Livro(int id, String exemplar, String autor, byte edicao, short ano, String disponibilidade) {
        this.id = id;
        this.exemplar = exemplar;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
        this.disponibilidade = disponibilidade;
    }

    public Livro() {
    }   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExemplar() {
        return exemplar;
    }

    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public byte getEdicao() {
        return edicao;
    }

    public void setEdicao(byte edicao) {
        this.edicao = edicao;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }    

    @Override
    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");
        if(vetorString.length != 6)
            throw new Exception("Faltam dados na String");
  
        String idString = String.valueOf(getId());
        String edicaoString = String.valueOf(getEdicao());
        String anoString = String.valueOf(ano);
        
        idString = vetorString[0];
        setExemplar(vetorString[1]);
        setAutor(vetorString[2]);
        edicaoString = vetorString[3];
        anoString = vetorString[4];
        setDisponibilidade(vetorString[5]);
    }

    @Override
    public String desmaterializar() {
        String saida = getExemplar()+ ";" + getAutor()+ ";" + getEdicao()+ ";" + getAno()+ ";" + getDisponibilidade();
        return saida;
    }
}