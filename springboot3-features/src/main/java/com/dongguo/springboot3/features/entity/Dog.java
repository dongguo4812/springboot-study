package com.dongguo.springboot3.features.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author dongguo
 * @date 2023/6/12
 * @description:
 */
@Data
@ToString
@Component
@Profile("prod")
@ConfigurationProperties(prefix = "dog")
public class Dog {
    private Long id;
    private String name;
    private Integer age;
}
