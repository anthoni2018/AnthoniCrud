package projetoDao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import projetoEntidades.Professor;
import projetoServicos.PersistenciaDacException;
import util.TransacionalCDI;

public class DaoProf {
	
	@Inject
	private EntityManager manager;

	@TransacionalCDI
	public void save(Professor professor) throws PersistenciaDacException {
		manager.persist(professor);
	}

	@TransacionalCDI
	public void update(Professor professor) throws PersistenciaDacException {
		manager.merge(professor);
	}

	@TransacionalCDI
	public void delete(Professor prof) throws PersistenciaDacException {
		Professor professor = manager.find(Professor.class, prof.getIdProfessor());
	}

	public Professor getByID(int idProfessor) throws PersistenciaDacException {
		return manager.find(Professor.class, idProfessor);
	}
	
	public List<Professor> getAll() throws PersistenciaDacException {
		Query query = manager.createQuery("from Professor");
		return query.getResultList();
	}
	
}