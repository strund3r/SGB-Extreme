package interfaces;
import regras_de_negocio.Cliente;
import java.util.ArrayList;

public interface CRUD {
    void incluir(Cliente objeto) throws Exception;
    public ArrayList<Cliente> recuperar() throws Exception;
    public void excluir(String nome) throws Exception;   
}