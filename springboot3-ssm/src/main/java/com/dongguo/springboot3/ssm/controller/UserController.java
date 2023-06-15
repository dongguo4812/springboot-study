package com.dongguo.springboot3.ssm.controller;

import com.dongguo.springboot3.ssm.entity.User;
import com.dongguo.springboot3.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongguo
 * @date 2023/6/15
 * @description:
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userMapper.getUserById(id);
    }
}
