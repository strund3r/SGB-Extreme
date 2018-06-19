package regras_de_negocio;

import interfaces.TratamentoDeDados;

public class Usuario implements TratamentoDeDados{
    
    private int id;
    private String login;
    private String senha;

    public Usuario(int id, String login, String senha) throws Exception {
        
        Boolean[] empty = {login.isEmpty(), senha.isEmpty()};
        String[] excessao = {"login","senha"};
        
        for (int i = 0; i < empty.length; i++) {
            if (empty[i]) {
                throw new Exception("Preencha o campo " + excessao[i]);
            }
        }

        this.id = id;
        this.login = login;
        this.senha = senha;
    }
    
    public Usuario() { }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    @Override
    public void materializar(String dados) throws Exception {
        String vetorString[] = dados.split(";");
        if(vetorString.length != 3) {
            for (int i = 0; i < vetorString.length; i++) {
                throw new Exception("Faltam dados na posição " + i);
            }
        }
  
        int id = Integer.parseInt(vetorString[0]);
        
        setId(id);
        setLogin(vetorString[1]);
        setSenha(vetorString[2]);        
    }

    @Override
    public String desmaterializar() {
        String saida = getId() + ";"
                + getLogin() + ";"
                + getSenha();
        return saida;
    }
}