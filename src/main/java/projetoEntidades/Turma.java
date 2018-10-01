package projetoEntidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {

	@Id
	@Column(name = "id_tur")
	private Integer idTurma;

	private String professor;
	private Integer disciplina;
	
	public Integer getIdTurma() {
		return idTurma;
	}
	public void setIdTurma(Integer idTurma) {
		this.idTurma = idTurma;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public Integer getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Integer disciplina) {
		this.disciplina = disciplina;
	}
	@Override
	public String toString() {
		return "Turma [idTurma=" + idTurma + ", professor=" + professor + ", disciplina=" + disciplina + "]";
	}

	

}
