package com.dongguo.springboot3.core.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@Service
public class EventPublish implements ApplicationEventPublisherAware {

    ApplicationEventPublisher applicationEventPublisher;
    public void sendEvent(ApplicationEvent event){
        applicationEventPublisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
