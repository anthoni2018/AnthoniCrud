package projetobean;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projetoDao.DaoProf;
import projetoEntidades.Disciplina;
import projetoEntidades.Professor;
import projetoEntidades.Turma;
import projetoServicos.PersistenciaDacException;

@ViewScoped
@Named
public class ProfessorBean implements Serializable{
    
	@Inject
	private DaoProf dao;
    
	private Professor professor;
	private String professorBusca;
	
	protected Disciplina entidade1;
	protected Collection<Disciplina> entidades1;
	
	protected Professor entidade2;
	protected Collection<Professor> entidades2;
	
	protected Turma entidade3;
	protected Collection<Turma> entidades3;	
	
	@PostConstruct
	public void init() {
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String getProfessorBusca() {
		return professorBusca;
	}

	public void setProfessorBusca(String professorBusca) {
		this.professorBusca = professorBusca;
	}
	
	
	public Collection<Disciplina> getEntidades1() {
		return entidades1;
	}
	
	public Collection<Professor> getEntidades2() {
		return entidades2;
	}
	
	public Collection<Turma> getEntidades3() {
		return entidades3;
	}
	
    
    public void adicionarProfessor() throws PersistenciaDacException{
   	 Professor professor2 = dao.getByID(professor.getIdProfessor());
   	 
    	if (professor2 == null) {
   		 dao.save(professor);    
       	 
    	}else {
   		 professor2.setNome(professor.getNome());
   		 professor2.setIdProfessor(professor.getIdProfessor());
   		 dao.update(professor2);
    	}
    	professor = new Professor();
	}
    
	public void removerProfessor(Professor idProfessor) throws PersistenciaDacException{
		dao.delete(idProfessor);
	}
    
	public ProfessorBean() {
   	 	professor = new Professor();
	}
}
