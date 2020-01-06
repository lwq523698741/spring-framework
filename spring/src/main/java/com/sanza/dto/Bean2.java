package com.sanza.dto;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
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
public class Bean2 implements ApplicationContextAware, InitializingBean, DisposableBean {

	public Bean2() {
		System.out.println("Bean2 构造器");
	}

	@Override
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
	}
}
