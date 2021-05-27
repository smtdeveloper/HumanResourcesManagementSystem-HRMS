package sametakcacom.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sametakcacom.HRMS.entities.concretes.JobSeeker;

public interface JobSeekerDao  extends JpaRepository<JobSeeker,Integer> {

	
	
}
