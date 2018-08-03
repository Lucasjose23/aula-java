package br.ativos.classes;

public class TipoServico {
	private long id;
	private String descri;
	public TipoServico(long id, String descri) {
		super();
		this.id = id;
		this.descri = descri;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
	}
	

}
