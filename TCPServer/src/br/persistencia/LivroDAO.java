/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.persistencia;

/**
 *
 * @author aluno
 */
public class LivroDAO implements GenericDAO {

    private String path;
    
    public LivroDAO(String path){
        this.path = path;
    }
    @Override
    public void incluir(String str) {
    }

    @Override
    public void excluir(String str) {
    }

    @Override
    public void alterar(String str) {
    }

    @Override
    public void listId(String str) {
    }

    @Override
    public void listAll(String str) {
    }
    
}
