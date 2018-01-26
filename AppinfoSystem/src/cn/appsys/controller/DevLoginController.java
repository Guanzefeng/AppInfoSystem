package cn.appsys.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.appsys.service.DevUserService;

public class DevLoginController {
	private Logger logger = Logger.getLogger(DevLoginController.class);
	@Resource
	private DevUserService devUserService;
	/**
	 * ÓÃ»§µÇÂ¼
	 * @return
	 */
	@RequestMapping(value="login.html")
	public String denglu(){
		logger.info("loggin====>");
		System.out.println("============================================>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		return "devlogin";
	}

}
