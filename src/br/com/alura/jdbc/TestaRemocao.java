package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaRemocao {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();

		try (Connection con = connectionFactory.recuperarConexao()) {

//			evita sql injection
			PreparedStatement stm = con.prepareStatement("DELETE FROM PRODUTO WHERE ID > ?");

			stm.setInt(1, 2);

			stm.execute();

			Integer linhasModificadas = stm.getUpdateCount();

			System.out.println("Quantidades de linhas que foram modificadas: " + linhasModificadas);
		}
	}
}
