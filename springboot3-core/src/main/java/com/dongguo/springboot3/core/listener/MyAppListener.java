package com.dongguo.springboot3.core.listener;

import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;

/**
 * @author dongguo
 * @date 2023/6/17
 * @description:
 */
public class MyAppListener implements SpringApplicationRunListener {
    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("=========start======正在启动================");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("=========environmentPrepared======环境准备完成================");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("=========contextPrepared======IOC容器准备完成================");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("=========contextLoaded======IOC容器加载完成================");
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("=========started=====启动完成================");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, Duration timeTaken) {
        System.out.println("=========ready=====准备完成================");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("=========failed=====启动失败================");
    }
}
