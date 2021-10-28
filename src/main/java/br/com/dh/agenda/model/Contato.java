package br.com.dh.agenda.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity

@Table(name = "tb_contato")
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	@Column(name = "nome", length = 20, nullable = false)
	private String nome;
	@Column(name = "sbnome", length = 60, nullable = false)
	private String sobrenome;
	@Column(name = "apelido", length = 60, nullable = false)
	private String apelido;

	@OneToMany(mappedBy = "contato", cascade = CascadeType.ALL)
	private List<Telefone> telefones = new ArrayList<>();
	@OneToMany(mappedBy = "contato", cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();
	@OneToMany(mappedBy = "contato", cascade = CascadeType.ALL)
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

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public List<Email> getEmails() {
		return emails;
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

	public void adicionaEnderecos(List<Endereco> end) {
		this.enderecos = end;

	}

	public void adicionaTelefones(List<Telefone> tel) {
		this.telefones = tel;

	}

	public void adicionaEmails(List<Email> em) {
		this.emails = em;

	}

}
