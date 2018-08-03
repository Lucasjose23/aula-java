package br.unifenas.mecanica.sistema;

import java.sql.SQLException;
import java.util.List;

import br.unifenas.mecanica.dao.CarroDAO;
import br.unifenas.mecanica.modelo.Carro;

public class AppTestaJDBC {

	public static void main(String[] args) {
		
		CarroDAO c1DAO = new CarroDAO();
		
		/*
		Carro c1 = new Carro("Opa", "Toyota");
		try {
			c1DAO.insereCarro(c1);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		*/
		
		
		
		/*Carro c1 = new Carro("Hilux", "Nissan");
		try {
			c1DAO.updateCarro(c1);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}*/
		
		Carro c1 = new Carro();
		try {
			c1DAO.deleteCarro(c1);
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		/*List<Carro> carros;
		try {
			carros = c1DAO.consultaTodos();
			
			for (Carro carro : carros) {
			System.out.println(carro.getModelo());
			System.out.println(carro.getMarca());
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}	*/
	}

}
