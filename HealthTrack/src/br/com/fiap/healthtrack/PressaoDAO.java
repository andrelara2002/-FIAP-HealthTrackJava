package br.com.fiap.healthtrack;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import oracle.net.aso.c;

public class PressaoDAO {
    Connection conexao = null;

    public void cadastrar(Pressao pressao, int cod_usuario) {
        PreparedStatement stmt = null;
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "INSERT INTO T_PRESSAO (cd_pressao, nr_pressaodiastolica, nr_pressaosistolica, dt_registro, cd_usuario) VALUES (SEQ_PRESSAO.NEXTVAL, ?, ?, ?, ?)";
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, pressao.getPressaoDiastolica());
                stmt.setInt(2, pressao.getPressaoSistolica());
                java.sql.Date data = new java.sql.Date(pressao.getDt_pressao().getTimeInMillis());
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
                String sql = "SELECT * FROM T_PRESSAO WHERE cd_usuario = "+cod_usuario + " ORDER BY dt_registro DESC";
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()){
                    int cd = rs.getInt(1);
                    int pressaoDiastolica = rs.getInt(2);
                    int pressaoSistolica = rs.getInt(3);
                    Date data = rs.getDate(4);

                    System.out.println("cd: "+cd + "\tpressao diastolica: "+pressaoDiastolica + "\tpressao sistolica: "+pressaoSistolica + "\tultima alteracao: "+data);
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void alterarDados(Pressao pressao, int cod_usuario, int cod_registro, int nr_pressaodiastolica, int nr_pressaosistolica){
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "UPDATE T_PRESSAO SET nr_pressaodiastolica = ?, nr_pressaosistolica = ?, dt_registro = ? WHERE cd_usuario = ? AND cd_pressao = ?";
                PreparedStatement stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, nr_pressaodiastolica);
                stmt.setInt(2, nr_pressaosistolica);

                Calendar c = Calendar.getInstance();
                pressao.setDt_pressao(c);;

                java.sql.Date data = new java.sql.Date(pressao.getDt_pressao().getTimeInMillis());
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
