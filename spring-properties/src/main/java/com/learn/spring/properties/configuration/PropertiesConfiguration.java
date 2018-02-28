package com.learn.spring.properties.configuration;

import com.learn.spring.properties.entity.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author yunlongpang 2018/2/28
 */
@Configuration
@ComponentScan(basePackages = "com.learn.spring.properties")
public class PropertiesConfiguration {


    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private int age;

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        Resource resource = new ClassPathResource("config.properties");
        configurer.setLocation(resource);
        return configurer;
    }

    @Bean
    public UserInfo userInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName(name);
        userInfo.setAge(age);
        return userInfo;
    }

}
