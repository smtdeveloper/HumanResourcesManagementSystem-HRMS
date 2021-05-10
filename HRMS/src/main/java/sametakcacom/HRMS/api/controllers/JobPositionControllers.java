package sametakcacom.HRMS.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sametakcacom.HRMS.business.abstracts.JobPositionService;
import sametakcacom.HRMS.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/job/positions")
public class JobPositionControllers {

	private JobPositionService jobPositionService;

	@Autowired
	public JobPositionControllers(JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	};
	
	@GetMapping("/getall")
	public List<JobPosition> getAll(){
		
		return this.jobPositionService.getAll();
	}
}
