package br.unifenas.mecanica.modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
	
	private String cpf;
	private Endereco endereco;
	private List<Carro> carros;
	
	public Cliente(String nome, String cpf, Endereco endereco) {
		super(nome);
		this.cpf = cpf;
		this.endereco = endereco;
		this.carros = new ArrayList<>();
	}
	
	public Cliente() {
		this.carros = new ArrayList<>();
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	
	public void setCarro(Carro carro) {
		this.carros.add(carro);
	}

	
	

	
	
	
	
}
