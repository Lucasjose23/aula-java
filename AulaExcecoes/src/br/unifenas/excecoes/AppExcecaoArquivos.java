package br.unifenas.excecoes;

import java.io.IOException;
import java.io.RandomAccessFile;

public class AppExcecaoArquivos 
{

	public static void main(String[] args) 
	{
		try 
		{
			lerArquivo("Arquivo1.txt");
		} catch (IOException e) {
			System.out.println("Erro de E/S");
		}
	}
	
	static void lerArquivo(String arquivo) throws IOException // Obriga quem for usar o metodo a tratar
	{
		RandomAccessFile raf = new RandomAccessFile(arquivo, "r");
		byte b[]= new byte [1000];
		raf.readFully(b);
		
	}

}
