package sametakcacom.HRMS.core.utilities.helpers.email;

import com.sun.net.httpserver.Authenticator.Result;

import sametakcacom.HRMS.core.utilities.results.SuccessResult;

public class EmailManager implements EmailService {

	@Override
	public Result send(String to, String title, String message) {
		return new SuccessResult("E-posta başarıyla gönderildi.");
	}

	
	
}
