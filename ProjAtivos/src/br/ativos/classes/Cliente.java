package br.ativos.classes;

public class Cliente extends Pessoa {

	private String cpf;
	private Endereco endereco;
	private Filial filial;
	
	public Cliente(String nome, String cpf, Endereco endereco, Filial filial) {
		super(nome);
		this.cpf = cpf;
		this.endereco = endereco;
		this.filial = filial;
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
	public Filial getFilial() {
		return filial;
	}
	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	

	
}