package br.com.fiap.healthtrack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    Connection conexao = null;

    public void cadastrar(Usuario usuario) {
        PreparedStatement stmt = null;

        try {
            conexao = ConexaoBanco.obterConexao();
            String sql = "INSERT INTO T_USUARIO VALUES (SEQ_USUARIO.NEXTVAL, ?, ?)";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setInt(2, usuario.getIdade());

            stmt.executeUpdate();
        }

        catch (SQLException e) {
            System.err.println("Não foi possível se conectar ao banco de dados");
            e.printStackTrace();
        }

        catch (Exception e) {
            System.err.println("Ocorreu um erro desconhecido");
            e.printStackTrace();
        }

        finally {
            try {
                stmt.close();
                conexao.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void recuperarDados() {
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                java.sql.Statement stmt = conexao.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM T_USUARIO ORDER BY cd_usuario ASC");

                while (rs.next()){
                    String nome = rs.getString(2);
                    int idade = rs.getInt(3);

                    System.out.println(nome + " " + idade);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarDados(int codigoUsuario, String nome, int idade) {
        PreparedStatement stmt = null;
        try {
            conexao = ConexaoBanco.obterConexao();
            String sql = "UPDATE T_USUARIO SET nm_usuario = ?, nr_idadeusuario = ? WHERE cd_usuario = ?";
            stmt.setString(1, nome);
            stmt.setInt(2, idade);
            stmt.setInt(3, codigoUsuario);

            stmt = conexao.prepareStatement(sql);
            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Não foi possível conectar a um banco de dados");
            e.printStackTrace();
        }
    }
}
