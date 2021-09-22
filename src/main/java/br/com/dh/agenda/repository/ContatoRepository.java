package br.com.dh.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dh.agenda.model.Contato;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Integer> {

}
