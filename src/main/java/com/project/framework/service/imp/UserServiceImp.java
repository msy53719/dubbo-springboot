package com.project.framework.service.imp;


import com.project.framework.dto.UserDto;
import com.project.framework.result.ResultDto;
import com.project.framework.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserServiceImp implements UserService {

	public ResultDto reginseter(UserDto user) {

		log.debug("用户信息{}", user.getName(), user.getPhone());
		ResultDto rsd = new ResultDto();
		if (null != user.getPhone()) {
			rsd.setCode("000");
			rsd.setMsg("成功");
			return rsd;
		} else {
			return null;
		}
	}

}
