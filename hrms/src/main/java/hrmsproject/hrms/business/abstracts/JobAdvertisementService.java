package hrmsproject.hrms.business.abstracts;

import java.util.List;

import hrmsproject.hrms.core.utilities.results.DataResult;
import hrmsproject.hrms.core.utilities.results.Result;
import hrmsproject.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	DataResult< List<JobAdvertisement>> getAll();
	Result add (JobAdvertisement jobAdvertisement);
	Result update ( int id);
	Result delete (int id);
	DataResult<JobAdvertisement> getById(int id);
	DataResult<List<JobAdvertisement>> getByIsActivatedTrue();
	DataResult<List<JobAdvertisement>> getByIsActivatedTrueOrderByCreatedDateDesc();
	DataResult<List<JobAdvertisement>> getByIsActivatedTrueAndEmployer (int employerId);
	
}
