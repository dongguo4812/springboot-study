package com.dongguo.springboot3.features.entity;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author dongguo
 * @date 2023/6/11
 * @description:
 */
@Data
@Component
@Profile("dev")
public class Cat {
    private Long id;
    private String name;
}
