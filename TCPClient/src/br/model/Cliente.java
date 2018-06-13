package br.model;

import java.io.Serializable;

public class Cliente implements Serializable{
    private String nome;
    private String cpf;
    private int idade;
    private float peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        
        return getClass().getName() + ";"+ getNome()+";"+getIdade();
    }
}