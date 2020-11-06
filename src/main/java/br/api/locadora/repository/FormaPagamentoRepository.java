package br.api.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.api.locadora.model.FormaPagamento;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {

}
