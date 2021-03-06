package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {
		
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
	}
}
