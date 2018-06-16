/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.persistencia;

import br.model.Livro;
import br.service.TCPClient;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class LivroDAO implements GenericDAO{
    
    private TCPClient clienteServer;
    
   
    public LivroDAO(){
        clienteServer = new TCPClient();
        
    }

    @Override
    public void incluir(String str) {
        try {
            this.clienteServer.sendReceiveSever(str);
        } catch (IOException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

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
