package com.dongguo.springboot3.message;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class Springboot3MessageApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot3MessageApplication.class, args);
    }

}
