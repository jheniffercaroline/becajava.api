package br.api.locadora.model;

import javax.persistence.*;

@Entity
public class FormaPagamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Tipo;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setValor(String tipo) {
		Tipo = tipo;
	}

}
