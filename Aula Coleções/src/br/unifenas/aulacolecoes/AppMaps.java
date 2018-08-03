package br.unifenas.aulacolecoes;

import java.util.HashMap;
import java.util.Map;

public class AppMaps {

	public static void main(String[] args) 
	{
		Map<String, Double> carteira = new HashMap<>();
		
		carteira.put("GOLL4", 19.5);
		carteira.put("TAM4", 20.5);
		carteira.put("BITCOIN", 20.0);
		
		System.out.println("Gol:"+carteira.get("GOLL4"));
		
		for (Object chave : carteira.keySet()) 
		{
			System.out.println(chave + "-" + carteira.get(chave));
		}
		
		for (Double valor : carteira.values()) 
		{
			System.out.println(valor);
		}
	}

}
