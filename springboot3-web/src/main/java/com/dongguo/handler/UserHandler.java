package com.dongguo.handler;

import com.dongguo.entity.User;
import jakarta.servlet.ServletException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author dongguo
 * @date 2023/6/14
 * @description:
 */
@Service
@Slf4j
public class UserHandler {
    /**
     * 查询指定id的用户
     * @param request
     * @return
     */
    public ServerResponse getUser(ServerRequest request) throws Exception{
        String id = request.pathVariable("id");
        log.info("查询 【{}】 用户信息，数据库正在检索",id);
        //业务处理
        User user = new User(1L,"哈哈");
        //构造响应
        return ServerResponse
                .ok()
                .body(user);
    }


    /**
     * 获取所有用户
     * @param request
     * @return
     * @throws Exception
     */
    public ServerResponse getUsers(ServerRequest request) throws Exception{
        log.info("查询所有用户信息完成");
        //业务处理
        List<User> list = Arrays.asList(new User(1L, "哈哈"),
                new User(2L, "哈哈2"));

        //构造响应
        return ServerResponse
                .ok()
                .body(list); //凡是body中的对象，就是以前@ResponseBody原理。利用HttpMessageConverter 写出为json
    }


    /**
     * 保存用户
     * @param request
     * @return
     */
    public ServerResponse saveUser(ServerRequest request) throws ServletException, IOException {
        //提取请求体
        User body = request.body(User.class);
        log.info("保存用户信息：{}",body);
        return ServerResponse.ok().build();
    }

    /**
     * 更新用户
     * @param request
     * @return
     */
    public ServerResponse updateUser(ServerRequest request) throws ServletException, IOException {
        User body = request.body(User.class);
        log.info("保存用户信息更新: {}",body);
        return ServerResponse.ok().build();
    }

    /**
     * 删除用户
     * @param request
     * @return
     */
    public ServerResponse deleteUser(ServerRequest request) {
        String id = request.pathVariable("id");
        log.info("删除【{}】用户信息",id);
        return ServerResponse.ok().build();
    }
}
