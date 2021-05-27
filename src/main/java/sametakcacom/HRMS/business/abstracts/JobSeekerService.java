package sametakcacom.HRMS.business.abstracts;

import java.util.List;

import com.sun.net.httpserver.Authenticator.Result;

import sametakcacom.HRMS.core.utilities.results.DataResult;
import sametakcacom.HRMS.entities.concretes.JobSeeker;
import sametakcacom.HRMS.entities.dtos.JobSeekerForRegisterDto;

public interface JobSeekerService {

	  DataResult<List<JobSeeker>> getAll();
	  Result register(JobSeekerForRegisterDto JobSeeker);
	
}
