package br.com.dh.agenda.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

		Optional<Contato> contato = contatoRepository.findById(contatoInputDto.getContatoId());
		
		if (contato.isPresent()) {
			new Contato(contatoInputDto.getNome(), contatoInputDto.getSobrenome(), contatoInputDto.getApelido());
		}

		return ResponseEntity.status(HttpStatus.CREATED).build();

	}

}
