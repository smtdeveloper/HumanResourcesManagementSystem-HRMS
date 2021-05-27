package sametakcacom.HRMS.business.concretes;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;

import com.sun.net.httpserver.Authenticator.Result;

import sametakcacom.HRMS.business.abstracts.UserService;
import sametakcacom.HRMS.core.utilities.helpers.email.EmailService;
import sametakcacom.HRMS.core.utilities.results.DataResult;
import sametakcacom.HRMS.dataAccess.abstracts.UserDao;

public class UserManager implements UserService {

	private UserDao userDao;
	private EmailService emailService;
	@Autowired
	public UserManager(UserDao userDao,EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}
	
	@Override
	public DataResult<List<User>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<User> getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result verifyUser(String email, String verificationCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
