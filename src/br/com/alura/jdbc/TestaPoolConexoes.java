package br.com.alura.jdbc;

import java.sql.SQLException;

public class TestaPoolConexoes {

	public static void main(String[] args) throws SQLException {
<<<<<<< HEAD
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		for(int i = 0; i < 20; i++) {
=======

		ConnectionFactory connectionFactory = new ConnectionFactory();

		for (int i = 0; i < 20; i++) {
>>>>>>> f31c2787c8f03154399494acfe2495a427918dd7
			connectionFactory.recuperarConexao();
			System.out.println("Conexão de número: " + i);
		}
	}
}
