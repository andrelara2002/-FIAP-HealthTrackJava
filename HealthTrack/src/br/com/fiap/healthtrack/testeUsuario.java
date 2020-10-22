package br.com.fiap.healthtrack;

import java.util.Scanner;

public interface testeUsuario {
    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();
        Scanner scan = new Scanner(System.in);
        System.out.println("\n////////////////HealthTrack v1.2////////////////");
        System.out.println("1 - Cadastrar, 2 - Alterar, 3 -  Visualizar, 4 - Deletar, 5 - Sair");
        int opt = scan.nextInt();

        if (opt == 1) {

            System.out.println("Olá, qual é seu primeiro nome?");
            String response1 = scan.next();
            System.out.println("Qual é o seu segundo nome?");
            response1 += " " + scan.next();
            System.out.println("Qual é a sua idade?");
            int response2 = scan.nextInt();

            usuario.setNome(response1);
            usuario.setIdade(response2);

            usuarioDAO.cadastrar(usuario);
        }
        else if (opt == 2){
            System.out.println("Digite o código do usuário para alteração");
            int response1 = scan.nextInt();
            System.out.println("Digite o primeiro nome que gostaria de colocar neste usuário");
            String response2 = scan.next();
            System.out.println("Digite o segundo nome deste usuário");
            String text = scan.next();
            response2 += " " + text;
            System.out.println("Digite qual a idade deste usuario");
            int response3 = scan.nextInt();

            System.out.println(usuarioDAO.alterarDados(response1, response2, response3));
        }

        else if (opt == 3){
            usuarioDAO.recuperarDados();
        }

        // usuarioDAO.cadastrar(usuario);
        System.out.println("\n\n\n--");
        usuarioDAO.recuperarDados();
    }
}
