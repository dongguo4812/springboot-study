package com.dongguo.springboot3.robot.controller;


import com.dongguo.springboot3.robot.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@RestController
public class RobotController {
    @Autowired
    private RobotService robotService;

    @GetMapping("/sayHello")
    public String sayHello() {
        return robotService.sayhello();
    }
}
