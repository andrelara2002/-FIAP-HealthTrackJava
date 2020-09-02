package br.com.fiap.healthtrack;
/**
 * Interface para forçar a implementação
 * dos métodos da classe Resumo.
 * 
 * @author André de Lara Ramos RM85856
 * @version 1.0
 */
public interface InterfaceResumo {
    /**
     * Método que vai executar todos os 
     * métodos dentro da classe.
     * 
     * @param args
     */
    public static void main(String[] args) {
        calcularIMC();      
        calcularPassos();  
    }
    /**
     * Método para forçar o cálculo do
     * IMC a partir da classe Resumo e
     * exibir o resultado no terminal.
     */
    public static void calcularIMC() {
        Resumo r = new Resumo();
        r.calcularIMC(80, 1.8);
        System.out.println("Seu IMC é: "+r.getImc());
    }
    /**
     * Método para forçar o cálculo de
     * passos dentro da classe Resumo
     * e exibir dados no terminal.
     */
    public static void calcularPassos() {
        System.out.println("Ainda não é possivel realizar o calculo de passos");
    }
}
