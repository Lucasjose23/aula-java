package br.unifenas.Mecanica.classes;

public class Endereco {
	private int id;
	private String bairro;
	private String rua;
	private String numero;
	private String cidade;
	private UF uf;
	
	public Endereco(int id, String bairro, String rua, String numero, String cidade, UF uf) {
		this.id = id;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.uf = uf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
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
