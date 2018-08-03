package br.ativos.classes;

public class Tecnico extends Pessoa {
	private Filial filial;
	private String telefone;
	public Tecnico(String nome, Filial filial, String telefone) {
		super(nome);
		this.filial = filial;
		this.telefone = telefone;
	}
	public Filial getFilial() {
		return filial;
	}
	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	

}
