package com.dongguo.springboot3.ssm.mapper;

import com.dongguo.springboot3.ssm.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author dongguo
 * @date 2023/6/15
 * @description:
 */
public interface UserMapper {
    void insertUser(User user);
    User getUserById(@Param("id") Long id);
}
