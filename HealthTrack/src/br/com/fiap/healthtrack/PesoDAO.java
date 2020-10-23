package br.com.fiap.healthtrack;

import java.sql.SQLException;
import java.util.Calendar;

import oracle.net.aso.c;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;

public class PesoDAO {
    Connection conexao = null;

    public void cadastrar(Peso peso, int cod_usuario){
        PreparedStatement stmt = null;
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "INSERT INTO T_PESO (cd_peso, nr_peso, dt_peso, nr_imc, cd_usuario) VALUES (SEQ_PESO.NEXTVAL, ?,?,?,?)";
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, peso.getPeso());
                java.sql.Date data = new java.sql.Date(peso.getData().getTimeInMillis());
                stmt.setDate(2, data);
                
                stmt.setInt(3, peso.getImc());
                stmt.setInt(4, cod_usuario);

                stmt.executeUpdate();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alterarDados(Peso peso, int cod_peso, int nr_peso, int nr_imc, int cod_usuario){
        PreparedStatement stmt = null;
        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "UPDATE T_PESO SET nr_peso = ?, dt_peso = ?, nr_imc = ? WHERE cd_peso = ? AND cd_usuario = ?";
                stmt = conexao.prepareStatement(sql);
                stmt.setInt(1, nr_peso);

                Calendar c = Calendar.getInstance();
                peso.setData(c);
                java.sql.Date data = new java.sql.Date(peso.getData().getTimeInMillis());
                stmt.setDate(2, data);

                stmt.setInt(3, nr_imc);
                stmt.setInt(4, cod_peso);
                stmt.setInt(5, cod_usuario);

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
                String sql = "SELECT * FROM T_PESO WHERE cd_usuario = "+cod_usuario + " ORDER BY dt_peso DESC";
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()){
                    int cd = rs.getInt(1);
                    int nr_peso = rs.getInt(2);
                    Date dt_peso = rs.getDate(3);
                    int nr_imc = rs.getInt(4);


                    System.out.println("cd: " + cd + "\tpeso: " + nr_peso + "\timc: " + nr_imc + "\tultima alteracao: " + dt_peso);
                }
            } catch (Exception e) {
                //TODO: handle exception
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }


}
