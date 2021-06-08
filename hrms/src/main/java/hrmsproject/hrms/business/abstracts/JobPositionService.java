package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.core.utilities.results.DataResult;
import hrmsproject.hrms.core.utilities.results.Result;
import hrmsproject.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult <List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
	
}
