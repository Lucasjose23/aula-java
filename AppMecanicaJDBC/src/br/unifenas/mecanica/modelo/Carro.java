package br.unifenas.mecanica.modelo;

public class Carro {

	private long id;
	private String modelo;
	private String marca;

	public Carro(String modelo, String marca) {
		this.modelo = modelo;
		this.marca = marca;
	}

	public Carro() {
	}

	public long getId() {
		return id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setId(long id) {
		this.id = id;
	}


}
