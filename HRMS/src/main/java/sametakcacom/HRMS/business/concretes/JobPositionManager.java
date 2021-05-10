package sametakcacom.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sametakcacom.HRMS.business.abstracts.JobPositionService;
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
	public List<JobPosition> getAll() {
	
		return this.jobPositionDao.findAll();
	}

}
