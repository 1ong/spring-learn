package com.learn.spring.properties;

import com.learn.spring.properties.configuration.PropertiesConfiguration;
import com.learn.spring.properties.entity.LessonInfo;
import com.learn.spring.properties.entity.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yunlongpang 2018/2/28
 */
public class SpringPropertiesJunit {

    /**
     * 使用properties文件内容替换spring xml配置文件中占位符.
     * 配置PropertySourcesPlaceholderConfigurer指定properties文件
     */
    @Test
    public void applicationContextProperties() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        UserInfo userInfo = applicationContext.getBean(UserInfo.class);
        System.out.println(userInfo);
    }

    /**
     * 使用@Value注解需要开启注解扫描,否则@Value不会生效
     */
    @Test
    public void applicationContextValueProperties() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-value.xml");
        LessonInfo lessonInfo = applicationContext.getBean(LessonInfo.class);
        System.out.println(lessonInfo);
    }


    @Test
    public void configurationValueProperties() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(PropertiesConfiguration.class);
        UserInfo userInfo = applicationContext.getBean(UserInfo.class);
        System.out.println(userInfo);
    }
}
