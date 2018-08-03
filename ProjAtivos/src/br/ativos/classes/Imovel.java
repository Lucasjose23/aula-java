package br.ativos.classes;

public class Imovel {
	private long id;
	private Filial filial;
	private Endereco endereco;
	public Imovel(long id, Filial filial, Endereco endereco) {
		super();
		this.id = id;
		this.filial = filial;
		this.endereco = endereco;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Filial getFilial() {
		return filial;
	}
	public void setFilial(Filial filial) {
		this.filial = filial;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
