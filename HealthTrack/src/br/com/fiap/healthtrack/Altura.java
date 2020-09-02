package br.com.fiap.healthtrack;
/**
 * Classe de altura como complemento da classe Resumo.
 * @author André de Lara RM85856
 * @version 1.0
 */
public class Altura {
    /**
     * Valor da altura do usuário contida na classe
     * que será exportada para a classe resumo.
     */
    private double altura;

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
    
}