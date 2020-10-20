package br.com.fiap.healthtrack;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionTester {

  public static void main(String[] args) {
    try {
      // Registra o Driver
      Class.forName("oracle.jdbc.driver.OracleDriver");

      // Abre uma conex�o
      Connection conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM85856",
          "191102");

      System.out.println("Conectado!");

      try {

        java.sql.Statement stmt = conexao.createStatement();

        PreparedStatement pstmt = conexao.prepareStatement("INSERT INTO T_USUARIO (cd_usuario, nm_usuario, nr_idadeusuario) VALUES (SEQ_USUARIO.NEXTVAL, ?, ?)");
        pstmt.setString(1, "Rogerio");
        pstmt.setInt(2, 12);
        
        pstmt.executeUpdate();

        ResultSet result = stmt.executeQuery("SELECT * FROM T_USUARIO ORDER BY cd_usuario ASC");

        while (result.next()){
          System.out.println(result.getInt("cd_usuario")+" " + result.getString("nm_usuario")+" "+ result.getInt("nr_idadeusuario")+"\n");
        }
      }

      catch (Exception e) {
        e.printStackTrace();
      }
      // Fecha a conex�o
      conexao.close();

      // Tratamento de erro
    } catch (SQLException e) {
      System.err.println("Não foi possível conectar no Banco de Dados");
      e.printStackTrace();

    } catch (ClassNotFoundException e) {
      System.err.println("O Driver JDBC não foi encontrado!");
      e.printStackTrace();
    }
  }
}