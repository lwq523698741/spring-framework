package com.sanza.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-01 23:43
 **/
@EnableAspectJAutoProxy
@ComponentScan(value = "com.sanza")
public class Config {
}
