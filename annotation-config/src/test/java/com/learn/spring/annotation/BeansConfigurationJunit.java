package com.learn.spring.annotation;

import com.learn.spring.entity.UserInfo;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @author yunlongpang 2018/2/24
 */
public class BeansConfigurationJunit {

    @Test
    public void start() {
        try {
            AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeansConfiguration.class);
            UserInfo userInfo = applicationContext.getBean(UserInfo.class);
            System.out.println("By Type: " + userInfo);
            userInfo = (UserInfo) applicationContext.getBean("user");
            System.out.println("By Name: " + userInfo);
            TimeUnit.SECONDS.sleep(2);
            //关闭容器,执行销毁方法
            applicationContext.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
