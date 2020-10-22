package br.com.fiap.healthtrack;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class PesoDAO {
    Connection conexao = null;

    public void cadastrar(Peso peso, int cod_usuario){
        PreparedStatement stmt = null;

        try {
            conexao = ConexaoBanco.obterConexao();
            try {
                String sql = "INSERT INTO T_PESO (cd_peso, nr_peso, dt_peso, nr_imc, cd_usuario) VALUES (SEQ_PESO.NEXTVAL, ?,?,?,?)";
                stmt.executeUpdate(sql);
                stmt.setInt(1, peso.getPeso());
                java.sql.Date data = new java.sql.Date(peso.getData().getTimeInMillis());
                stmt.setDate(2, data);
                
                stmt.setInt(3, peso.getImc());
                stmt.setInt(4, cod_usuario);
                
            } catch (Exception e) {
                //TODO: handle exception
            }
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
