package com.sanza.dto;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-07 14:10
 **/
@Component
@Aspect
public class AspectClass {

	@Pointcut("within(com.sanza.dto.Bean2)")
	public void point() {

	}
	@Pointcut("within(com.sanza.dto.Bean1)")
	public void point2() {

	}

	@After("point2()")
	public void after2 () {
		System.out.println("my is after");
	}

	@After("point()")
	public void after () {
		System.out.println("my is after");
	}
}
