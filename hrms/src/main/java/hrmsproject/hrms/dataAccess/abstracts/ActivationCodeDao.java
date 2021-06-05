package hrmsproject.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import hrmsproject.hrms.entities.concretes.ActivationCode;

public interface ActivationCodeDao extends JpaRepository< ActivationCode, Integer>{

}
