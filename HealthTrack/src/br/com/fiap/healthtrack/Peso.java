package br.com.fiap.healthtrack;

import java.util.Calendar;

/**
 * Classe que contém informações sobre peso para a classe Resumo
 */
public class Peso {
    public Peso(int peso, Calendar data){
        this.peso = peso;
        this.data = data;
    }
    public Peso(){}
    /**
     * Valor do peso a ser armazenado na classe
     */
    private int peso;
    /**
     * Data em que o peso foi alterado
     */
    private Calendar data;
    /**
     * Recupera o valor do peso
     * 
     * @return Valor referente ao peso dentro da clase
     */

    private int imc;

    public void setImc(int imc) {
        this.imc = imc;
    }

    public int getImc() {
        return this.imc;
    }

    public void calcIMC(double altura, int peso){
        double result = peso/(altura*altura);
        int imc = (int) Math.round(result);

        setImc(imc);
        System.out.println(getImc());
    }

    public int getPeso() {
        return peso;
    }
    /**
     * Define os novos valores para o peso
     * 
     * @param peso Novo valor para o atributo peso
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * Recupera a data em que o valor do peso foi alterado
     * 
     * @return Valor da data dentro da classe
     */
    public Calendar getData() {
        return data;
    }

    /**
     * Deternima o novo valor para a data
     * 
     * @param data Data que será inserida
     */
    public void setData(Calendar data) {
        this.data = data;
    }
}
