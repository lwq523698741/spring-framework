package com.sanza.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-15 16:14
 **/
@Scope("prototype") @Component
public class PrototypeBean {

	public void say() {
		System.out.println("say()");
	};

}
