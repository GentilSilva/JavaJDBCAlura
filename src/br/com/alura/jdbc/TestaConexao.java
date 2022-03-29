package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
<<<<<<< HEAD
		
		ConnectionFactory conecctionFactory = new ConnectionFactory();
		
		
		try(Connection connection = conecctionFactory.recuperarConexao()) {
			
			System.out.println("Fechando conexão!!");
			
		}
=======

		ConnectionFactory conecctionFactory = new ConnectionFactory();
		Connection con = conecctionFactory.recuperarConexao();

		System.out.println("Fechando conexão!!");

		con.close();
>>>>>>> f31c2787c8f03154399494acfe2495a427918dd7
	}
}
