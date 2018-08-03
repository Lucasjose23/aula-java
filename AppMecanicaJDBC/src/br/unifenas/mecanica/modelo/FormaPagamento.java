package br.unifenas.mecanica.modelo;

public enum FormaPagamento {
	CARTAO("Cartão"), CHEQUE("Cheque"), DINHEIRO("Dinheiro");
	
	private String descricao;
	
	FormaPagamento(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
