package com.shiyuan.springboottest;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
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
	}
}
