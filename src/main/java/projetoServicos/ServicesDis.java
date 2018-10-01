package projetoServicos;

import java.io.Serializable;
import java.util.List;

import projetoDao.DaoDis;
import projetoEntidades.Disciplina;

public class ServicesDis implements Serializable {
	
	private static final long serialVersionUID = -7803325791425670859L;
	
	private DaoDis Dao = new DaoDis();
	
	public void save(Disciplina dis) throws ServiceDacException {
		try {
			Dao.save(dis);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void update(Disciplina dis) throws ServiceDacException {
		
		try {
			Dao.update(dis);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void delete(Disciplina dis) throws ServiceDacException {
		try {
			Dao.delete(dis);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public Disciplina getByID(int disId) throws ServiceDacException {
		try {
			return Dao.getByID(disId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public List <Disciplina> getAll() throws ServiceDacException {
		try {
			return Dao.getAll();
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}


}
