package com.learn.spring.beans.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author yunlongpang 2018/3/2
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
