package com.yi.dubbo.redis;

import javax.annotation.Resource;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.yi.dubbo.domain.User;

@Service
public class UserRidesService {
	@Resource
	RedisTemplate<String , User> redisTemplate;
	
	public void put(User user){
		redisTemplate.opsForHash().put(user.getUserName() , user.hashCode()+"", user.getPassword());
	}

	public void delete(User user){
		//redisTemplate
		redisTemplate.opsForHash().delete(user.getUserName(), user.hashCode()+"");
	}
	
	public String get(User user){
		return redisTemplate.opsForHash().get(user.getUserName(), user.hashCode()+"").toString();		
	}
}
