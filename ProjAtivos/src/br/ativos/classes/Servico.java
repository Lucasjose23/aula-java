package br.ativos.classes;

import java.util.Date;

public class Servico {
	private long id;
	private Ativo ativo;
	private Cliente cliente;
	private Tecnico tecnico;
	private String situacao;
	private TipoServico tipo;
	private  Date data;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Ativo getAtivo() {
		return ativo;
	}
	public void setAtivo(Ativo ativo) {
		this.ativo = ativo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Tecnico getTecnico() {
		return tecnico;
	}
	public void setTecnico(Tecnico tecnico) {
		this.tecnico = tecnico;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public TipoServico getTipo() {
		return tipo;
	}
	public void setTipo(TipoServico tipo) {
		this.tipo = tipo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Servico(long id, Ativo ativo, Cliente cliente, Tecnico tecnico, String situacao, TipoServico tipo,
			Date data) {
		super();
		this.id = id;
		this.ativo = ativo;
		this.cliente = cliente;
		this.tecnico = tecnico;
		this.situacao = situacao;
		this.tipo = tipo;
		this.data = data;
	}

}
