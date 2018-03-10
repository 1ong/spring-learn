package com.learn.spring.beans.lifecycle;

import com.learn.spring.beans.util.Message;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author yunlongpang 2018/3/10
 */
public class BeanFactoryPostProcessorLifeCycle implements BeanFactoryPostProcessor{


    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Message.print("BeanFactoryPostProcessor START");
        Message.print("BeanFactoryPostProcessor-BeanFactory:" + beanFactory);
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String definitionName : beanDefinitionNames) {
            Message.print("BeanFactoryPostProcessor-BeanName:" + definitionName);
        }
        Message.print("BeanFactoryPostProcessor END");
    }
}
