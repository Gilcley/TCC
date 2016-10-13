package br.com.diagnosticus_action.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "diagnostico")
public class Diagnostico {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIAGNOSTICO_SEQ")
	@SequenceGenerator(name = "DIAGNOSTICO_SEQ", sequenceName = "diagnostico_seq", allocationSize = 1)
	@Column(name = "iddiagnostico")
	private Integer IdDiagnostico;

	@Column(name = "tratamento")
	private String Tratamento;

	@Column(name = "descricaodiagnostico")
	private String DescricaoDiagnostico;

	public Diagnostico() {

	}

	public Integer getIdDiagnostico() {
		return IdDiagnostico;
	}

	public void setIdDiagnostico(Integer idDiagnostico) {
		IdDiagnostico = idDiagnostico;
	}

	public String getTratamento() {
		return Tratamento;
	}

	public void setTratamento(String tratamento) {
		Tratamento = tratamento;
	}

	public String getDescricaoDiagnostico() {
		return DescricaoDiagnostico;
	}

	public void setDescricaoDiagnostico(String descricaoDiagnostico) {
		DescricaoDiagnostico = descricaoDiagnostico;
	}

}
