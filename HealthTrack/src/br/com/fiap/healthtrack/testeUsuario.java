package br.com.fiap.healthtrack;

import java.util.Scanner;

public interface testeUsuario {
    public static void main(String[] args) {

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuario = new Usuario();
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, qual é seu primeiro nome?");
        String response1 = scan.nextLine();
        System.out.println("Qual é a sua idade?");
        int response2 = scan.nextInt();

        usuario.setNome(response1);
        usuario.setIdade(response2);

        usuarioDAO.cadastrar(usuario);
        System.out.println("\n\n\n--");
        usuarioDAO.recuperarDados();
    }
}
