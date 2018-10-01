package projetoDao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import projetoEntidades.Disciplina;
import projetoServicos.PersistenciaDacException;
import util.TransacionalCDI;

public class DaoDis {

	@Inject
	private EntityManager manager;

	@TransacionalCDI
	public void save(Disciplina disciplina) throws PersistenciaDacException {
		manager.persist(disciplina);
	}
	
	@TransacionalCDI
	public void update(Disciplina disciplina) throws PersistenciaDacException {
		manager.merge(disciplina);
		
	}
	
	@TransacionalCDI
	public void delete(Disciplina dis) throws PersistenciaDacException {
		Disciplina disciplina = manager.find(Disciplina.class, dis.getIdDisciplina());
		
	}
	
	public Disciplina getByID(int idDisciplina) throws PersistenciaDacException {
		return manager.find(Disciplina.class, idDisciplina);
	}
	
	public List<Disciplina> getAll() throws PersistenciaDacException {
		Query query = manager.createQuery("from Disciplina");
		return query.getResultList();
	}
	
}
