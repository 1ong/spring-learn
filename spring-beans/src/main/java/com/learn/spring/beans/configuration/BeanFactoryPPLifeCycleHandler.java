package com.learn.spring.beans.configuration;

import com.learn.spring.beans.util.Message;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Iterator;

/**
 * @author yunlongpang 2018/3/2
 */
public class BeanFactoryPPLifeCycleHandler implements BeanFactoryPostProcessor{

    /**
     * 在加载xml配置文件之后,所有bean未初始化之前执行,可以提前初始化bean
     * @param beanFactory beanFactory
     * @throws BeansException BeansException
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        //创建Bean的工厂
        Message.print("ConfigurableListableBeanFactory[" + beanFactory + "]");
        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userInfo");
        //UserInfo的Bean相关定义
        Message.print("beanDefinition[class=" + beanDefinition.getBeanClassName() + "]");
        Iterator<String> beanNamesIterator = beanFactory.getBeanNamesIterator();
        while (beanNamesIterator.hasNext()) {
            //按xml配置顺序记录BeanName
            String beanName = beanNamesIterator.next();
            //getBean将初始化容器中的Bean
            Object bean = beanFactory.getBean(beanName);
            Message.print("default bean[name=" + beanName + ", bean=" + bean + "]");
        }
    }
}
