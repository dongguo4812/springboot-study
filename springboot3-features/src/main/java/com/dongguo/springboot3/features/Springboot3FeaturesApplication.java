package com.dongguo.springboot3.features;

import com.dongguo.springboot3.features.entity.Cat;
import com.dongguo.springboot3.features.entity.Child;
import com.dongguo.springboot3.features.entity.Dog;
import com.dongguo.springboot3.robot.config.RobotAutoConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@Slf4j
@SpringBootApplication
@Import(RobotAutoConfiguration.class)
public class Springboot3FeaturesApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot3FeaturesApplication.class, args);
        try {
            Cat cat = applicationContext.getBean(Cat.class);
            log.info("cat" + cat);
        } catch (Exception e) {
        }
        try {
            Child child = applicationContext.getBean(Child.class);
            log.info("child" + child);
        } catch (Exception e) {
        }
        try {
            Dog dog = applicationContext.getBean(Dog.class);
            log.info("dog" + dog);
        } catch (Exception e) {
        }
    }
}
