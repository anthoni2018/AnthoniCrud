package projetoDao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import projetoEntidades.Professor;
import projetoEntidades.Turma;
import projetoServicos.PersistenciaDacException;
import util.TransacionalCDI;

public class DaoTur {
	
	@Inject
	private EntityManager manager;

	@TransacionalCDI
	public void save(Turma turma) throws PersistenciaDacException {
		manager.persist(turma);
	}

	@TransacionalCDI
	public void update(Turma turma) throws PersistenciaDacException {
		manager.merge(turma);
	}

	@TransacionalCDI
	public void delete(Turma tur) throws PersistenciaDacException {
		Turma turma = manager.find(Turma.class, tur.getIdTurma());
	}

	public Turma getByID(int idTurma) throws PersistenciaDacException {
		return manager.find(Turma.class, idTurma);
	}
	
	public List<Turma> getAll() throws PersistenciaDacException {
		Query query = manager.createQuery("from Turma");
		return query.getResultList();
	}

}
