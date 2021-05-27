package sametakcacom.HRMS.business.abstracts;

import java.util.List;

import sametakcacom.HRMS.core.utilities.results.DataResult;
import sametakcacom.HRMS.entities.concretes.SystemUser;

public interface SystemUserService {

	DataResult< List<SystemUser> >  getAll();
	
}
