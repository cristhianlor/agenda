package br.com.dh.agenda.dto;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import br.com.dh.agenda.model.Contato;
import br.com.dh.agenda.model.Email;
import br.com.dh.agenda.model.Endereco;
import br.com.dh.agenda.model.Telefone;

public class ContatoInputDto {

	private Integer contatoId;
	private String nome;
	private String sobrenome;
	private String apelido;
	private Set<EnderecoInputDto> enderecos = new HashSet<>();
	private Set<TelefoneInputDto> telefones = new HashSet<>();
	private Set<EmailInputDto> emails = new HashSet<>();

	public ContatoInputDto(Integer contatoId, String nome, String sobrenome, String apelido, Set<EnderecoInputDto> enderecos) {
		this.contatoId = contatoId;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.apelido = apelido;
		this.enderecos = enderecos;

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

	public Contato converte() {
		Contato contato = new Contato(nome, sobrenome, apelido);

		List<Endereco> end = enderecos.stream().map(e -> e.converte(contato)).collect(Collectors.toList());
		
		List<Telefone> tel = telefones.stream().map(t -> t.converte(contato)).collect(Collectors.toList());
		
		List<Email> em = emails.stream().map(email -> email.converte(contato)).collect(Collectors.toList());
					
		contato.adicionaEnderecos(end);
		
		contato.adicionaTelefones(tel);
		
		contato.adicionaEmails(em);
		
		return contato;
	}

}
