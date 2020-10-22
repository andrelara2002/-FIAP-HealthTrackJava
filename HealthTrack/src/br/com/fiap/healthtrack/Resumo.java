package br.com.fiap.healthtrack;
/**
 * Classe que reune todas as informações principais do sistema
 * @author André de Lara RM85856
 * @version 1.0
 */
public class Resumo {
    Altura a = new Altura();
    Peso p = new Peso();
    Esportes e = new Esportes();
    Alimentos al = new Alimentos();
    /**
     * Tipos de esportes disponiveis no sistema
     */
    private String esporte = e.getTipoEsporte();
    /**
     * Valor da altura do usuário
     */
    private double alt = a.getAltura();
    /**
     * Valor do peso do usuário
     */
    private int peso = (int) p.getPeso();
    /**
     * registro de passos do usuário
     */
    private int passos;
    /**
     * Valor do índice de massa corporal (IMC)
     */
    private int imc;

    private int pressaoSistolica;

    private int pressaoDiastolica;

    private String nomeAlimento = al.getNome();

    private int caloriasAlimentos = al.getCalorias();
    
    /**
     * Definir a quantidade de passos dada
     * @param passos Valor a ser definido
     */
    public void calcularPassos(int passos){
        this.passos = passos;
    }
    /**
     * Recupera a quantidade de passos dada pelo usuário
     * @return Retorna o valor de passos na classe
     */
    public int getPassos(){
        return this.passos;
    }
    /**
     * Calcula e define o IMC do usuário com base nas informações inseridas
     * @param peso Peso do usuário
     * @param altura Altura do usuário
     */
    public void calcularIMC(int peso, double altura) {
        this.imc = (int) (peso/(altura * altura));
    }
    /**
     * Recupera o valor do IMC do usuário
     * @return Valor do IMC contido na classe
     */
    public int getImc(){
        return this.imc;
    }
}