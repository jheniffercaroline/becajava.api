package br.api.locadora.model;

import javax.persistence.*;

@Entity
public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Marca;
	private String Modelo;
	private String Cor;

	@ManyToOne
	@JoinColumn(name = "LocadoraId")
	private Locadora Locadora;
	

	public Locadora getLocadora() {
		return Locadora;
	}

	public void setLocadora(Locadora locadora) {
		Locadora = locadora;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

}
