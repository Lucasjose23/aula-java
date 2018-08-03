package br.unifenas.excecoes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BadFoodExceptionApp 
{

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);//Pega o que esta vindo do teclado
		System.out.println("Alimento:");
		String alimento = entrada.next();//Pega o que esta vindo do teclado
		
		try 
		{
			checkFood(alimento);
		}catch(BadFoodException e)
		{
			System.out.println(e.getMessage());
		}finally {
			entrada.close();
		}
	}
	
	static boolean checkFood(String food) throws BadFoodException
	{
		List<String> alimentosOK = Arrays.asList("Batata Doce","Frango","Ovo");
		if (alimentosOK.contains(food))
		{
			return true;
		}
		else
		{
			throw new BadFoodException("Alimento não permitido!");
		}
	}
}
