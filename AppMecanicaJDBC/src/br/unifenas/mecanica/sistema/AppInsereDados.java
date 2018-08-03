package br.unifenas.mecanica.sistema;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.unifenas.mecanica.dao.CarroDAO;
import br.unifenas.mecanica.dao.ClienteDAO;
import br.unifenas.mecanica.modelo.Carro;
import br.unifenas.mecanica.modelo.Cliente;
import br.unifenas.mecanica.modelo.Endereco;
import br.unifenas.mecanica.modelo.UF;

public class AppInsereDados {

	public static void main(String[] args) {

		/*Carro cEtios = new Carro("Etios", "Toyota");
		Carro cGol = new Carro("Gol", "Volks");
		Carro cFiesta = new Carro("Fiesta", "Ford");

		Cliente cliJose = new Cliente("Jose", "12345678912",
				new Endereco("Rua UmDois", "Jardins", "156", "Alfenas", UF.MG));
		Cliente cliMaria = new Cliente("Maria", "98765432198",
				new Endereco("Rua de uma cidade", "Além do horizonte", "42", "Sorocaba", UF.SP));

		CarroDAO carroDAO = new CarroDAO();
		ClienteDAO cliDAO = new ClienteDAO();

		try {

			carroDAO.insereCarro(cEtios);
			carroDAO.insereCarro(cGol);
			carroDAO.insereCarro(cFiesta);

			cliJose.setCarro(cGol);
			cliJose.setCarro(cFiesta);

			cliMaria.setCarro(cEtios);

			cliDAO.insereCliente(cliJose);
			cliDAO.insereCliente(cliMaria);

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}*/
		ClienteDAO C=  new ClienteDAO();
		//try 
		//{
			//C.insereClienteCarro(1,1);
			
		//} catch (SQLException e) {
			//System.out.println(e.getMessage());
		
			
		//}
		try {
			System.out.println(C.consultaUm(1).getNome());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		

	}

}
