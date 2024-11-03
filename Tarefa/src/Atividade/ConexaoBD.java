package Atividade;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
public class ConexaoBD {

    private final String bd = "atvJean";
    private final String usuario = "root";
    private final String senha = "";

    public Connection estabeleceConexao() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/" + bd,
                    usuario, senha);
        } catch (ClassNotFoundException erro) {
            System.out.println("Erro na conexão: " + erro);
            return null;
        }
    }   
}
