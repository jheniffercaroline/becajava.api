package br.api.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.api.locadora.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}