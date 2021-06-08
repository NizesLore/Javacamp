package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.core.utilities.results.DataResult;
import hrmsproject.hrms.core.utilities.results.Result;
import hrmsproject.hrms.entities.concretes.ActivationCode;

public interface ActivationCodeService {
	DataResult<List<ActivationCode>> getAll();
	Result add(ActivationCode activationCode);

}
