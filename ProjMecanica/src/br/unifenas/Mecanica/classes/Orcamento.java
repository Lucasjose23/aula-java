package br.unifenas.Mecanica.classes;

import java.time.LocalDate;
import java.util.List;

public class Orcamento {
	private long id;
	private Cliente cliente;
	private Carro carro;
	private List<Servico> servicos;
	private Mecanico mecanico;
	private LocalDate data;
	private FormaPagamento pagamento;
	
	public Orcamento(long id, Cliente cliente, Carro carro, List<Servico> servicos, Mecanico mecanico, LocalDate data,
			FormaPagamento pagamento) {
		this.id = id;
		this.cliente = cliente;
		this.carro = carro;
		this.servicos = servicos;
		this.mecanico = mecanico;
		this.data = data;
		this.pagamento = pagamento;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public List<Servico> getServicos() {
		return servicos;
	}

	public void setServicos(List<Servico> servicos) {
		this.servicos = servicos;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public FormaPagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(FormaPagamento pagamento) {
		this.pagamento = pagamento;
	}
	
	
	

}
