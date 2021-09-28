package br.com.dh.agenda.dto;

import br.com.dh.agenda.model.Contato;
import br.com.dh.agenda.model.Endereco;
import br.com.dh.agenda.model.TipoEndereco;

public class EnderecoInputDto {

	private Integer contatoId;
	private TipoEndereco tipoEndereco;
	private String logradouro;
	private int numero;
	private String complemento;

	public EnderecoInputDto(Integer contatoId, TipoEndereco tipoEndereco, String logradouro, int numero,
			String complemento) {
		this.contatoId = contatoId;
		this.tipoEndereco = tipoEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
	}

	public EnderecoInputDto() {
	}

	public Integer getContatoId() {
		return contatoId;
	}

	public TipoEndereco getTipoEndereco() {
		return tipoEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public Endereco converte(Contato contato) {
		Endereco endereco = new Endereco(tipoEndereco, logradouro, numero, complemento, contato);

		return endereco;
	}

}
