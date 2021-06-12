package hrmsproject.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsproject.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer>{
	
	JobAdvertisement getById(int id);
	List<JobAdvertisement> getByIsActivatedTrue();
	List<JobAdvertisement> getByIsActivatedTrueOrderByCreatedDateDesc();
	List<JobAdvertisement> getByIsActivatedTrueAndEmployer (int employerId);
	
    
    
    
    
    
    
    
    
}
