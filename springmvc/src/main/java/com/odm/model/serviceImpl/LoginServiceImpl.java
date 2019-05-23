package com.odm.model.serviceImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.odm.model.dao.OdpersonRefDao;
import com.odm.model.entity.OdpersonRefEntity;
import com.odm.model.repository.OdpersonRefRepository;
import com.odm.model.service.LoginService;



@Component
@ComponentScan(basePackages = { "com.odm.model.dao" })
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private OdpersonRefDao odpersonRefDao;

	@Override
	public OdpersonRefEntity getPersonId(String personId) {
		System.out.println("111" + personId);
		return odpersonRefDao.findOne(personId);
	}

}
