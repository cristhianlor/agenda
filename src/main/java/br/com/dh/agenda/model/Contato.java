package br.com.dh.agenda.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_contato")
public class Contato {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nome", length = 20, nullable = false)
	private String nome;
	@Column(name = "sbnome", length = 60, nullable = false)
	private String sobrenome;
	@Column(name = "apelido", length = 60, nullable = false)
	private String apelido;
	@OneToMany(mappedBy = "contato")
	private List<Telefone> telefones = new ArrayList<>();
	@OneToMany(mappedBy = "contato")
	private List<Endereco> enderecos = new ArrayList<>();
	@OneToMany(mappedBy = "contato")
	private List<Email> emails = new ArrayList<>();

	public Contato() {
	}

	public Contato(String nome, String sobrenome, String apelido) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public String getApelido() {
		return apelido;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
