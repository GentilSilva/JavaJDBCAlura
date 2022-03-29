package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
<<<<<<< HEAD
	
	public DataSource dataSource;	
	
	public ConnectionFactory() {
		
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("root");
		
		comboPooledDataSource.setMaxPoolSize(15);
		
		this.dataSource = comboPooledDataSource;
		
	}

	public Connection recuperarConexao() throws SQLException {
		
		return this.dataSource.getConnection();
		
=======

	public DataSource dataSource;

//	pool de conexão -> abre uma quantidade de conexões e reaproveita elas conforme a quantidade de usuários tentam acessar
	public ConnectionFactory() {

		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource
				.setJdbcUrl("jdbc:mysql://localhost:3306/loja_virtual?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("G3nt1!o9o89e");

		comboPooledDataSource.setMaxPoolSize(15);

		this.dataSource = comboPooledDataSource;

	}

	public Connection recuperarConexao() throws SQLException {

		return this.dataSource.getConnection();

>>>>>>> f31c2787c8f03154399494acfe2495a427918dd7
	}
}
