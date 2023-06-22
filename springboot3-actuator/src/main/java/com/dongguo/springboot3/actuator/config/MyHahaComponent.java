package com.dongguo.springboot3.actuator.config;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

/**
 * @author dongguo
 * @date 2023/6/22
 * @description:
 */
@Component
public class MyHahaComponent {
    public Integer check() {
        return 1;
    }
    Counter counter;
    public MyHahaComponent(MeterRegistry meterRegistry) {
        counter = meterRegistry.counter("myController.hello");

    }

    public void hello() {
        System.out.println(counter.count());
        counter.increment();
    }
}
