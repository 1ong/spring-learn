package com.learn.spring.beans.junit;

import com.learn.spring.beans.configuration.BeanFactoryPostProcessorConfiguration;
import com.learn.spring.beans.configuration.SpringBeanConfiguration;
import com.learn.spring.beans.entity.LessonInfo;
import com.learn.spring.beans.entity.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yunlongpang 2018/3/2
 */
public class SpringBeanJunit {

    @Test
    public void litModelBeanJunit() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
        UserInfo userInfo = applicationContext.getBean(UserInfo.class);
        System.out.println(userInfo);
        LessonInfo lessonInfo = applicationContext.getBean(LessonInfo.class);
        System.out.println(lessonInfo);

    }


    /**
     * BFPP生命周期单元测试
     */
    @Test
    public void classPathXmlBeanJunit() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        System.out.println("application load success.");
    }

    /**
     * BFPP通过@Bean注入单元测试
     */
    @Test
    public void beanFactoryPostProcessorJunit() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfiguration.class);
    }
}
