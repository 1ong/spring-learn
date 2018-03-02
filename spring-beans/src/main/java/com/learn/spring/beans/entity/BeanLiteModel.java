package com.learn.spring.beans.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author yunlongpang 2018/3/2
 * Bean methods in lite mode will be treated as plain factory methods by the container
 * (similar to factory-method declarations in XML), with scoping and lifecycle callbacks properly applied.
 * The containing class remains unmodified in this case, and there are no unusual constraints for the containing class or the factory methods.
 * In contrast to the semantics for bean methods in @Configuration classes, 'inter-bean references' are not supported
 * in lite mode. Instead, when one @Bean-method invokes another @Bean-method in lite mode,
 * the invocation is a standard Java method invocation; Spring does not intercept the invocation via a CGLIB proxy.
 */
@Component
public class BeanLiteModel {

    @Bean
    public UserInfo userInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("Python");
        userInfo.setAge(25);
        return userInfo;
    }

    @Bean
    public LessonInfo lessonInfo() {
        //调用@Bean方法两次检测是否是同一个Bean
        UserInfo userInfo = userInfo();
        System.out.println("user equals is " + (userInfo == userInfo()));
        LessonInfo lessonInfo = new LessonInfo();
        lessonInfo.setTeacher("Mr.Z");
        return lessonInfo;
    }
}
