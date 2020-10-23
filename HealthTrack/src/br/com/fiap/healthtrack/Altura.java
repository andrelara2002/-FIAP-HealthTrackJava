package br.com.fiap.healthtrack;

import java.util.Calendar;

/**
 * Classe de altura como complemento da classe Resumo.
 * @author André de Lara RM85856
 * @version 1.0
 */
public class Altura {
    public Altura(double altura, Calendar data){
        this.altura = altura;
        this.data = data;
    }

    public Altura(){}
    /**
     * Valor da altura do usuário contida na classe
     * que será exportada para a classe resumo.
     */
    private double altura;

    private Calendar data;

    /**
     * Retorna o valor da altura do usuário
     * contida na classe.
     * 
     * @return Valor da altura na classe
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Determina o valor da altura do usuário
     * que será aplicada.
     * 
     * @param altura Retorna o valor da altura
     * da classe
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
}