package com.shiyuan.springboottest;

import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author SHI YUAN
 * @DATE 2022/4/5 11:20 PM
 * @Version 1.0
 * @Desc
 */
public class MyselfImportRegiresty implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		System.err.println("execute ImportBeanDefinitionRegistrar >>>>>>>>>>>>>>>>>>>");
		if (registry instanceof DefaultListableBeanFactory){
			DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) registry;
			int beanDefinitionCount = beanFactory.getBeanDefinitionCount();

			// 获取先有的Spring IOC 容器
			System.out.println("[beanDefinitionCount] count: " + beanDefinitionCount);
			String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
			StringBuilder sb = new StringBuilder();
			StringUtils.join(beanDefinitionNames, ',', sb);
			System.out.println("bean names: " + sb.toString());



		}
	}
}
