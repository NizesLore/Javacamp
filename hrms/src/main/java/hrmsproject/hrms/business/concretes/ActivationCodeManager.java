package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.ActivationCodeService;
import hrmsproject.hrms.dataAccess.abstracts.ActivationCodeDao;
import hrmsproject.hrms.entities.concretes.ActivationCode;
@Service
public class ActivationCodeManager implements ActivationCodeService{

	private ActivationCodeDao activationCodeDao;
	@Autowired
	public ActivationCodeManager(ActivationCodeDao activationCodeDao) {
		super();
		this.activationCodeDao = activationCodeDao;
	}

	@Override
	public List<ActivationCode> getAll() {
		
		return this.activationCodeDao.findAll();
	}
	

}
