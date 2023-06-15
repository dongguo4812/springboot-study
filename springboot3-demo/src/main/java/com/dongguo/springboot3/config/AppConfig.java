package com.dongguo.springboot3.config;

import com.dongguo.springboot3.entity.Cat;
import com.dongguo.springboot3.entity.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dongguo
 * @date 2023/6/11
 * @description:
 */
@Configuration
public class AppConfig {
    @Bean
    public User user(){
        User user = new User();
        user.setId(1L);
        user.setName("zhangsan");
        return user;
    }

    @ConditionalOnClass(name = "com.dongguo.springboot3.entity.Cat" +
            "" +
            "" +
            "" +
            "")
    @Bean
    public Cat cat(){
        return new Cat();
    }
}
