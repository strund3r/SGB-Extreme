package regras_de_negocio;

import interfaces.TratamentoDeDados;

public class Cliente implements TratamentoDeDados{
    
    private int id;
    private String nome;
    private String fone;
    private String cpf;
    private String sexo;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String Uf;
    private String dataNasc;
    private String tipo;
    private String caminhoIMG;

    public Cliente(int id, String nome, String fone, String cpf, String sexo, String cep, String logradouro, String complemento, String bairro, String cidade, String uf, String dataNasc, String tipo, String caminho) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
        this.sexo = sexo;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.Uf = uf;
        this.dataNasc = dataNasc;
        this.tipo = tipo;
        this.caminhoIMG = caminho;
    }
    
    public Cliente() { }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getFone() {
        return fone;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUf() {
        return Uf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCaminhoIMG() {
        return caminhoIMG;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUf(String Uf) {
        this.Uf = Uf;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCaminhoIMG(String caminhoIMG) {
        this.caminhoIMG = caminhoIMG;
    }
    
    @Override
    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");
        if(vetorString.length != 14) {
            for (String posicao : vetorString) {
                throw new Exception("Faltam dados na String " + posicao);
            }
        }
  
        String idString = vetorString[0];
        setId(Integer.parseInt(idString));
        setNome(vetorString[1]);
        setFone(vetorString[2]);
        setCpf(vetorString[3]);
        setSexo(vetorString[4]);
        setCep(vetorString[5]);
        setLogradouro(vetorString[6]);
        setComplemento(vetorString[7]);
        setBairro(vetorString[8]);
        setCidade(vetorString[9]);
        setUf(vetorString[10]);
        setDataNasc(vetorString[11]);
        setTipo(vetorString[12]);
        setCaminhoIMG(vetorString[13]);
    }

    @Override
    public String desmaterializar() {
        String saida = getId() + ";"
                    + getNome() + ";"
                    + getFone() + ";"
                    + getCpf() + ";"
                    + getSexo() + ";"
                    + getCep() + ";"
                    + getLogradouro() + ";"
                    + getComplemento() + ";"
                    + getBairro() + ";"
                    + getCidade() + ";"
                    + getUf() + ";"
                    + getDataNasc() + ";"
                    + getTipo()+ ";"
                    + getCaminhoIMG();
        return saida;
    }   
}