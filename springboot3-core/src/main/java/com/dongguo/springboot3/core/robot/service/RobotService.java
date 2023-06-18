package com.dongguo.springboot3.core.robot.service;

import com.dongguo.springboot3.core.robot.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@Service
public class RobotService {
    @Autowired
    private RobotProperties robotProperties;

    public String sayhello(){
        return "你好：【"+robotProperties.getName()+"】;年龄：【"+robotProperties.getAge()+"】";
    }
}
