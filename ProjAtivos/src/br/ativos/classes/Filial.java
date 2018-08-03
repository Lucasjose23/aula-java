package br.ativos.classes;



public class Filial extends Empresa {

	private Cidade cidade;
	public Filial(String cnpj, String nome,  Cidade cidade) {
		super(cnpj, nome);
	
		this.cidade = cidade;
	}
	
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	

}
