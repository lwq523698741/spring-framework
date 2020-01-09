package com.sanza.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-08 10:41
 **/
public class ProxyFactory implements MethodInterceptor {


	public static Object createProxy (Object target) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		enhancer.setClassLoader(target.getClass().getClassLoader());
		enhancer.setCallback(new ProxyFactory());
		return enhancer.create();
	}


	@Override
	public Object intercept(Object o, Method method, Object[] params, MethodProxy methodProxy) throws Throwable {
		Object result = null;
		try {
			before();
			result = methodProxy.invokeSuper(o,params); //执行父类的方法
			after();
		}catch (Exception e) {

			exception(e);
		}finally {
			beforeReturning();
		}
		return result;
	}

	private void beforeReturning() {
		System.out.println("返回前打印");
	}

	private void exception(Exception e) {
		System.out.println("异常打印");
	}

	private void after() {
		System.out.println("之后");
	}

	private void before() {
		System.out.println("之前");
	}
}
