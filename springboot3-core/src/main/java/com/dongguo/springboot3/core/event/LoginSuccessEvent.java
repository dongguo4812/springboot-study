package com.dongguo.springboot3.core.event;

import com.dongguo.springboot3.core.entity.User;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
public class LoginSuccessEvent extends ApplicationEvent {
    public LoginSuccessEvent(User source) {
        super(source);
    }

}
