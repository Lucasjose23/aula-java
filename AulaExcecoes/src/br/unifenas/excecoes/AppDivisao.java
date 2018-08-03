package br.unifenas.excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppDivisao 
{
	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		try
		{
			System.out.print("A: ");
			int a= entrada.nextInt();
			System.out.print("B: ");
			int b= entrada.nextInt();
			System.out.print("Resultado: "+ dividir(a,b));
		}catch(ArithmeticException e)
		{
			System.out.println("Error divisão por 0!");
		}catch(InputMismatchException e)
		{
			System.out.println("Parâmetro Incorreto!");
		}
		
		
	}
	
	static double dividir(int a, int b)
	{
		return a/b;
	}

}
