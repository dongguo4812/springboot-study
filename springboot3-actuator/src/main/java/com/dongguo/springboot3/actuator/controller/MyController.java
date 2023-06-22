package com.dongguo.springboot3.actuator.controller;

import com.dongguo.springboot3.actuator.config.MyHahaComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class MyController {
    @Autowired
    private MyHahaComponent myHahaComponent;
    @GetMapping("/hello")
    public void MyController(){
        myHahaComponent.hello();
    }

}
