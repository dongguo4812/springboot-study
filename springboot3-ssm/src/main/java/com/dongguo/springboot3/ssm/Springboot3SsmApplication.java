package com.dongguo.springboot3.ssm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.dongguo.springboot3.ssm.mapper")
public class Springboot3SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3SsmApplication.class, args);
    }

}
