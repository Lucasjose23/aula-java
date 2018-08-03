package br.ativos.sistema;
import java.util.Date;

import br.ativos.classes.*;
public class AppAtivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Filial filial1=new Filial("1","Empresa de Ativos",Cidade.Alfenas);
		Endereco em =new Endereco(1,"Centro","Rua jé","134");
		Cliente cliente=new Cliente("Lucas","35487944458",em,filial1);
		Tecnico tecnico=new Tecnico("Josias",filial1,"9908736");
		Imovel imovel=new Imovel(1,filial1,em);
		Ativo computador=new Ativo(1,"Sansung S12","PC",imovel,12,13);
		TipoServico trocarHd=new TipoServico(1,"Trocar o hd");
		Servico servico1=new Servico(1,computador,cliente,tecnico,"problemas no hd",trocarHd,new Date());
		System.out.println("Ativo "+computador.getNome()+" esta com "+servico1.getSituacao());

	}

}
