package com.learn.spring.annotation;

import com.learn.spring.entity.UserInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yunlongpang 2018/2/24
 */
@Configuration
public class BeansConfiguration {

    /**
     * 注册bean到Spring上下文,并且指定bean名称、初始化方法、销毁方法
     * @return UserInfo
     */
    @Bean(name = "user", initMethod = "initMethod", destroyMethod = "destroyMethod")
    public UserInfo userInfo() {
        return new UserInfo("Java", 18);
    }
}
