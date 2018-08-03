package br.unifenas.mecanica.modelo;

public abstract class Pessoa {
	
	/*
	 * Atributos
	 */
	private long id;
	private String nome;
	
	/*
	 * Construtor
	 */
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa() {
		
	}

	/*
	 * Propriedades
	 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
