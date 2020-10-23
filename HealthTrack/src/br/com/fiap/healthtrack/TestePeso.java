package br.com.fiap.healthtrack;

import java.util.Calendar;

import oracle.net.aso.c;

public interface TestePeso {
    public static void main(String[] args) {

        PesoDAO pesoDAO = new PesoDAO();
        Calendar c = Calendar.getInstance();
        Peso peso = new Peso(90, c);
        Altura altura = new Altura(1.75, c);
        peso.calcIMC(altura.getAltura(), peso.getPeso());

        pesoDAO.cadastrar(peso, 1);
        pesoDAO.recuperarDados(1);
        //pesoDAO.alterarDados(peso, 5, 70, 31, 1);
    }
}
