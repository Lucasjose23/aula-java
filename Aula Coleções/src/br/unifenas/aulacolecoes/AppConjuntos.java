package br.unifenas.aulacolecoes;

import java.util.HashSet;
import java.util.Set;

public class AppConjuntos 
{

	public static void main(String[] args) 
	{
		Set<String> cores = new HashSet<>();
		
		cores.add("Preto");
		cores.add("Branco");
		cores.add("Azul");
		cores.add("Preto");
		
		for (String c : cores) 
		{
			System.out.println(c);
		}

		if(cores.contains("preto"))
		{
			System.out.println("Opa");
		}else 
		{
			System.out.println("Epa");
		}
	}

}
