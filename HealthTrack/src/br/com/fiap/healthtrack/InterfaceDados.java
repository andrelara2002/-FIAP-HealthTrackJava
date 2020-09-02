package br.com.fiap.healthtrack;
/**
 * Interface para testar as implementações
 * das classes de inserção de dados
 * 
 * @author André de Lara RM85856
 * @version 1.0
 */
public interface InterfaceDados {
    /**
     * Método que vai executar todos os 
     * métodos dentro da classe.
     * 
     * @param args
     */
    public static void main(String[] args) {
        inserirEsporte("Natação");
        definirAltura(1.7);
        definirPeso(90);
    }
    /**
     * Método que insere esportes dentro
     * do sistema e exibe o resultado
     * no terminal.
     * @param esporte Informação a ser
     * armazenada
     */
    public static void inserirEsporte(String esporte) {
        Esportes e = new Esportes();
        e.inserirEsporte(esporte);
        System.out.println("Seus esportes são: " + e.getTipoEsporte());
    }
    /**
     * Define o valor do peso do usuário
     * e exibe o resultado no terminal.
     * @param peso Valor a ser definido
     * como peso.
     */
    public static void definirPeso(int peso) {
        Peso p = new Peso();
        p.setPeso(peso);
        System.out.println("Seu peso é: "+p.getPeso()+"Kg");
    }
    /**
     * Define o valor da altura do usuário
     * e exibe o resultado no terminal
     * @param altura Valor a ser definido
     * como altura
     */
    public static void definirAltura(double altura){
        Altura a = new Altura();
        a.setAltura(altura);
        System.out.println("Sua altura é de: "+a.getAltura()+"m");
    }
}
