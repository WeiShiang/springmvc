package com.odm.model.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.odm.model.entity.OdpersonRefEntity;

@Service
@Component
public interface LoginService {
	
	public OdpersonRefEntity getPersonId(String personId);

}
