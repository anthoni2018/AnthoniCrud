package projetoServicos;

import java.io.Serializable;
import java.util.List;

import projetoDao.DaoTur;
import projetoEntidades.Turma;

public class ServicesTur implements Serializable {
	
	private static final long serialVersionUID = -7803325791425670859L;
	
	private DaoTur Dao = new DaoTur();
	
	public void save(Turma tur) throws ServiceDacException {
		try {
			Dao.save(tur);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void update(Turma tur) throws ServiceDacException {
		
		try {
			Dao.update(tur);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void delete(Turma tur) throws ServiceDacException {
	
		try {
			Dao.delete(tur);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public Turma getByID(int turId) throws ServiceDacException {
		try {
			return Dao.getByID(turId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public List <Turma> getAll() throws ServiceDacException {
		try {
			return Dao.getAll();
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}
}

