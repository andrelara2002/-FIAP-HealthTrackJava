package br.com.fiap.healthtrack;

/**
 * Classe que reune todas as informações de dados de acesso da classe usuário e
 * suas metas dentro do sistema.
 * 
 * @author André de Lara RM85856
 * @version 1.0
 */
public class Usuario {
    /**
     * Recupera a classe Atleta para utilizar seus atriburos dentro da clase
     * usuário.
     */
    // Atleta a = new Atleta();
    /**
     * Atributos dentro da classe Usuário
     * 
     * nome: Nome do usuário. senha: Senha de login do usuário idade: Idade do
     * usuário. meta: meta do usuário tipo: determina se o é atleta ou usuário
     * comum.
     */
    private String nome;
    private String senha;
    private int idade;
    private String meta;
    private int tipo;

    public Usuario(String nome, String senha, Integer idade, String meta, int tipo){
        super();
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.meta = meta;
        this.tipo = tipo;
    }

    public Usuario(){
        super();
    }

    /**
     * Recupera os dados de nome do usuário
     * 
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Determina os novos dados de nome do usuário
     * 
     * @param nome nome que vai ser aplicado.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Recupera a senha atual do usuário
     * 
     * @return senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Determina a nova senha do usuário
     * 
     * @param senha senha a ser aplicada
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * Recupera a idade do usuário
     * 
     * @return idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Determina on novo valor para a idade do usuário.
     * 
     * @param idade idade a ser aplicada
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Recupera a meta de exercicios do usuário
     * 
     * @return meta
     */
    public String getMeta() {
        return meta;
    }

    /**
     * Determina nova meta do usuário
     */
    public void setMeta(String meta) {
        this.meta = meta;
    }

    /**
     * Cadastra os dados recebidos pelo método dentro das variáveis da classe.
     * 
     * @param nome
     * @param senha
     * @param idade
     * @param tipo
     */
    public void fazerCadastro(String nome, String senha, int idade, int tipo) {
        this.nome = nome;
        this.senha = senha;
        this.idade = idade;
        this.tipo = tipo;
    }

    /**
     * Verifica se os dados recebidos são iguais os valores de autenticação dentro
     * da classe e recusa caso sejam diferentes.
     * 
     * @param nome
     * @param senha
     * @return
     */
    public String realizarLogin(String nome, String senha) {
        if (getNome().equals(nome) && getSenha().equals(senha)) {
            return "\nLogin realizado";
        } else {
            return "\nLogin negado";
        }

    }

    public String recuperarDadosUsuario(String esportePraticado, int tempoDePratica, String objetivo) {
        String response = "Nome: " + nome + "\nIdade: " +idade +"\n";
        if (tipo == 1){
            response += "\nVocê é um atleta que pratica " + esportePraticado + " por "+ tempoDePratica + " anos";
        }
        else {
            response += "Você é um usuário iniciante que deseja " + objetivo;
        }
        return response;
    }

}
