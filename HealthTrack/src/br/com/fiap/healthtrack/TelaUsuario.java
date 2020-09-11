package br.com.fiap.healthtrack;

/**
 * Importa o Scanner para receber
 * dados do usuário pelo terminal.
 */
import java.util.Scanner;

import javax.swing.plaf.synth.SynthMenuBarUI;

/**
 * Tela de interação com o usuário através dos métodos e atributos da classe
 * Resumo.
 * 
 * @author André de Lara RM85856
 * @version 1.0
 */
public interface TelaUsuario {
    /**
     * Método principal que executa o cadastro do usuário no sistema e depois pede
     * os dados para a autenticação.
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Recupera a classe Usuario e Scanner para a utilização de seus métodos e
         * atributos.
         */
        Usuario u = new Usuario();
        Atleta a = new Atleta();
        Comum c = new Comum();
        Scanner scan = new Scanner(System.in);
        /**
         * Recupera o nome de usuário para ser registrado na classe Usuário.
         */
        System.out.println("Teste de cadastro\nPor favor, insira seu nome de usuário (sem espaços)");
        String user = scan.nextLine();
        /**
         * Recupera a senha a ser usada e registra dentro da classe usuário.
         */
        System.out.println("Agora, insira sua senha de acesso");
        String pass = scan.nextLine();
        /**
         * Recupera a idade do usuário pelo terminal e registra dentro da classe
         * usuário.
         */
        System.out.println("Digite sua idade:");
        int year = scan.nextInt();

        System.out.println("Você é um atleta ou iniciante?");
        String tipoln = scan.next();

        if (tipoln.equals("atleta")) {
            /**
             * Executa o método fazerCadastro e insere os dados recuperados que foram
             * obtidos através do terminal, de acordo com o tipo de usuário.
             */
            System.out.println("Qual esporte você pratica?");
            String esportePraticado = scan.next();
            esportePraticado += scan.nextLine();
            a.adicionarEsporte(esportePraticado);

            System.out.println("Por quantos anos você pratica esse esporte?");
            int tempoDePratica = scan.nextInt();
            a.adicionarTempo(tempoDePratica);
            u.fazerCadastro(user, pass, year, 1);
        } else {
            /**
             * Executa o método fazerCadastro e insere os dados recuperados que foram
             * obtidos através do terminal, de acordo com o tipo de usuário.
             */
            System.out.println("Certo! Qual o seu objetivo com esse app?");
            String objetivo = scan.next();
            objetivo += scan.nextLine();
            c.definirObjetivo(objetivo);
            u.fazerCadastro(user, pass, year, 0);
        }
        /**
         * Verifica se o cadastro foi realizado sem nenhuma informação pendente e segue
         * em frente com a execução do código.
         */
        if (u.getNome() != "" && u.getSenha() != "") {
            System.out.println("\nCadastro realizado\nagora por favor faça o login");
        } else {
            System.out.println("Algo deu errado");
        }
        /**
         * Executa uma tela de login, onde o usuário precisa inserir o usuário para ser
         * executada a autenticação
         */
        System.out.println("\nQual o seu nome de usuario?");
        String userLogin = scan.next();
        /**
         * Recupera a senha usada na tela de login para a análise e autenticação.
         */
        System.out.println("Agora, qual a sua senha de usuario?");
        String passLogin = scan.next();
        /**
         * Executa o método realizarLogin da classe Usuário com os dados recuperados da
         * tela de login.
         */
        System.out.println(u.realizarLogin(userLogin, passLogin));
        /**
         * Verifica se o login foi realizado com sucesso e exibe caso verdadeiro uma
         * mensagem de bom dia acompanhada pelo nome do usuário.
         */
        if (u.realizarLogin(userLogin, passLogin).toString().equals("\nLogin realizado")) {
            System.out.println("Seja bem vindo");
            System.out.println("-------------------");;
            System.out
                    .println(u.recuperarDadosUsuario(a.getEsportePraticado(), a.getTempoDePratica(), c.getObjetivo()));
        } else {
        }
    }
}
