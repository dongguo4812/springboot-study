package com.dongguo.springboot3.robot.config;

import com.dongguo.springboot3.robot.controller.RobotController;
import com.dongguo.springboot3.robot.properties.RobotProperties;
import com.dongguo.springboot3.robot.service.RobotService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@Configuration
//方式1
//@Import({RobotController.class, RobotService.class, RobotProperties.class})
public class RobotAutoConfiguration {
    //方式2
    @Bean
    public RobotController robotController(){
        return new RobotController();
    }
    @Bean
    public RobotService robotService(){
        return new RobotService();
    }
    @Bean
    public RobotProperties robotProperties(){
        return new RobotProperties();
    }
}
