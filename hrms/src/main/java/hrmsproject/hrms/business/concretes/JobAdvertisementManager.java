package hrmsproject.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hrmsproject.hrms.business.abstracts.JobAdvertisementService;
import hrmsproject.hrms.core.utilities.results.DataResult;
import hrmsproject.hrms.core.utilities.results.Result;
import hrmsproject.hrms.core.utilities.results.SuccessDataResult;
import hrmsproject.hrms.core.utilities.results.SuccessResult;
import hrmsproject.hrms.dataAccess.abstracts.JobAdvertisementDao;
import hrmsproject.hrms.entities.concretes.JobAdvertisement;



@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;
	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	
	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Job advertisements are listed..");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
			this.jobAdvertisementDao.save(jobAdvertisement);
			return new SuccessResult("job advertisement is added..");
		
	}

	@Override
	public Result update(int id) {
		this.jobAdvertisementDao.getById(id);
		return new SuccessResult("job advertisement is updated..");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertisementDao.deleteById(id);
		return new SuccessResult("job advertisement is deleted..");
	}

	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		return new SuccessDataResult <JobAdvertisement>(this.jobAdvertisementDao.getById(id),
				"Job advertisements are listed by id..");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActivatedTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActivatedTrue(),
				"Active job advertisements are listed..");
	}

	@Override
	public DataResult <List<JobAdvertisement>> getByIsActivatedTrueOrderByCreatedDateDesc() {
		return new SuccessDataResult <List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActivatedTrueOrderByCreatedDateDesc(),
				"Active job advertisements are listed according to created date desc.. ");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsActivatedTrueAndEmployer(int employerId) {
		return new SuccessDataResult <List<JobAdvertisement>>
		(this.jobAdvertisementDao.getByIsActivatedTrueAndEmployer(employerId),
		"Active job advertisements are listed by employer ");
	}

}
