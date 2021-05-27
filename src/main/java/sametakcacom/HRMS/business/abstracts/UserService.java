package sametakcacom.HRMS.business.abstracts;

import java.util.List;

import org.apache.catalina.User;

import com.sun.net.httpserver.Authenticator.Result;

import sametakcacom.HRMS.core.utilities.results.DataResult;

public interface UserService {

	DataResult<List<User>> getAll();
	DataResult<User> getByEmail(String email);
	Result add(User user);
	Result verifyUser(String email,String verificationCode);
	
}
