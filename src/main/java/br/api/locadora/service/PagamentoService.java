package br.api.locadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.api.locadora.model.Pagamento;
import br.api.locadora.repository.PagamentoRepository;

@Service
public class PagamentoService {
	final PagamentoRepository _repository;

	@Autowired
	public PagamentoService(PagamentoRepository repository) {
		_repository = repository;
	}

	public void inserir(Pagamento pagamento) {
		pagamento.setId(new Long(0));
		_repository.save(pagamento);
	}

	public List<Pagamento> listar() {
		return _repository.findAll();
	}

}
