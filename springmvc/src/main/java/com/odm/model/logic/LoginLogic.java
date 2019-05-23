package com.odm.model.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.odm.model.entity.OdpersonRefEntity;
import com.odm.model.serviceImpl.LoginServiceImpl;
import com.odm.view.bean.LoginBean;

@Component
@ComponentScan(basePackages = { "com.odm.model.serviceImpl" })
public class LoginLogic {
	
	@Autowired
	private LoginServiceImpl loginServiceImpl;
	
	public OdpersonRefEntity getPersonId (LoginBean loginBean) {
		System.out.println("OdpersonRefEntity" + loginBean.getPersonId());
		
		return loginServiceImpl.getPersonId(loginBean.getPersonId());
	}
}
