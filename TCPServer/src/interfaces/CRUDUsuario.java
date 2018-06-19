package interfaces;
import java.util.ArrayList;
import regras_de_negocio.Usuario;

public interface CRUDUsuario {
    public int autoincrement() throws Exception;
    void incluir(Usuario objeto) throws Exception;
    public ArrayList<Usuario> recuperar() throws Exception;
    public void alterar(int id, Usuario dado) throws Exception;
    public void excluir(int id) throws Exception;
    
}