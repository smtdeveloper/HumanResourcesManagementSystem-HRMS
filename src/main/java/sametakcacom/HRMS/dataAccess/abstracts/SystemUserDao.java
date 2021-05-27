package sametakcacom.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sametakcacom.HRMS.entities.concretes.SystemUser;

public interface SystemUserDao extends JpaRepository<SystemUser, Integer> {

}
