package com.dongguo.springboot3.core.controller;

import com.dongguo.springboot3.core.entity.User;
import com.dongguo.springboot3.core.event.EventPublish;
import com.dongguo.springboot3.core.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@RestController
@Slf4j
public class LoginController {
    @Autowired
    private EventPublish eventPublish;
    @GetMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password){
        log.info("业务处理登录完成");

        LoginSuccessEvent loginSuccessEvent = new LoginSuccessEvent(new User(username, password));
        eventPublish.sendEvent(loginSuccessEvent);

        return username+"登陆成功";
    }
}
