package projetobean;

import java.io.Serializable;
import java.util.Collection;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import projetoDao.DaoAlu;
import projetoEntidades.Aluno;
import projetoEntidades.Disciplina;
import projetoEntidades.Professor;
import projetoEntidades.Turma;
import projetoServicos.PersistenciaDacException;

@ViewScoped
@Named
public class AlunoBean implements Serializable {

	@Inject
	private DaoAlu dao;

	private Aluno aluno;
	private String alunoBusca;
	
	protected Disciplina entidade1;
	protected Collection<Disciplina> entidades1;
	
	protected Professor entidade2;
	protected Collection<Professor> entidades2;
	
	protected Turma entidade3;
	protected Collection<Turma> entidades3;	
	
	
	@PostConstruct
	public void init() {
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String getAlunoBusca() {
		return alunoBusca;
	}

	public void setAlunoBusca(String alunoBusca) {
		this.alunoBusca = alunoBusca;
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

	public void adicionarAluno() throws PersistenciaDacException {
		Aluno aluno2 = dao.getByID(aluno.getIdAluno());
		
		if (aluno2 == null) {
			dao.save(aluno);
			
		} else {
			aluno2.setIdade(aluno.getIdade());
			aluno2.setNome(aluno.getNome());
			aluno2.setIdAluno(aluno.getIdAluno());
			dao.update(aluno2);
		}
		aluno = new Aluno();
	}

	public void removerAluno(Aluno idAluno) throws PersistenciaDacException {
		dao.delete(idAluno);
	}

	public AlunoBean() {
		aluno = new Aluno();
	}
	
}
