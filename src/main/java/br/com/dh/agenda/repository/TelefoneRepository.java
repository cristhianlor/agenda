package br.com.dh.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dh.agenda.model.Telefone;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer>{

}
