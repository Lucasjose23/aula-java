package br.unifenas.mecanica.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

import br.unifenas.mecanica.modelo.Carro;
import br.unifenas.mecanica.modelo.Cliente;
import br.unifenas.mecanica.modelo.Endereco;
import br.unifenas.mecanica.modelo.UF;

public class ClienteDAO {

	private String comandoSQL;
	private Connection conexao;

	public void insereCliente(Cliente novoCliente) throws SQLException {

		comandoSQL = "INSERT INTO cliente(nome, cpf, end_rua, end_bairro, end_numero, end_cidade, uf ) VALUES(?,?,?,?,?,?,?)";

		try {
			this.conexao = new FabricaDeConexoes().criarConexao();

			PreparedStatement stmt = this.conexao.prepareStatement(comandoSQL, Statement.RETURN_GENERATED_KEYS);

			stmt.setString(1, novoCliente.getNome());
			stmt.setString(2, novoCliente.getCpf());
			stmt.setString(3, novoCliente.getEndereco().getRua());
			stmt.setString(4, novoCliente.getEndereco().getBairro());
			stmt.setString(5, novoCliente.getEndereco().getNumero());
			stmt.setString(6, novoCliente.getEndereco().getCidade());
			stmt.setString(7, novoCliente.getEndereco().getUf().toString());
			stmt.execute();
			
			//Buscando o id do carro que acabou de ser inserido.
			ResultSet rsClienteId = stmt.getGeneratedKeys();
			if(rsClienteId.next())
				novoCliente.setId(rsClienteId.getInt(1));
			
			stmt.close();
			rsClienteId.close();

		} catch (SQLException e) {

			throw new SQLException();

		} finally {
		
			this.conexao.close();
		}

	}

	public void insereClienteCarro(long clienteid, long carroid) throws SQLException {

		comandoSQL = "INSERT INTO cliente_carros(clienteid, carroid) VALUES(?, ?)";
		try {
			this.conexao = new FabricaDeConexoes().criarConexao();

			PreparedStatement stmt = this.conexao.prepareStatement(comandoSQL, Statement.RETURN_GENERATED_KEYS);

			stmt.setLong(1, clienteid);
			stmt.setLong(2, carroid);
			stmt.execute();
			
			//Buscando o id do carro que acabou de ser inserido.
			//ResultSet rsCliente_carroId = stmt.getGeneratedKeys();
			//if(rsCliente_carroId.next())
				//novoCliente.setId(rsClienteId.getInt(1));
			
			//stmt.close();
			//rsClienteId.close();

		} catch (SQLException e) {

			throw new SQLException();

		} finally {
		
			this.conexao.close();
		}

		
	}

	public Cliente consultaUm(long clienteid) throws SQLException {

		comandoSQL = "SELECT * FROM cliente WHERE idcli=?";
		this.conexao = new FabricaDeConexoes().criarConexao();
		Cliente cliente=null;
		try 
		{
			PreparedStatement stmt = conexao.prepareStatement(comandoSQL);
			stmt.setLong(1, clienteid);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {

				Endereco endCli = new Endereco(rs.getString("end_rua"), rs.getString("end_bairro"),
						rs.getString("end_numero"), rs.getString("end_cidade"), UF.valueOf(rs.getString("uf")));

				 cliente = new Cliente(rs.getString("nome"), rs.getString("cpf"), endCli);
				
			}
			
		}
		
		catch (SQLException e)
		{
			throw new SQLException();
		} 
		finally 
		{
			this.conexao.close();
		}
			
		return cliente;

	}
	
	public void alteraNome(long clienteid, String nomeCliente) throws SQLException {

		comandoSQL = "UPDATE cliente SET nome=? WHERE idcli=?";

		try {
			this.conexao = new FabricaDeConexoes().criarConexao();

			PreparedStatement stmt = this.conexao.prepareStatement(comandoSQL);

			stmt.setString(1, nomeCliente);
			stmt.setLong(2, clienteid);
			

			stmt.execute();
			stmt.close();

		} catch (SQLException e) {

			throw new SQLException();

		} finally {

			this.conexao.close();

		}
	}

	public List<Cliente> consultaTodos() throws SQLException {

		comandoSQL = "SELECT * FROM cliente";

		this.conexao = new FabricaDeConexoes().criarConexao();

		List<Cliente> clientes = new ArrayList<>();

		try {
			PreparedStatement stmt = conexao.prepareStatement(comandoSQL);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Endereco endCli = new Endereco(rs.getString("end_rua"), rs.getString("end_bairro"),
						rs.getString("end_numero"), rs.getString("end_cidade"), UF.valueOf(rs.getString("uf")));

				Cliente cliente = new Cliente(rs.getString("nome"), rs.getString("cpf"), endCli);
				cliente.setId(rs.getLong("idcli"));
				//cliente.setCarros(new CarroDAO().consultaPorCliente(cliente.getId()));
				clientes.add(cliente);
			}

			rs.close();
			stmt.close();

		} catch (SQLException e) {
			throw new SQLException();
		} finally {
			this.conexao.close();
		}
		return clientes;
	}

	

}
