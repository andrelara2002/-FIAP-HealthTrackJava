package br.com.fiap.healthtrack;

import java.util.Calendar;

public interface TestePressao {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Pressao pressao = new Pressao(180, 20, c);
        PressaoDAO pressaoDAO = new PressaoDAO();

        pressaoDAO.cadastrar(pressao, 1);
        pressaoDAO.alterarDados(pressao, 1, 1, 120, 80);
        pressaoDAO.recuperarDados(1);
    }
}
