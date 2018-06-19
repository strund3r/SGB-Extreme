package interfaces;
import java.util.ArrayList;

public interface CRUDLivro {
    public int autoincrement() throws Exception;
    void incluir(String objeto) throws Exception;
    public ArrayList<String> recuperar() throws Exception;
    public void alterar(int id, String dado) throws Exception;
    public void excluir(int id) throws Exception;
}