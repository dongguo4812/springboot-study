package com.dongguo.springboot3.core.service;

import com.dongguo.springboot3.core.entity.User;
import com.dongguo.springboot3.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@Service
public class AccountService  {
    @EventListener
    public void onEvent(LoginSuccessEvent loginSuccessEvent){
        User user = (User) loginSuccessEvent.getSource();
        addAccount(user.getUsername());
    }

    public void addAccount(String username){
        System.out.println(username + "增加1积分");
    }

//    implements ApplicationListener<LoginSuccessEvent>

//    @Override
//    public void onApplicationEvent(LoginSuccessEvent event) {
//        User user = (User) event.getSource();
//        addAccount(user.getUsername());
//    }
}
