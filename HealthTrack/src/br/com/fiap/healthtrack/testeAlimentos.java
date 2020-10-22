package br.com.fiap.healthtrack;

import java.sql.Connection;
import java.util.Calendar;


public interface testeAlimentos {
    Connection conexao = null;
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Alimentos alimentos = new Alimentos("Baguete", 800, c);
        AlimentosDAO alimentosDAO = new AlimentosDAO();

        alimentosDAO.cadastrar(alimentos, 1); 
        alimentosDAO.alterarDados(alimentos, 1, 2, "Nuggets", 320);
        alimentosDAO.recuperarDados(1);        
        
    }
}
