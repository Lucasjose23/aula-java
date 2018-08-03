package br.unifenas.mecanica.modelo;

public class Mecanico extends Pessoa {

	private String especialidade;

	public Mecanico(String nome, String especialidade) {
		super(nome);
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	 
	
}
