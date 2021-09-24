package com.wandou.bull.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author liming
 * @date 2021-09-24
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        int beanPostProcessorCount = configurableListableBeanFactory.getBeanPostProcessorCount();
        System.out.println("beanPostProcessorCount = " + beanPostProcessorCount);
        System.out.println("MyBeanFactoryPostProcessor liming");
    }
}

