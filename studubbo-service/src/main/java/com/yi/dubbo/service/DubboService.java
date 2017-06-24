package com.yi.dubbo.service;

import org.springframework.stereotype.Service;

@Service
public class DubboService implements IDubboService {

	@Override
	public String say(String name) {
		return  name + ",hello  !!";
	}

}
