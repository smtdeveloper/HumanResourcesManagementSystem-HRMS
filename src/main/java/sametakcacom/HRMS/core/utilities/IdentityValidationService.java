package sametakcacom.HRMS.core.utilities;



public interface IdentityValidationService {

	sametakcacom.HRMS.core.utilities.results.Result validate(String tckn, String firstName, String lastName, int yearOfDate);
	
}

