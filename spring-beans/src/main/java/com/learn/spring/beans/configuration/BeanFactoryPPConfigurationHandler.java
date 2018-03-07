package com.learn.spring.beans.configuration;

import com.learn.spring.beans.util.Message;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @author yunlongpang 2018/3/7
 */
public class BeanFactoryPPConfigurationHandler implements BeanFactoryPostProcessor{


    public BeanFactoryPPConfigurationHandler() {
        Message.print("BeanFactoryPPConfigurationHandler instance create");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
