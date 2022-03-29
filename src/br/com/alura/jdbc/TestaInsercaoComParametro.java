package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsercaoComParametro {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();

<<<<<<< HEAD
		try(Connection connnection = connectionFactory.recuperarConexao()) {

			connnection.setAutoCommit(false);

			try(PreparedStatement stm = connnection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
=======
		try (Connection con = connectionFactory.recuperarConexao()) {

			con.setAutoCommit(false);

			try (PreparedStatement stm = con.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)",
>>>>>>> f31c2787c8f03154399494acfe2495a427918dd7
					Statement.RETURN_GENERATED_KEYS)) {

				adicionarVariavel("SMARTTV", "45° POLEGADAS", stm);
				adicionarVariavel("RADIO", "RADIO DE BATERIA", stm);

<<<<<<< HEAD
				connnection.commit();
=======
				con.commit();
>>>>>>> f31c2787c8f03154399494acfe2495a427918dd7

			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("ROLLBACK EXECUTADO");
<<<<<<< HEAD
				connnection.rollback();
=======
				con.rollback();
>>>>>>> f31c2787c8f03154399494acfe2495a427918dd7
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
