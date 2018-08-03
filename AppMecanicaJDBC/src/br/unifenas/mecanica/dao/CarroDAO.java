package br.unifenas.mecanica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import br.unifenas.mecanica.modelo.Carro;

public class CarroDAO {

	private String comandoSQL;
	private Connection conexao;

	public void insereCarro(Carro novoCarro) throws SQLException {

		comandoSQL = "INSERT INTO carro(marca, modelo) VALUES(?,?)";

		try {
			this.conexao = new FabricaDeConexoes().criarConexao();

			PreparedStatement stmt = this.conexao.prepareStatement(comandoSQL, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, novoCarro.getMarca());
			stmt.setString(2, novoCarro.getModelo());

			stmt.execute();
			
			//Buscando o id do carro que acabou de ser inserido.
			ResultSet rsCarroId = stmt.getGeneratedKeys();
			if(rsCarroId.next())
				novoCarro.setId(rsCarroId.getInt(1));
			
			stmt.close();
			rsCarroId.close();

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
	
	public List<Carro> consultaPorCliente(long clienteid) throws SQLException 
	{
		comandoSQL = "SELECT cliente.idcli, cliente.nome, carro.id, carro.modelo, carro.marca FROM carro INNER JOIN cliente AS cliente ON cliente_carros.clienteid = cliente.idcli INNER JOIN carro AS carro ON cliente_carros.carroid = carro.id WHERE cliente.idcli =?" ;

		List<Carro> carros = new ArrayList<>();

		try {
			PreparedStatement stmt = conexao.prepareStatement(comandoSQL);
			stmt.setLong(1, clienteid);
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


