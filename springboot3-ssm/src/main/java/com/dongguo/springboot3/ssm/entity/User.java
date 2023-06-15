package com.dongguo.springboot3.ssm.entity;

import lombok.Data;

/**
 * @author dongguo
 * @date 2023/6/15
 * @description:
 */
@Data
public class User {
    private Long id;
    private String username;
    private String password;
    private Integer age;
    private String gender;
    private String email;
}
