package sametakcacom.HRMS.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import sametakcacom.HRMS.core.utilities.results.DataResult;
import sametakcacom.HRMS.entities.concretes.JobPosition;

public interface JobPositionService {

	DataResult<List<JobPosition>>  getAll();
	sametakcacom.HRMS.core.utilities.results.Result add(JobPosition jobPosition);
	
}
