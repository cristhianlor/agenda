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

@Entity
@Table(name = "tb_endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private TipoEndereco tipoEndereco;
	@Column(name = "logradouro", length = 80, nullable = false)
	private String logradouro;
	@Column(name = "numero", length = 5, nullable = false)
	private int numero;
	@Column(name = "complemento", length = 20, nullable = false)
	private String complemento;
	@ManyToOne
	@JoinColumn(name = "contato_id", nullable = false)
	private Contato contato;

	public Endereco() {
	}

	public Endereco(TipoEndereco tipoEndereco, String logradouro, int numero, String complemento, Contato contato) {
		this.tipoEndereco = tipoEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.contato = contato;
	}

	public Integer getId() {
		return id;
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
		Endereco other = (Endereco) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
