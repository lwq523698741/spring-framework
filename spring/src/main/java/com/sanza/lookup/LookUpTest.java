package com.sanza.lookup;

import com.sanza.config.Config;
import com.sanza.factorybean.FactoryBeanLearn;
import com.sanza.factorybean.HandleInvoke;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-15 16:17
 **/
public class LookUpTest {
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		final SingletonBean singletonBean1 = (SingletonBean) context.getBean("singletonBean");
		final SingletonBean singletonBean2 = (SingletonBean) context.getBean("singletonBean");
		System.out.println(singletonBean1.getPrototypeBean() == singletonBean1.getPrototypeBean());
		System.out.println(singletonBean1.getPrototype() == singletonBean1.getPrototype());

	}

}
