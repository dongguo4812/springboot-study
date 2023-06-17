package com.dongguo.springboot3.features.entity;

import lombok.Data;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Data
@Component
@Profile({"test"})
public class Child {
    private String name;
    private Integer age;
    private Date birthDay;
    private List<String> text; //数组
}
