package br.ativos.classes;

public class Ativo {
	private long id;
	private String nome;
	private String descri;
	private Imovel imovel;
	private int andar;
	private int sala;
	public Ativo(long id, String nome, String descri, Imovel imovel, int andar, int sala) {
		super();
		this.id = id;
		this.nome = nome;
		this.descri = descri;
		this.imovel = imovel;
		this.andar = andar;
		this.sala = sala;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
	}
	public Imovel getImovel() {
		return imovel;
	}
	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public int getSala() {
		return sala;
	}
	public void setSala(int sala) {
		this.sala = sala;
	}
	
}
