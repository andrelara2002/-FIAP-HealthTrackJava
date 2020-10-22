package br.com.fiap.healthtrack;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import oracle.net.aso.c;

public class AlimentosDAO {
    Connection conexao = null;

    public void cadastrar(Alimentos alimentos, int cod_usuario) {
        PreparedStatement stmt = null;
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "INSERT INTO T_ALIMENTOS (cd_alimentos, nm_alimentos, nr_calorias, dt_alimentos, cd_usuario) VALUES (SEQ_ALIMENTOS.NEXTVAL, ?, ?, ?, ?)";
                stmt = conexao.prepareStatement(sql);
                stmt.setString(1, alimentos.getNome());
                stmt.setInt(2, alimentos.getCalorias());
                java.sql.Date data = new java.sql.Date(alimentos.getData().getTimeInMillis());
                stmt.setDate(3, data);
                stmt.setInt(4, cod_usuario);

                stmt.executeUpdate();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recuperarDados(int cod_usuario) {
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                java.sql.Statement stmt = conexao.createStatement();
                String sql = "SELECT * FROM T_ALIMENTOS WHERE cd_usuario = "+cod_usuario + " ORDER BY dt_alimentos DESC";
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()){
                    int foodCode = rs.getInt(1);
                    String foodName = rs.getString(2);
                    int kcalNumber = rs.getInt(3);
                    Date changeDate = rs.getDate(4);

                    System.out.println("cd: " + foodCode + "\tnome: " + foodName + "\tcalorias: " + kcalNumber + "\tultima alteracao: " + changeDate);
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void alterarDados(Alimentos alimentos, int cod_usuario, int cod_registro, String nm_alimentos, int nr_calorias){
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "UPDATE T_ALIMENTOS SET nm_alimentos = ?, nr_calorias = ?, dt_alimentos = ? WHERE cd_usuario = ? AND cd_alimentos = ?";
                PreparedStatement stmt = conexao.prepareStatement(sql);
                stmt.setString(1, nm_alimentos);
                stmt.setInt(2, nr_calorias);

                Calendar c = Calendar.getInstance();
                alimentos.setData(c);

                java.sql.Date data = new java.sql.Date(alimentos.getData().getTimeInMillis());
                stmt.setDate(3, data);

                stmt.setInt(4, cod_usuario);

                stmt.setInt(5, cod_registro);
                
                stmt.executeUpdate();

            } catch (Exception e) {
                //TODO: handle exception
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
