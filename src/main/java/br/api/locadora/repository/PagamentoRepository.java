package br.api.locadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.api.locadora.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {

}
