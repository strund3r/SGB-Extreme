package interfaces;

import java.util.ArrayList;
import regras_de_negocio.Reserva;

public interface CRUDReserva {
    public int autoincrement() throws Exception;
    void incluir(Reserva objeto) throws Exception;
    public ArrayList<Reserva> recuperar() throws Exception;
    public void alterar(int id, Reserva dado) throws Exception;
    public void excluir(int id) throws Exception;
}