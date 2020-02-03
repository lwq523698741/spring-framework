package com.sanza.dto;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-02 14:38
 **/
@Component
public class Bean2  {

	//@Autowired
	Bean1 bean1;

	@Autowired
	public Bean2(Bean1 bean1) {
		System.out.println("Bean2 构造器");
		this.bean1 = bean1;
	}

	//@Autowired
	public Bean2(Bean1 bean1,Bean3 bean3) {
		System.out.println("Bean2 构造器");
		this.bean1 = bean1;
	}

	/*public Bean2() {
		System.out.println("Bean2 构造器");
	}*/

	/*@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Bean2 ApplicationContextAware 接口调用");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean2 InitializingBean 初始化接口调用");
	}

	@PostConstruct
	public void init () {
		System.out.println("Bean2 @PostConstruct 初始化接口调用");
	}

	@PreDestroy
	public void destroy1 () {
		System.out.println("Bean2 @PreDestroy 销毁接口调用");
	}


	@Override
	public void destroy() throws Exception {
		System.out.println("Bean2 DisposableBean 接口销毁方法");
	}*/

	public void ioc () {
		System.out.println("this is ioc");
	}

}
