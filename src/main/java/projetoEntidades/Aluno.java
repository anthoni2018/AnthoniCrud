package projetoEntidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
	
	@Id
	@Column(name = "id_alu")
	private Integer idAluno;

	private int idade;
	private String nome;
	private Integer disciplina;
	private Professor professor;
	private String turma;
	
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Professor getProfessor() {
		return professor;
	}
	
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	
	public Integer getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Integer disciplina) {
		this.disciplina = disciplina;
	}
	public Integer getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", idade=" + idade + ", nome=" + nome + ", disciplina=" + disciplina
				+ ", professor=" + professor + ", turma=" + turma + "]";
	}
	
}
