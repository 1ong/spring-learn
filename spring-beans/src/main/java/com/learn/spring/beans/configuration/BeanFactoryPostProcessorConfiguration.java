package com.learn.spring.beans.configuration;

import com.learn.spring.beans.entity.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yunlongpang 2018/3/7
 */
@Configuration
public class BeanFactoryPostProcessorConfiguration {


    private int age;

    /**
     * 先于BFPP初始化
     */
    public BeanFactoryPostProcessorConfiguration() {
        System.out.println("BeanFactoryPostProcessorConfiguration instance create");
    }

    @Bean
    public UserInfo userInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName("Python");
        userInfo.setAge(age);
        return userInfo;
    }

    @Bean
    public BeanFactoryPPConfigurationHandler beanFactoryProcessorHandler() {
        return new BeanFactoryPPConfigurationHandler();
    }
}
