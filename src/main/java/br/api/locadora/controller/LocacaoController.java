package br.api.locadora.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sun.el.stream.Optional;

import br.api.locadora.model.Locacao;
import br.api.locadora.repository.LocacaoRepository;

@RestController
@RequestMapping("/locacoes")
public class LocacaoController {

	final LocacaoRepository _locacaoRepository; // Criando propriedade da Interface Locação

	public LocacaoController(LocacaoRepository locacaoRepository) {
		_locacaoRepository = locacaoRepository; // Alimentando a propriedade com a construção da classe
	}

//	@PostMapping
//	public ResponseEntity inserir(@RequestBody Locacao locacao) {
//		_locacaoRepository.save(locacao);
//		return ResponseEntity.status(HttpStatus.CREATED).body("Locação criada com sucesso!");
//	}

//	@GetMapping
//	public ResponseEntity obter() {
//		Iterable<Locacao> locacoes = _locacaoRepository.findAll();
//		return ResponseEntity.status(HttpStatus.OK).body(locacoes);
//	}
//
//	@GetMapping(path = "/{id}")
//	public ResponseEntity obter(@PathVariable Long id) {
//		Optional<Locacao> locacao = _locacaoRepository.findById(id);
//		return ResponseEntity.status(HttpStatus.OK).body(locacao);
//	}
//
//	@PutMapping(path = "/{id}")
//	public ResponseEntity atualizar(@RequestBody Locacao locacao, @PathVariable Long id) {
//		locacao.setId(id);
//		_locacaoRepository.save(locacao);
//		return ResponseEntity.status(HttpStatus.OK).body("Locação atualizada com sucesso!");
//	}
//
//	@DeleteMapping(path = "/{id}")
//	public ResponseEntity deletar(@PathVariable Long id) {
//		_locacaoRepository.deleteById(id);
//		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
//	}
}
