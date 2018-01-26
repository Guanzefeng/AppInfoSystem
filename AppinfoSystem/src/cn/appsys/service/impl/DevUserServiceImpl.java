package cn.appsys.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.DevUserMapper;
import cn.appsys.pojo.DevUser;
import cn.appsys.service.DevUserService;



@Service
public class DevUserServiceImpl implements DevUserService{
	@Resource
	private DevUserMapper devUserMapper;
	@Override
	public DevUser login(String devCode, String userPassword) throws Exception {
		DevUser user = null;
		user = devUserMapper.getLoginUser(devCode);
		if(null != user){//登录成功	
			//验证密码
			if(!userPassword.equals(user.getDevPassword())){
				user = null;
			}
		}
		return user;
	}
}

