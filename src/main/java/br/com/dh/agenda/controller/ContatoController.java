package br.com.dh.agenda.controller;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.dh.agenda.dto.ContatoInputDto;
import br.com.dh.agenda.model.Contato;
import br.com.dh.agenda.repository.ContatoRepository;

@RestController
@RequestMapping("/contato")
public class ContatoController {

	@Autowired
	private ContatoRepository contatoRepository;

	@PostMapping
	public ResponseEntity<Contato> salvar(@RequestBody ContatoInputDto contatoInputDto) {

		contatoRepository.save(contatoInputDto.converte());

		return ResponseEntity.status(HttpStatus.CREATED).build();

	}

	@GetMapping("/{id}")
	public ResponseEntity<Contato> buscar(@PathVariable Integer id) {

		Optional<Contato> contato = contatoRepository.findById(id);

		if (!contato.isPresent()) {
			throw new EntityNotFoundException();
		}

		return ResponseEntity.ok(contato.get());

	}

}
