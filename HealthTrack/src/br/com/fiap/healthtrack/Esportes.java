package br.com.fiap.healthtrack;

/**
 * Classe que recupera os tipos de esportes
 * e tempo de atividades em cada um dentro
 * do sistema, como parte da classe Resumo.
 * 
 * @author André de Lara RM85856
 * @version 1.0
 */
public class Esportes {
    /**
     * Tipo de esportes que será armazenado
     * no sistema.
     */
    private String tipoEsporte;
    /**
     * Tempo de atividade em cada esporte
     */
    private int tempoAtividade;
    /**
     * Recupera tipos de esportes
     * @return Tipos de esportes da classe
     */
    public String getTipoEsporte() {
        return tipoEsporte;
    }
    /**
     * Define os tipos de esporte na classe
     * @param tipoEsporte Tipo de esporte a
     * ser inserido
     */
    public void inserirEsporte(String tipoEsporte) {
        this.tipoEsporte = tipoEsporte;
    }
    /**
     * Recupera o tempo gasto em atividades
     * registrado pelo sistema;
     * @return Tempo em esportes
     */
    public int getTempoAtividade() {
        return tempoAtividade;
    }
    /**
     * Definir tempo de atividades
     * @param tempoAtividade Tempo a ser
     * definido no sistema
     */
    public void setTempoAtividade(int tempoAtividade) {
        this.tempoAtividade = tempoAtividade;
    }
    
    
}
