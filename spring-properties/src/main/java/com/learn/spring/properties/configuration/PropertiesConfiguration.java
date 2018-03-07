package com.learn.spring.properties.configuration;

import com.learn.spring.properties.entity.UserInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @author yunlongpang 2018/2/28
 */
@Configuration
public class PropertiesConfiguration {


    @Value("${user.info.name}")
    private String name;

    @Value("${user.age}")
    private int age;

    public PropertiesConfiguration() {
        System.out.println("PropertiesConfiguration instacne create");
    }

    @Bean
    public UserInfo userInfo() {
        UserInfo userInfo = new UserInfo();
        userInfo.setName(name);
        userInfo.setAge(age);
        return userInfo;
    }

    /**
     * PropertySourcesPlaceholderConfigurer必须使用static才能使用@Value注入属性值
     * @return PropertySourcesPlaceholderConfigurer
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        System.out.println("PropertySourcesPlaceholderConfigurer start instance");
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        Resource resource = new ClassPathResource("user.properties");
        configurer.setLocation(resource);
        return configurer;
    }

}
