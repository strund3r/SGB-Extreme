package interfaces;
import java.util.ArrayList;
import regras_de_negocio.Emprestimo;

public interface CRUDEmprestimo {    
    public int autoincrement() throws Exception;
    void incluir(Emprestimo objeto) throws Exception;
    public ArrayList<Emprestimo> recuperar() throws Exception;
    public void alterar(int id, Emprestimo dado) throws Exception;
    public void excluir(int id) throws Exception;
}