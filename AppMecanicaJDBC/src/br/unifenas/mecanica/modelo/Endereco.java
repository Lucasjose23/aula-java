package br.unifenas.mecanica.modelo;

public class Endereco {

	private long id;
	private String rua;
	private String bairro;
	private String numero;
	private String cidade;
	private UF uf;
	
	public Endereco(String rua, String bairro, String numero, String cidade, UF uf) {
		this.id = id;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
		this.uf = uf;
	}
	
	public Endereco() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}
	
	
	
	
	
}
