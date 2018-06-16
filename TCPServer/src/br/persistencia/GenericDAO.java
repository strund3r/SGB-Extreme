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
public interface GenericDAO {
    
    public void incluir(String str);
    public void excluir (String str);
    public void alterar (String str);
    public void listId(String str);
    public void listAll(String str);
}
