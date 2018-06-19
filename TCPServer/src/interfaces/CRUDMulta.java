package interfaces;

import java.util.ArrayList;
import regras_de_negocio.Multa;

public interface CRUDMulta {
    public int autoincrement() throws Exception;
    void incluir(Multa objeto) throws Exception;
    public ArrayList<Multa> recuperar() throws Exception;
    public void alterar(int id, Multa dado) throws Exception;
    public void excluir(int id) throws Exception;
}
