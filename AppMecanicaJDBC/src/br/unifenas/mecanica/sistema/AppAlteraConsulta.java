package br.unifenas.mecanica.sistema;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import br.unifenas.mecanica.dao.ClienteDAO;
import br.unifenas.mecanica.modelo.Cliente;

public class AppAlteraConsulta {

	public static void main(String[] args) {

		ClienteDAO cliDao = new ClienteDAO();

		try {

			List<Cliente> clientes = cliDao.consultaTodos();
			System.out.println("Lista de clientes cadastrados:");
			for (Cliente cli : clientes) {
				System.out.println(cli.getId() +" - "+ cli.getNome() + " - Carros:" + cli.getCarros().size());
			}
			cliDao.alteraNome(1, "marlene");
			Cliente c=cliDao.consultaUm(2);
			System.out.println(c.getNome());
			/*System.out.println("Digite o id do cliente que deseja alterar o nome:");
			Scanner entrada = new Scanner(System.in);
			long clienteid = entrada.nextLong();
			
			Cliente cliAlterar = cliDao.consultaUm(clienteid);
			
			System.out.println("Digite o novo nome:");
			String nomeCliente = entrada.next();
			cliAlterar.setNome(nomeCliente);
			cliDao.alteraNome(cliAlterar.getId(), cliAlterar.getNome());
			
			cliAlterar = cliDao.consultaUm(clienteid);
			
			System.out.println(cliAlterar.getId() +" - "+ cliAlterar.getNome() + " - Carros:" + cliAlterar.getCarros().size());*/

		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}

	}

}
