package br.com.dh.agenda.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dh.agenda.model.Contato;
import br.com.dh.agenda.repository.ContatoRepository;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;

	public Contato salvar(Contato contato) {
		return contatoRepository.save(contato);
	}

	public Contato buscarPorId(Integer id) {

		return contatoRepository.findById(id)
				.orElseThrow(() -> new EntityNotFoundException("Não existe um contato com o código " + id));
	}

	public List<Contato> listarTodos() {
		return contatoRepository.findAll();
	}

	public void excluir(Integer id) {

		contatoRepository.deleteById(id);
	}
}
