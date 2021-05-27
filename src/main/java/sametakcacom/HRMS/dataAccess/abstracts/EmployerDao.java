package sametakcacom.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sametakcacom.HRMS.entities.concretes.Employers;

public interface EmployerDao extends JpaRepository<Employers, Integer> {

}
