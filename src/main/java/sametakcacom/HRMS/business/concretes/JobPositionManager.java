package sametakcacom.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sun.net.httpserver.Authenticator.Result;

import sametakcacom.HRMS.business.abstracts.JobPositionService;
import sametakcacom.HRMS.core.utilities.results.DataResult;
import sametakcacom.HRMS.core.utilities.results.SuccessDataResult;
import sametakcacom.HRMS.core.utilities.results.SuccessResult;
import sametakcacom.HRMS.dataAccess.abstracts.JobPositionDao;
import sametakcacom.HRMS.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>
		(this.jobPositionDao.findAll(),"Data listelendi");		
	}
	
	
	@Override
	public sametakcacom.HRMS.core.utilities.results.Result add(JobPosition jobPosition) {
		
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("iş alanı eklendi, Başarılı :)");
		
	}
	
	}




