package com.sanza.config;

import com.sanza.dto.Bean3;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @program: spring
 * @description:
 * @author: liuwenqi
 * @create: 2020-01-02 15:15
 **/
@Component
public class SantaPostProcessor implements BeanFactoryPostProcessor {

	/**
	 * ConfigurableListableBeanFactory
	 * @param beanFactory the bean factory used by the application context
	 * @throws BeansException
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//final AbstractBeanDefinition bean1Definition = (AbstractBeanDefinition) beanFactory.getBeanDefinition("bean1");
		//bean1Definition.setBeanClass(Bean3.class);
	}

}
