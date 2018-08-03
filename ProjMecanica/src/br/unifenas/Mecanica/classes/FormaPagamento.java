package br.unifenas.Mecanica.classes;
//aspas duplas a descri�ao

public enum FormaPagamento {
	CARTAO("Cart�o"), CHEQUE("Cheque"), DINHEIRO("Dinheiro");
	private String descricao;
	FormaPagamento(String descricao){
		this.descricao=descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
