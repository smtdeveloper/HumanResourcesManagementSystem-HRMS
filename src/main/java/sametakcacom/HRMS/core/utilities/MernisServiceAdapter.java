package sametakcacom.HRMS.core.utilities;



import sametakcacom.HRMS.core.utilities.results.SuccessResult;

public class MernisServiceAdapter implements IdentityValidationService {

	@Override
	public sametakcacom.HRMS.core.utilities.results.Result validate(String tckn, String firstName, String lastName, int yearOfDate) {
		return new SuccessResult("TCKN doğrulaması başarılı.");
	
	}

}
