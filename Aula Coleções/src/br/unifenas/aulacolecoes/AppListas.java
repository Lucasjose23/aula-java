package br.unifenas.aulacolecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppListas 
{

	public static void main(String[] args) 
	{
		List<String> times = new ArrayList<>();
		times.add("Corinthians");
		times.add("Red Corinthians");
		times.add(new String("Boston Celtics"));
		
		String vice = "Natus Vincere";
		times.add(vice);
		
		System.out.println("Tamanho:"+ times.size());
		
		System.out.println(times.get(1));
		
		times.remove(2);
		
		for (String t : times) 
		{
			System.out.println(t);
		}
		
		Collections.sort(times);
	}

}
