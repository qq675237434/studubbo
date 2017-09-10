package com.yi.dubbo.service;

import org.springframework.stereotype.Service;

@Service
public class DynamicService implements IDynamicService {

	@Override
	public String invoke(String name) {
		System.out.println("good  luck :" + name);
		return "say hello  : " + name;
	}

}
