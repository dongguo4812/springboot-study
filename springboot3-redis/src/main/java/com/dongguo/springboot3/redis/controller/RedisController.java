package com.dongguo.springboot3.redis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate redisTemplate;

    @GetMapping("/count")
    public String test(){
        Long count = redisTemplate.opsForValue().increment("count");
        return "当前访问次数:" + count;
    }
}
