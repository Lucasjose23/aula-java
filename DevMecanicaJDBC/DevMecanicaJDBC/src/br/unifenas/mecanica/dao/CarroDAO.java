package br.unifenas.mecanica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.unifenas.mecanica.modelo.Carro;

public class CarroDAO {

	private String comandoSQL;
	private Connection conexao;

	public void insereCarro(Carro novoCarro) throws SQLException {

		comandoSQL = "INSERT INTO carro(marca, modelo) VALUES(?,?)";

		try {
			this.conexao = new FabricaDeConexoes().criarConexao();

			PreparedStatement stmt = this.conexao.prepareStatement(comandoSQL);

			stmt.setString(1, novoCarro.getMarca());
			stmt.setString(2, novoCarro.getModelo());

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			throw new SQLException();

		} finally {

			this.conexao.close();

		}

	}
	
	public void updateCarro(Carro novoCarro) throws SQLException {

		comandoSQL = "UPDATE carro SET modelo=?, marca=? WHERE id = 1";

		try {
			this.conexao = new FabricaDeConexoes().criarConexao();

			PreparedStatement stmt = this.conexao.prepareStatement(comandoSQL);

			stmt.setString(1, novoCarro.getModelo());
			stmt.setString(2, novoCarro.getMarca());
			

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			throw new SQLException();

		} finally {

			this.conexao.close();

		}

	}
	
	public void deleteCarro(Carro novoCarro) throws SQLException {

		comandoSQL = "DELETE FROM carro  WHERE id = 1";

		try {
			this.conexao = new FabricaDeConexoes().criarConexao();

			PreparedStatement stmt = this.conexao.prepareStatement(comandoSQL);
			
			stmt.executeUpdate();
			stmt.close();

		} catch (SQLException e) {

			throw new SQLException();

		} finally {

			this.conexao.close();

		}

	}



	public List<Carro> consultaTodos() throws SQLException {

		comandoSQL = "SELECT * FROM carro";
		
		this.conexao = new FabricaDeConexoes().criarConexao();

		List<Carro> carros = new ArrayList<>();

		try {
			PreparedStatement stmt = conexao.prepareStatement(comandoSQL);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Carro carro = new Carro(rs.getString("modelo"), rs.getString("marca"));
				carros.add(carro);
			}

			rs.close();
			stmt.close();

		} catch (SQLException e) {
			throw new SQLException();
		} finally {
			this.conexao.close();
		}
		return carros;

	}

}
