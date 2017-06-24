package com.yi.dubbo.Dubbo;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.dubbo.dao.IDubboDao;
import com.yi.dubbo.domain.User;
import com.yi.dubbo.redis.UserRidesService;

@ContextConfiguration(locations = {"classpath:application.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class DubboUserTest {

	@Resource
	private IDubboDao dubboDao;
	@Resource
	private UserRidesService userRidesService;
	
	@Test
	public void testUserList(){
		List<User> users = dubboDao.queryUser();
		System.out.println(users);
	}
	
	@Test
	public void testUserRedis(){
		
		List<User> users = dubboDao.queryUser();
		userRidesService.put(users.get(0));
		
		System.out.println(userRidesService.get(users.get(0)));
		
	}
}
