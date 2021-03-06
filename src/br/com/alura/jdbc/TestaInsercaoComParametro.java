package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();

		try(Connection connnection = connectionFactory.recuperarConexao()) {

			connnection.setAutoCommit(false);

			try(PreparedStatement stm = connnection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",

					Statement.RETURN_GENERATED_KEYS)) {

				adicionarVariavel("SMARTTV", "45° POLEGADAS", stm);
				adicionarVariavel("RADIO", "RADIO DE BATERIA", stm);

				connnection.commit();


			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO");
				
				connnection.rollback();

			}
		}

	}

	private static void adicionarVariavel(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);

		if (nome.equals("RADIO")) {
			throw new RuntimeException("Não foi possível adicionar o produto");
		}

		stm.execute();

		try (ResultSet rst = stm.getGeneratedKeys()) {

			while (rst.next()) {
				Integer id = rst.getInt(1);
				System.out.println("[Id: " + id + "]");

			}

		}
	}
}
