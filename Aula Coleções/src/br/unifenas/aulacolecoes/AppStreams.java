package br.unifenas.aulacolecoes;

import java.util.Arrays;
import java.util.List;

public class AppStreams {

	public static void main(String[] args) 
	{
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		for (Integer n : numeros) 
		{
			System.out.println(n);
		}
		
		numeros.forEach(numero -> System.out.println(numero));
		
		numeros.forEach(numero -> {
			if(numero == 4)
				System.out.println("Num:"+numero);
		});

	}

}
