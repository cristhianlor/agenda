package br.com.dh.agenda.dto;

import br.com.dh.agenda.model.Contato;
import br.com.dh.agenda.model.Telefone;
import br.com.dh.agenda.model.TipoTelefone;

public class TelefoneInputDto {

	private Integer contatoId;
	private TipoTelefone tipoTelefone;
	private int ddd;
	private Long numero;

	public TelefoneInputDto(Integer contatoId, TipoTelefone tipoTelefone, int ddd, Long numero) {
		this.contatoId = contatoId;
		this.tipoTelefone = tipoTelefone;
		this.ddd = ddd;
		this.numero = numero;
	}

	public TelefoneInputDto() {
	}

	public Integer getContatoId() {
		return contatoId;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public int getDdd() {
		return ddd;
	}

	public Long getNumero() {
		return numero;
	}
	
	public Telefone converte(Contato contato) {
		Telefone telefone = new Telefone(tipoTelefone, ddd, numero, contato);
		
		return telefone;
	}

}
