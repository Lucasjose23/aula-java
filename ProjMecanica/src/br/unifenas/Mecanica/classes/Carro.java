package br.unifenas.Mecanica.classes;

public class Carro {
	private long id;
	private String modelo;
	private String marca;

	public Carro(long id, String modelo, String marca) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

}
