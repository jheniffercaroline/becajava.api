package br.api.locadora.model;

import javax.persistence.*;

@Entity
public class Locacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private int Valor;
	

	@ManyToOne
	@JoinColumn(name = "VeiculoId")
	private Veiculo Veiculo;

	@ManyToOne
	@JoinColumn(name = "ClienteId")
	private Cliente Cliente;

	@ManyToOne
	@JoinColumn(name = "FormaPagamentoId")

	private FormaPagamento FormaPagamento;

	public int getValor() {
		return Valor;
	}

	public void setValor(int valor) {
		Valor = valor;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public FormaPagamento getFormaPagamento() {
		return FormaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		FormaPagamento = formaPagamento;
	}

	public Veiculo getVeiculo() {
		return Veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		Veiculo = veiculo;
	}
	

}
