package br.api.locadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.api.locadora.model.FormaPagamento;
import br.api.locadora.repository.FormaPagamentoRepository;

@Service
public class FormaPagamentoService {
	final FormaPagamentoRepository _repository;

	@Autowired
	public FormaPagamentoService(FormaPagamentoRepository repository) {
		_repository = repository;
	}

	public void inserir(FormaPagamento formaPagamento) {
		formaPagamento.setId(new Long(0));
		_repository.save(formaPagamento);
	}

	public List<FormaPagamento> listar() {
		return _repository.findAll();
	}

}
