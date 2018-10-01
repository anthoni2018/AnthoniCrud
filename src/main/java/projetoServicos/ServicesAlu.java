package projetoServicos;

import java.util.List;

import projetoDao.DaoAlu;
import projetoEntidades.Aluno;

public class ServicesAlu {
	
	private DaoAlu Dao = new DaoAlu();
	
	
	
	public void save(Aluno alu) throws ServiceDacException {
		try {
			Dao.save(alu);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void update(Aluno alu) throws ServiceDacException {
		
		try {
			Dao.update(alu);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public void delete(Aluno alu) throws ServiceDacException {
		try {
			Dao.delete(alu);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public Aluno getByID(int aluId) throws ServiceDacException {
		try {
			return Dao.getByID(aluId);
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}

	public List <Aluno> getAll() throws ServiceDacException {
		try {
			return Dao.getAll();
		} catch (PersistenciaDacException e) {
			throw new ServiceDacException();
		}
	}


}

