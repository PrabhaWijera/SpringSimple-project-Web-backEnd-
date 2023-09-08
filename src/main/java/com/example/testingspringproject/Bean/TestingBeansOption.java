package com.example.testingspringproject.Bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class TestingBeansOption implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactory"+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("SetBean"+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destory");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After Properties");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("setApplicationContext"+applicationContext);
    }
}
