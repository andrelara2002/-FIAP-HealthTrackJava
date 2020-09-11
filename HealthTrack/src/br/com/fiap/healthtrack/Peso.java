package br.com.fiap.healthtrack;
/**
 * Classe que contém informações
 * sobre peso para a classe Resumo
 */
public class Peso{
    /**
     * Valor do peso a ser armazenado
     * na classe
     */
    private int peso;
    /**
     * Data em que o peso foi alterado
     */
    private String data;
    /**
     * Recupera o valor do peso
     * 
     * @return Valor referente
     * ao peso dentro da clase
     */
    public int getPeso() {
        return peso;
    }
    /**
     * Define os novos valores
     * para o peso
     * 
     * @param peso Novo valor
     * para o atributo peso
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }
    /**
     * Recupera a data em que o
     * valor do peso foi alterado
     * 
     * @return Valor da data dentro
     * da classe
     */
    public String getData() {
        return data;
    }
    /**
     * Deternima o novo valor para
     * a data
     * 
     * @param data Data que será
     * inserida
     */
    public void setData(String data) {
        this.data = data;
    }
}
