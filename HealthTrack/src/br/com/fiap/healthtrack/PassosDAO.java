package br.com.fiap.healthtrack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.sql.Date;

public class PassosDAO {
    Connection conexao = null;

    public void cadastrar(Passos passos, int cd_usuario) {
        PreparedStatement stmt = null;
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "INSERT INTO T_PASSOS (cd_passos, nr_passos, dt_registro, cd_usuario) VALUES (SEQ_PASSOS.NEXTVAL, ?,?,?)";
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, passos.getPassos());
                Calendar c = Calendar.getInstance();
                passos.setDt_passos(c);

                java.sql.Date data = new java.sql.Date(passos.getDt_passos().getTimeInMillis());
                stmt.setDate(2, data);

                stmt.setInt(3, cd_usuario);
                stmt.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }
            String sql = "";
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recuperarDados(int cd_usuario) {
        PreparedStatement stmt = null;
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "SELECT * FROM T_PASSOS ORDER BY dt_registro DESC";
                stmt = conexao.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    int cd = rs.getInt(1);
                    int passos = rs.getInt(2);
                    Date data = rs.getDate(3);

                    System.out.println("cd: " + cd + " passos: " + passos + " ultima alteracao: " + data);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void alterarDados(Passos passos, int cd_usuario, int nr_passos, int cd_passos) {
        PreparedStatement stmt = null;
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "UPDATE T_PASSOS SET nr_passos = ?, dt_registro = ? WHERE cd_passos = ? AND cd_usuario = ?";
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, nr_passos);
                Calendar c = Calendar.getInstance();
                passos.setDt_passos(c);
                java.sql.Date data = new java.sql.Date(passos.getDt_passos().getTimeInMillis());

                stmt.setDate(2, data);
                stmt.setInt(3, cd_passos);
                stmt.setInt(4, cd_usuario);

                stmt.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
