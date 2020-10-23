package br.com.fiap.healthtrack;

import java.util.Calendar;

import oracle.net.aso.c;

public interface PassosTeste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        PassosDAO passosDAO = new PassosDAO();
        Passos passos = new Passos(2300, c);

        passosDAO.cadastrar(passos, 1);
        passosDAO.alterarDados(passos, 1, 3000, 2);
        passosDAO.recuperarDados(1);
    }
}
