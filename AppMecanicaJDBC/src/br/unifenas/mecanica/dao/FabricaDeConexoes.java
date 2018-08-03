package br.unifenas.mecanica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexoes {
	
	private final String STRING_CONEXAO = "jdbc:mysql://localhost/mecanicadb";
	private final String USER = "root";
	private final String PASS = "1234";
	
	public Connection criarConexao() throws SQLException {
		return DriverManager.getConnection(STRING_CONEXAO, USER, PASS);	
	}
	

}
