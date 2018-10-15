package projetobean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projetoDao.DaoDis;
import projetoEntidades.Disciplina;
import projetoServicos.PersistenciaDacException;

@ViewScoped
@Named
public class DisciplinaBean implements Serializable {
	
	@Inject
	private DaoDis dao;

	private Disciplina disciplina;
	private String disciplinaBusca;
	
	@PostConstruct
	public void init() {
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String getDisciplinaBusca() {
		return disciplinaBusca;
	}

	public void setDisciplinaBusca(String disciplinaBusca) {
		this.disciplinaBusca = disciplinaBusca;
	}

	public void adicionarDisciplina() throws PersistenciaDacException {
		Disciplina disciplina2 = dao.getByID(disciplina.getIdDisciplina());
		
		if (disciplina2 == null) {
			dao.save(disciplina);
			
		} else {
			disciplina2.setProfessor(disciplina.getProfessor());
			disciplina2.setNome(disciplina.getNome());
			disciplina2.setIdDisciplina(disciplina.getIdDisciplina());
			dao.update(disciplina2);
		}
		disciplina = new Disciplina();
	}

	public void removerDisciplina(Disciplina idDisciplina) throws PersistenciaDacException {
		dao.delete(idDisciplina);
	}

	public DisciplinaBean() {
		disciplina = new Disciplina();
	}
}
