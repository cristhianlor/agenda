package br.com.dh.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.dh.agenda.model.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer>{

}
