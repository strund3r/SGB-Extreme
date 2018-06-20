package interfaces;
import java.util.ArrayList;
import regras_de_negocio.Livro;

public interface CRUDLivro {
    public int autoincrement() throws Exception;
    void incluir(Livro objeto) throws Exception;
    public ArrayList<Livro> recuperar() throws Exception;
    public void alterar(int id, Livro dado) throws Exception;
    public void excluir(int id) throws Exception;
}