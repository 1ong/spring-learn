package com.learn.spring.beans.junit;

import com.learn.spring.beans.entity.LessonInfo;
import com.learn.spring.beans.entity.UserInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ScannedGenericBeanDefinition;

/**
 * @author yunlongpang 2018/3/2
 */
public class SpringBeanJunit {

    @Test
    public void litModelBeanJunit() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ScannedGenericBeanDefinition.class);
        UserInfo userInfo = applicationContext.getBean(UserInfo.class);
        System.out.println(userInfo);
        LessonInfo lessonInfo = applicationContext.getBean(LessonInfo.class);
        System.out.println(lessonInfo);

    }
}
