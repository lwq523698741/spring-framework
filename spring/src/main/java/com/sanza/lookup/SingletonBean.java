package com.sanza.lookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-15 16:15
 **/
@Component
public abstract class SingletonBean {

	@Lookup
	public abstract PrototypeBean getPrototypeBean() ;

	PrototypeBean prototypeBean = new PrototypeBean();
	public PrototypeBean getPrototype() {
		return prototypeBean;
	}
}
