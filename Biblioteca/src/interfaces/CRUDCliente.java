package interfaces;
import java.util.ArrayList;
import regras_de_negocio.Cliente;

public interface CRUDCliente {
    public int autoincrement() throws Exception;
    void incluir(Cliente objeto) throws Exception;
    public ArrayList<Cliente> recuperar() throws Exception;
    public void alterar(int id, Cliente dado) throws Exception;
    public void excluir(int id) throws Exception;
}