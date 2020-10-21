package br.com.fiap.healthtrack;
/**
 * Importa o Scanner para receber
 * dados do usuário pelo terminal.
 */
import java.util.Scanner;
/**
 * Tela de interação com o usuário
 * através dos métodos e atributos
 * da classe Resumo.
 * 
 * @author André de Lara RM85856
 * @version 1.0
 */
public class TelaResumo {
    /**
     * Método principal que executa os métodos
     * de inserção de dados sobre a saúde do
     * usuário na classe Resumo e os exibe no
     * terminal.
     * @param args
     */
    public static void main(String[] args) {
        
        /**
         * Iniciando a classe Scanner para ser utilizada.
         */
        Scanner scan = new Scanner(System.in);
        /**
         * Inicia a classe Usuario e Resumo para utilizar os
         * métodos e classes de cada uma.
         */
        Usuario u = new Usuario();
        Resumo r = new Resumo();
        /**
         * Verifica se existe algum nome de usuário na classe
         * Resumo, caso não exista, o usuário precisa inserir
         * seu nome para continuar.
         * 
         * O método também vai registrar os dados salvos
         * dentro da classe resumo.
         */
        if (u.getNome() == null) {
            System.out.println("Por favor, insira seu usuário");
            u.setNome(scan.nextLine());
            /**
             * Verifica se existe algum dado sobre peso registrado
             * e assim como o método acima, o usuário precisa preencher
             * para continuar.
             * 
             * O método também vai registrar os dados salvos 
             * dentro da classe resumo.
             */
            if (r.p.getPeso() == 0) {
                System.out.println("\nPor favor, insira seu peso");
                r.p.setPeso(scan.nextInt());
                /**
                 * Verifica se existe algum dado sobre a altura do
                 * usuário registrada, caso não exista, o usuário
                 * precisa preencher para continuar.
                 * 
                 * O método também vai registrar os dados salvos
                 * dentro da classe resumo.
                 */
                if (r.a.getAltura() == 0){
                    System.out.println("\nPor favor, insira sua altura");
                    r.a.setAltura(scan.nextFloat());
                    /**
                     * Verifica se existe alguma idade registrada
                     * no sistema e,caso não exista, exige que o
                     * espaço seja preenchido pelo usuário.
                     * 
                     * O método também vai registrar os dados salvos
                     * dentro da classe resumo.
                     */
                    if (u.getIdade() == 0){
                        System.out.println("\nPor favor, insira sua idade");
                        u.setIdade(scan.nextInt());
                    }
                }
            }
        }
        
        /**
         * Exibe os dados registrados na tela Resumo dentro do terminal
         * com a formataçaõ ajustada para cada tipo de informação e
         * com o cálculo de IMC implementado e depois retirado pelo
         * método get IMC.
         */
        System.out.println("\n\n" + u.getNome());
        System.out.println(u.getIdade() + " Anos");
        System.out.println("----------------------------------------");
        System.out.println(r.p.getPeso()+" Kg");
        System.out.println("Passos: " + r.getPassos());
        /**
         * Registra os dados para o cálculo de IMC com base na altura e
         * no peso registrados dentro da classe Resumo.
         */
        r.calcularIMC(r.p.getPeso() ,r.a.getAltura());
        /**
         * Recupera o valor do IMC e exbie no terminal o resultado
         * com a formatação adequada, futuramente será implementada
         * a análise para determinar o nível de sobrepeso e obesidade.
         */
        System.out.println("Seu imc é: "+r.getImc());
    }
}
