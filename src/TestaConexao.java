import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conecctionFactory = new ConnectionFactory();
		Connection con = conecctionFactory.recuperarConexao();
		
		System.out.println("Fechando conexão!!");
		
		con.close();
	}
}
