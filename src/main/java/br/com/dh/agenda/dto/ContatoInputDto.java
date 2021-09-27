package br.com.dh.agenda.dto;

import java.util.HashSet;
import java.util.Set;

public class ContatoInputDto {

	private Integer contatoId;
	private String nome;
	private String sobrenome;
	private String apelido;
	private Set<EnderecoInputDto> enderecos = new HashSet<>();
	private Set<TelefoneInputDto> telefones = new HashSet<>();
	private Set<EmailInputDto> emails = new HashSet<>();

	public ContatoInputDto(Integer contatoId, String nome, String sobrenome, String apelido) {
		this.contatoId = contatoId;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;

	}

	public Integer getContatoId() {
		return contatoId;
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

	public Set<EnderecoInputDto> getEnderecos() {
		return enderecos;
	}

	public Set<TelefoneInputDto> getTelefones() {
		return telefones;
	}

	public Set<EmailInputDto> getEmails() {
		return emails;
	}
	
	

}
