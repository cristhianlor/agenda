package br.com.dh.agenda.dto;

import br.com.dh.agenda.model.TipoEmail;

public class EmailInputDto {

	private Integer contatoId;
	private TipoEmail tipoEmail;
	private String email;

	public EmailInputDto(Integer contatoId, TipoEmail tipoEmail, String email) {
		this.contatoId = contatoId;
		this.tipoEmail = tipoEmail;
		this.email = email;
	}

	public EmailInputDto() {
	}

	public Integer getContatoId() {
		return contatoId;
	}

	public TipoEmail getTipoEmail() {
		return tipoEmail;
	}

	public String getEmail() {
		return email;
	}

}
