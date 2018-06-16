package regras_de_negocio;

import interfaces.TratamentoDeDados;

public class Cliente implements TratamentoDeDados{
    
    private int id;
    private String nome;
    private String fone;
    private String cpf;
    private String email;
    private String sexo;
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private String dataNasc;
    private String matricula;
    private String tipo;

    public Cliente(int id, String nome, String fone, String cpf, String email, String sexo, String cep, String logradouro, String complemento, String bairro, String cidade, String uf, String dataNasc, String matricula, String tipo) throws Exception {
        
        Boolean[] empty = {
            nome.isEmpty(),
            fone.replaceAll("[^0-9]", "").isEmpty(),
            cpf.replaceAll("[^0-9]", "").isEmpty(),
            logradouro.isEmpty(),
            bairro.isEmpty(),
            cidade.isEmpty(),
            uf.isEmpty(),
            matricula.replaceAll("[^0-9]", "").isEmpty()
        };
        String[] excessao = {"Nome","Telefone","CPF","Rua","Bairro","Cidade","UF","Matricula"};
        
        for (int i = 0; i < empty.length; i++) {
            if (empty[i]) {
                throw new Exception("Preencha o campo " + excessao[i]);
            }
        }

        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.cpf = cpf;
        this.email = email;
        this.sexo = sexo;
        this.cep = cep;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.uf = uf;
        this.dataNasc = dataNasc;
        this.matricula = matricula;
        this.tipo = tipo;
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

    public String getEmail() {
        return email;
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
        return uf;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMatricula() {
        return matricula;
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

    public void setEmail(String email) {
        this.email = email;
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
        this.uf = Uf;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    @Override
    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");
        if(vetorString.length != 15) {
            for (int i = 0; i < vetorString.length; i++) {
                throw new Exception("Faltam dados na posição " + i);
            }
        }
  
        int id = Integer.parseInt(vetorString[0]);
        
        setId(id);
        setNome(vetorString[1]);
        setFone(vetorString[2]);
        setCpf(vetorString[3]);
        setEmail(vetorString[4]);
        setSexo(vetorString[5]);
        setCep(vetorString[6]);
        setLogradouro(vetorString[7]);
        setComplemento(vetorString[8]);
        setBairro(vetorString[9]);
        setCidade(vetorString[10]);
        setUf(vetorString[11]);
        setDataNasc(vetorString[12]);
        setMatricula(vetorString[13]);
        setTipo(vetorString[14]);
    }

    @Override
    public String desmaterializar() {
        String saida = getId() + ";"
                + getNome() + ";"
                + getFone() + ";"
                + getCpf() + ";"
                + getEmail() + ";"
                + getSexo() + ";"
                + getCep() + ";"
                + getLogradouro() + ";"
                + getComplemento() + ";"
                + getBairro() + ";"
                + getCidade() + ";"
                + getUf() + ";"
                + getDataNasc() + ";"
                + getMatricula() + ";"
                + getTipo();
        return saida;
    }
}