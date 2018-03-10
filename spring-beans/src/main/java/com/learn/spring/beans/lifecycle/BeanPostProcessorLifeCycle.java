package com.learn.spring.beans.lifecycle;

import com.learn.spring.beans.util.Message;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author yunlongpang 2018/3/10
 */
public class BeanPostProcessorLifeCycle implements BeanPostProcessor{


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Message.print("BeanPostProcessor postProcessBeforeInitialization[bean=" + bean + ", name=" + beanName +"]");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        Message.print("BeanPostProcessor postProcessAfterInitialization[bean=" + bean + ", name=" + beanName +"]");
        return bean;
    }
}
