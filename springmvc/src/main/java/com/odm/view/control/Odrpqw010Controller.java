package com.odm.view.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.odm.model.entity.OdpersonRefEntity;
import com.odm.model.logic.LoginLogic;
import com.odm.view.bean.LoginBean;

@Controller
@RequestMapping("/")
@ComponentScan(basePackages = { "com.odm.model.logic" })
public class Odrpqw010Controller {
	
	@Autowired
	private LoginLogic loginLogic;
	
	@RequestMapping(value = "/odrpqw010.do", method = RequestMethod.GET)
	public ModelAndView init() {
		LoginBean loginBean = new LoginBean();
		OdpersonRefEntity theCustomers = loginLogic.getPersonId(loginBean);
		return new ModelAndView("odrpqw010" , "theCustomers", theCustomers);
	}

	
}
