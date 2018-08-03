package br.ativos.classes;

public class Endereco {
	private int id;
	private String bairro;
	private String rua;
	private String numero;
	public Endereco(int id, String bairro, String rua, String numero) {
		super();
		this.id = id;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
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
	

}
