package sametakcacom.HRMS.core.utilities.helpers.email;

import com.sun.net.httpserver.Authenticator.Result;

public interface EmailService {

	sametakcacom.HRMS.core.utilities.results.Result send(String to, String title, String message);
	
}
