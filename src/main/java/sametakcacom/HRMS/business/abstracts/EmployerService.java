package sametakcacom.HRMS.business.abstracts;

import java.util.List;



import com.sun.net.httpserver.Authenticator.Result;

import sametakcacom.HRMS.core.utilities.results.DataResult;
import sametakcacom.HRMS.entities.concretes.Employers;
import sametakcacom.HRMS.entities.dtos.EmployerForRegisterDto;

public interface EmployerService {

	
	 DataResult<List<Employers>> getAll();
	 Result register(EmployerForRegisterDto employer);
	
}
