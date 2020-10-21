package br.com.fiap.healthtrack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    public static Connection obterConexao() {
        Connection conexao = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conexao = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "RM85856",
                    "191102");
            System.out.println("Banco de dados conectado");
        }

        catch (SQLException e) {
            System.err.println("Não foi possível se comunicar com o banco de dados");
            e.printStackTrace();
        }

        catch (ClassNotFoundException e) {
            System.err.println("O driver não foi encontrado");
            e.printStackTrace();
        }
        return conexao;
    }
}
