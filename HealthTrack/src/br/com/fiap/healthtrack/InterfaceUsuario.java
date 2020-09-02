package br.com.fiap.healthtrack;

/**
 * Interface que força os métodos
 * da classe Usuario.
 * @author André de Lara RM85856
 * @version 1.0
 */
public interface InterfaceUsuario {
    /**
     * Método que vai executar todos os 
     * métodos dentro da classe.
     * 
     * @param args
     */
    public static void main(String[] args) {
        fazerCadastro();
        definirLogin("username", "password");
        definirMeta("Atingir 60kg");
    }
    /**
     * Método que vai simular um cadastro
     * com dados predefinidos e exibir no
     * terminal os dados de usuário.
     */
    public static void fazerCadastro() {
        Usuario u = new Usuario();
        u.fazerCadastro("username", "password", 18);
        System.out.println(u.getNome());
        System.out.println(u.getSenha());
        System.out.println(u.getIdade());
    }
    /**
     * Simula uma autenticação de login
     * com base nos dados definidos no
     * método de cadastro.
     * 
     * Por enquanto é um método que depende
     * do método fazerCadastro() para funcionar
     * corretamente
     */
    public static void definirLogin(String username, String password) {
        Usuario u = new Usuario();
        u.fazerCadastro(username, password, 0);
        String response = u.realizarLogin(username, password);
        System.out.println(response);
    }
    /**
     * Define uma meta de acordo com o
     * o desejo do usuário 
     * @param meta Meta a ser adicionada
     */
    public static void definirMeta(String meta) {
        Usuario u = new Usuario();
        u.setMeta(meta);
        System.out.print("Sua meta: " + meta);
    }
}