package com.sanza.config;

import com.sanza.dto.Bean3;
import com.sanza.dto.Bean4;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-01 23:43
 **/
@EnableAspectJAutoProxy
@Configuration
@ComponentScan(value = "com.sanza")
public class Config {

	public Config(){
		System.out.println("配置类的构造器");
	}
	@Bean
	public Bean3 getBean3() {
		return new Bean3();
	}

	@Bean
	public Bean4 getBean4() {
		final Bean3 bean3 = getBean3();
		System.out.println("1");
		return new Bean4();
	}
}
