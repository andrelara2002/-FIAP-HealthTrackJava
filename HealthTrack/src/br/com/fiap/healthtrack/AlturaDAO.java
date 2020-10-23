package br.com.fiap.healthtrack;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

import javax.xml.crypto.Data;

public class AlturaDAO {
    Connection conexao = null;

    public void cadastrar(Altura altura, int cod_usuario) {
        PreparedStatement stmt = null;

        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "INSERT INTO T_ALTURA (cd_altura, nr_altura, dt_altura, cd_usuario) VALUES (SEQ_ALTURA.NEXTVAL, ?,?,?)";
                stmt = conexao.prepareStatement(sql);
                stmt.setDouble(1, altura.getAltura());
                java.sql.Date data = new java.sql.Date(altura.getData().getTimeInMillis());
                stmt.setDate(2, data);
                stmt.setInt(3, cod_usuario);

                stmt.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recuperarDados(int cd_usuario) {
        PreparedStatement stmt = null;
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "SELECT * FROM T_ALTURA WHERE cd_usuario = ? ORDER BY dt_altura DESC";
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, cd_usuario);

                ResultSet rs = stmt.executeQuery();

                while (rs.next()) {
                    int cd = rs.getInt(1);
                    double n_altura = rs.getDouble(2);
                    Date d_altura = rs.getDate(3);

                    System.out.println("cd: " + cd + "\taltura: " + n_altura + "m" + "\tultima alteracao: " + d_altura);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarDados(Altura altura, int cd_usuario, int cd_altura, int nr_altura) {
        PreparedStatement stmt = null;
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "UPDATE T_ALTURA SET nr_altura = ?, dt_altura = ? WHERE cd_altura = ? AND cd_usuario = ?";
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, nr_altura);

                Calendar c = Calendar.getInstance();
                altura.setData(c);
                java.sql.Date data = new java.sql.Date(altura.getData().getTimeInMillis());
                stmt.setDate(2, data);
                stmt.setInt(3, cd_altura);
                stmt.setInt(4, cd_usuario);

                stmt.executeUpdate();

            } catch (Exception e) {
                // TODO: handle exception
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
