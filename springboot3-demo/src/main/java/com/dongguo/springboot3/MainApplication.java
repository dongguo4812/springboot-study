package com.dongguo.springboot3;

import com.dongguo.springboot3.entity.Dog;
import com.dongguo.springboot3.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.nio.charset.Charset;

/**
 * Hello world!
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MainApplication.class, args);
//        String[] names = applicationContext.getBeanDefinitionNames();
//        for (String name : names) {
//            System.out.println(name);
//        }
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);
    }
}
