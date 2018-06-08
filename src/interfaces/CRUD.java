package interfaces;
import java.util.ArrayList;
import regras_de_negocio.Cliente;

public interface CRUD {
    void incluir(Cliente objeto) throws Exception;
    public ArrayList<Cliente> recuperar() throws Exception;
    public void alterar(String nome, Cliente dado) throws Exception;
    public void excluir(String nome) throws Exception;
}