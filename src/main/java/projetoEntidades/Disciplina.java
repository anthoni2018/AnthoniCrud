package projetoEntidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Disciplina{
	
	@Id
	@Column(name = "id_dis")
	private Integer idDisciplina;

	private String nome;
	private String professor;
	
	public Integer getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(Integer idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	@Override
	public String toString() {
		return "Disciplina [idDisciplina=" + idDisciplina + ", nome=" + nome + ", professor=" + professor + "]";
	}
}

