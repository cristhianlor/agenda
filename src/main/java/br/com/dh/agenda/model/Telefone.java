package br.com.dh.agenda.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_telefone")
public class Telefone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private TipoTelefone tipoTelefone;
	@Column(name = "cd_area", length = 3, nullable = false)
	private int ddd;
	@Column(name = "num_tel", length = 9, nullable = false)
	private Long numero;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "contato_id", nullable = false)
	private Contato contato;

	public Telefone() {
	}

	public Telefone(TipoTelefone tipoTelefone, int ddd, Long numero, Contato contato) {
		this.tipoTelefone = tipoTelefone;
		this.ddd = ddd;
		this.numero = numero;
		this.contato = contato;
	}

	public TipoTelefone getTipoTelefone() {
		return tipoTelefone;
	}

	public Integer getId() {
		return id;
	}

	public int getDdd() {
		return ddd;
	}

	public Long getNumero() {
		return numero;
	}

	public Contato getContato() {
		return contato;
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
		Telefone other = (Telefone) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
