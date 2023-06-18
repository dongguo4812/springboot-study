package com.dongguo.springboot3.core.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
public class MyListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("========事件到达===============" + event);
    }
}
