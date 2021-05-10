package sametakcacom.HRMS.business.abstracts;

import java.util.List;

import sametakcacom.HRMS.entities.concretes.JobPosition;

public interface JobPositionService {

	List<JobPosition> getAll();
	
}
