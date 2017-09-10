package com.yi.dubbo.service;

/**
 * 测试动态方法
 * @author Administrator
 *
 */
public interface IDynamicService {

	/**
	 * 动态调用的方法
	 * @param name
	 * @return
	 */
	public String invoke(String name) ;
}
