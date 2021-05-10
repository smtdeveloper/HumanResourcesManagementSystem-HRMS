package sametakcacom.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sametakcacom.HRMS.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

	
}
