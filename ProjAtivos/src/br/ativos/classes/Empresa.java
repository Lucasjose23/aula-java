package br.ativos.classes;

public abstract class Empresa {
	private String cnpj;
	private String nome;
	public Empresa(String cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
