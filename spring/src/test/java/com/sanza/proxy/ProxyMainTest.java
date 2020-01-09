package com.sanza.proxy;

import org.junit.Test;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-08 10:40
 **/
public class ProxyMainTest {


	public static class Student {

		public void eat() {
			System.out.println("吃饭");
		}

		public void sleep() {
			System.out.println("睡觉");
		}
	}

	public static void main(String[] args) {
		final Student student = (Student) ProxyFactory.createProxy(new Student());
		student.eat();
		student.sleep();
	}




}
