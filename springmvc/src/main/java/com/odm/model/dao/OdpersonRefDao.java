package com.odm.model.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.odm.model.entity.OdpersonRefEntity;
import com.odm.model.repository.OdpersonRefRepository;

@Component
@ComponentScan(basePackages = { "com.odm.model.repository" })
public class OdpersonRefDao  {
	
	@Autowired
	private OdpersonRefRepository odpersonRefRepository;
	
	
	public OdpersonRefEntity findOne (String personId) {
		return odpersonRefRepository.findByPersonId(personId);
	}
}
