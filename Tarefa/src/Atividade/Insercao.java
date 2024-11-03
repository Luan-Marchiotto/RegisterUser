package Atividade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Insercao {
    public void gravar(String c1, String c2, String c3, String c4) {
        try {
            Connection con = new ConexaoBD().estabeleceConexao();
            if (con != null) {
                PreparedStatement ps;
                String sql = "insert into cadastrofuncionario (nome,cpf,telefone,senha) values (?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, c1);
                ps.setString(2, c2);
                ps.setString(3, c3);
                ps.setString(4, c4);
                if (ps.executeUpdate() != 0) {
                    System.out.println("Sucesso ao inserir");
                } else {
                    System.out.println("Não foi possível inserir");
                }
                con.close();
            }
        } catch (SQLException erro) {
            System.out.println("Exceção causada na inserção");
        }
    }
}