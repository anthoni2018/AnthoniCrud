package projetobean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projetoDao.DaoTur;
import projetoEntidades.Turma;
import projetoServicos.PersistenciaDacException;

@ViewScoped
@Named
public class TurmaBean implements Serializable {
	
	@Inject
	private DaoTur dao;

	private Turma turma;
	private String turmaBusca;
	
	@PostConstruct
	public void init() {
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getTurmaBusca() {
		return turmaBusca;
	}

	public void setTurmaBusca(String turmaBusca) {
		this.turmaBusca = turmaBusca;
	}

	public void adicionarTurma() throws PersistenciaDacException {
		Turma turma2 = dao.getByID(turma.getIdTurma());
		
		if (turma2 == null) {
			dao.save(turma);
			
		} else {
			turma2.setProfessor(turma.getProfessor());
			turma2.setDisciplina(turma.getDisciplina());
			turma2.setIdTurma(turma.getIdTurma());
			dao.update(turma2);
		}
		turma = new Turma();
	}

	public void removerTurma(Turma idTurma) throws PersistenciaDacException {
		dao.delete(idTurma);
	}

	public TurmaBean() {
		turma = new Turma();
	}

}