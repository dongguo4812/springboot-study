package com.dongguo.springboot3.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author dongguo
 * @date 2023/6/12
 * @description:
 */
@Data
@ToString
@Component
@ConfigurationProperties(prefix = "dog")
public class Dog {
    private Long id;
    private String name;
    private Integer age;
}
