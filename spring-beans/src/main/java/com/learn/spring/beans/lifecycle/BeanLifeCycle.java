package com.learn.spring.beans.lifecycle;

import com.learn.spring.beans.util.Message;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringValueResolver;

/**
 * @author yunlongpang 2018/3/10
 * Spring Bean LifeCycle
 */
public class BeanLifeCycle implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware,
        EnvironmentAware, EmbeddedValueResolverAware, ResourceLoaderAware,
        ApplicationEventPublisherAware, MessageSourceAware, ApplicationContextAware,
        InitializingBean, DisposableBean{


    private String beanName;

    private BeanFactory beanFactory;

    private ApplicationContext applicationContext;

    private ClassLoader classLoader;

    private Environment environment;

    private StringValueResolver stringValueResolver;

    private ResourceLoader resourceLoader;

    private ApplicationEventPublisher applicationEventPublisher;

    private MessageSource messageSource;


    public BeanLifeCycle() {
        Message.print("BeanLifeCycle Instance");
    }

    /**
     * BeanNameAware Method
     * @param name bean name
     */
    @Override
    public void setBeanName(String name) {
        Message.print("BeanNameAware:"+ name);
        this.beanName = name;
    }


    /**
     * BeanFactoryAware Method
     * @param beanFactory beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        Message.print("BeanFactoryAware:" + beanFactory);
        this.beanFactory = beanFactory;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Message.print("Bean InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        Message.print("Bean DisposableBean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Message.print("Bean ApplicationContextAware:" + applicationContext);
        this.applicationContext = applicationContext;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        Message.print("Bean BeanClassLoaderAware:" + classLoader);
        this.classLoader = classLoader;
    }

    @Override
    public void setEnvironment(Environment environment) {
        Message.print("Bean EnvironmentAware:" + environment);
        this.environment = environment;
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        Message.print("Bean EmbeddedValueResolverAware:" + stringValueResolver);
        this.stringValueResolver = stringValueResolver;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        Message.print("Bean ResourceLoaderAware:" + resourceLoader);
        this.resourceLoader = resourceLoader;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        Message.print("Bean ApplicationEventPublisherAware:" + applicationEventPublisher);
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        Message.print("Bean MessageSourceAware:" + messageSource);
        this.messageSource = messageSource;
    }

    @Override
    public String toString() {
        return "BeanLifeCycle{" +
                "beanName='" + beanName + '\'' +
                ", beanFactory=" + beanFactory +
                ", applicationContext=" + applicationContext +
                ", classLoader=" + classLoader +
                ", environment=" + environment +
                ", stringValueResolver=" + stringValueResolver +
                ", resourceLoader=" + resourceLoader +
                ", applicationEventPublisher=" + applicationEventPublisher +
                ", messageSource=" + messageSource +
                '}';
    }
}
