package com.sanza.factorybean;

import org.springframework.asm.Handle;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-15 14:42
 **/
@Component
public class FactoryBeanLearn implements FactoryBean<HandleInvoke> {

	@Override
	public HandleInvoke getObject()  {
		return new HandleInvokeimpl();
	}

	@Override
	public Class<?> getObjectType() {
		return HandleInvoke.class;
	}
}
