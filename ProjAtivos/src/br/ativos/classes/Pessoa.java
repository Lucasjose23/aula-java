package br.ativos.classes;

public abstract class Pessoa {
	private long id;
	private String nome;
	
	//construtor
		public Pessoa(String nome) {
			this.nome = nome;
		}
		public Pessoa() {
			
		}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	

}
