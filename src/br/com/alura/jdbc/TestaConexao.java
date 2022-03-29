package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory conecctionFactory = new ConnectionFactory();
		
		
		try(Connection connection = conecctionFactory.recuperarConexao()) {
			
			System.out.println("Fechando conexão!!");
			
		}
	}
}
