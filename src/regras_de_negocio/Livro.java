package regras_de_negocio;

import interfaces.TratamentoDeDados;

public class Livro implements TratamentoDeDados {
    
    private int id;
    private String titulo;
    private int exemplares;
    private String autor;
    private String editora;
    private byte edicao;
    private short ano;
    private String disponibilidade;
    private int isbn;

    public Livro(int id, String titulo, int exemplar, String autor, String editora, byte edicao, short ano, String disponibilidade, int isbn) throws Exception {
        Boolean[] empty = {
            titulo.isEmpty(),
            String.valueOf(exemplar).isEmpty(),
            autor.isEmpty(),
            String.valueOf(editora).isEmpty(),
            String.valueOf(edicao).isEmpty(),
            String.valueOf(ano).isEmpty(),
            disponibilidade.isEmpty()
        };
        String[] excessao = {"Titulo","Exemplar","Autor","Editora","Edição","Ano","Disponibilidade"};
        
        for (int i = 0; i < empty.length; i++) {
            if (empty[i]) {
                throw new Exception("Preencha o campo " + excessao[i]);
            }
        }
        
        this.id = id;
        this.titulo = titulo;
        this.exemplares = exemplar;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.ano = ano;
        this.disponibilidade = disponibilidade;
        this.isbn = isbn;
    }

    public Livro() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getExemplares() {
        return exemplares;
    }

    public void setExemplares(int exemplares) {
        this.exemplares = exemplares;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");
        if(vetorString.length != 9) {
            for (int i = 0; i < vetorString.length; i++) {
                throw new Exception("Faltam dados na posição " + i);
            }
        }
  
        int id = Integer.parseInt(vetorString[0]);
        setId(id);
        
        setTitulo(vetorString[1]);
 
        int exemplares = Integer.parseInt(vetorString[2]);
        setExemplares(exemplares);
        
        setAutor(vetorString[3]);
        
        setEditora(vetorString[4]);
        
        byte edicao = Byte.parseByte(vetorString[5]);
        setEdicao(edicao);
        
        short ano = Short.parseShort(vetorString[6]);
        setAno(ano);
        
        setDisponibilidade(vetorString[7]);
        
        int isbn = Integer.parseInt(vetorString[8]);
        setIsbn(isbn);
    }

    @Override
    public String desmaterializar() {
        String saida = getId()+ ";" + getTitulo()+ ";" + getExemplares()+ ";" + getAutor()+ ";" + getEditora()+ ";" + getEdicao()+ ";" + getAno()+ ";" + getDisponibilidade()+ ";" + getIsbn();
        return saida;
    }
}