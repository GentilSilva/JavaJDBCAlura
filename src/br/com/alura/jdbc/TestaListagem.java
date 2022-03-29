package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
<<<<<<< HEAD
		
		ConnectionFactory conecctionFactory = new ConnectionFactory();
		
		
		try(Connection connection = conecctionFactory.recuperarConexao()) {
			
			PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
			stm.execute();
			
			ResultSet rst = stm.getResultSet();
			
			while(rst.next()) {
				Integer id = rst.getInt("ID");
				String nome = rst.getString("NOME");
				String descricao = rst.getNString("DESCRICAO");
				System.out.println("[Id: " + id + ", nome: " + nome + ", descrição: " + descricao + "]");

				
			}
			
		}
=======

		ConnectionFactory conecctionFactory = new ConnectionFactory();
		Connection con = conecctionFactory.recuperarConexao();

		PreparedStatement stm = con.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
		stm.execute();

		ResultSet rst = stm.getResultSet();

		while (rst.next()) {
			Integer id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String descricao = rst.getString("DESCRICAO");
			System.out.println("[Id: " + id + ", nome: " + nome + ", descrição: " + descricao + "]");

		}

		con.close();
>>>>>>> f31c2787c8f03154399494acfe2495a427918dd7
	}
}
