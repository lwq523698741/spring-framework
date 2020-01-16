package com.sanza.factorybean;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-15 14:41
 **/
public class HandleInvokeimpl implements HandleInvoke {
	@Override
	public String testCreate() {
		return "CREATE BEAN";
	}
}
