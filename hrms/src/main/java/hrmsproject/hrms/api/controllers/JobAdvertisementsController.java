package hrmsproject.hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hrmsproject.hrms.business.abstracts.JobAdvertisementService;
import hrmsproject.hrms.core.utilities.results.DataResult;
import hrmsproject.hrms.core.utilities.results.Result;
import hrmsproject.hrms.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	@GetMapping("/getall")
	public DataResult <List<JobAdvertisement>> getAll(){
		
		return this.jobAdvertisementService.getAll();
		
	}
	@GetMapping("/getbyisactivatedtrueandemployer")
	public DataResult<List<JobAdvertisement>> getByIsActivatedtrueAndEmployer (@RequestParam int id){
		return this.jobAdvertisementService.getByIsActivatedTrueAndEmployer(id);
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
		return this.jobAdvertisementService.add(jobAdvertisement);		
		
	}
	@PostMapping("/update")
	public Result update(@RequestBody int id) {
		return this.jobAdvertisementService.update(id);
				
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestParam int id ) {
		return this.jobAdvertisementService.delete(id);
		
		
	}
	@GetMapping("/getbyid")
	public DataResult <JobAdvertisement> getById(@RequestParam int id){
		return this.jobAdvertisementService.getById(id);
		
		
	}
	@GetMapping("/getbyisactivatedtrue")
	public DataResult< List<JobAdvertisement>> getByIsActivatedTrue(){
		return this.jobAdvertisementService.getByIsActivatedTrue();
		
		
	}
	@GetMapping("/getbyisactivatedtrueorderbycreateddatedesc")
	public DataResult< List<JobAdvertisement>> getByIsActivatedTrueOrderByCreatedDateDesc(){
		return this.jobAdvertisementService.getByIsActivatedTrueOrderByCreatedDateDesc();
		
	}
	
	

}
