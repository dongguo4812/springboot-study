package com.dongguo.springboot3.actuator.health;

import com.dongguo.springboot3.actuator.config.MyHahaComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;

/**
 * @author dongguo
 * @date 2023/6/22
 * @description:
 */
@Component
public class MyHahaHealthIndicator extends AbstractHealthIndicator {
    @Autowired
    private MyHahaComponent myHahaComponent;
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        Integer check = myHahaComponent.check();
        if (check == 1){
            builder.up()
                    .withDetail("code",200)
                    .withDetail("msg","存活")
                    .withDetail("data","").build();
        }else {
            builder.down().build();
        }
    }
}
