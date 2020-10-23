package br.com.fiap.healthtrack;

import java.util.Calendar;

public interface TesteAltura {
    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        Altura altura = new Altura(1, c);
        AlturaDAO alturaDAO = new AlturaDAO();

        //alturaDAO.cadastrar(altura, 2);
        alturaDAO.recuperarDados(1);
    }
}
