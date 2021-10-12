package br.com.dh.agenda.controller;

import java.util.List;

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
import br.com.dh.agenda.service.ContatoService;

@RestController
@RequestMapping("/contato")
public class ContatoController {

//	@Autowired
//	private ContatoRepository contatoRepository;

	@Autowired
	private ContatoService contatoService;

	@PostMapping
	public ResponseEntity<ContatoInputDto> salvar(@RequestBody ContatoInputDto contatoInputDto) {

		
		
		contatoService.salvar(contatoInputDto.converte());
		
		

		return ResponseEntity.status(HttpStatus.CREATED).build();

	}

	@GetMapping("/{id}")
	public Contato buscar(@PathVariable Integer id) {

		return contatoService.buscarPorId(id);

	}

	@GetMapping
	public List<Contato> listar() {

		return contatoService.listarTodos();
	}

}
