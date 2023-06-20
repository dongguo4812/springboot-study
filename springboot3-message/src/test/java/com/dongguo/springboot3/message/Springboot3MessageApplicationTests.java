package com.dongguo.springboot3.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.util.StopWatch;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@SpringBootTest
class Springboot3MessageApplicationTests {


    @Autowired
    KafkaTemplate kafkaTemplate;
    @Test
    void contextLoads() {
        StopWatch watch = new StopWatch();
        watch.start();
        CompletableFuture[] futures = new CompletableFuture[10000];
        for (int i = 0; i < 10000; i++) {
            CompletableFuture send = kafkaTemplate.send("dongguo", "order.create."+i, "订单创建了："+i);
            futures[i]=send;
        }
        CompletableFuture.allOf(futures).join();
        watch.stop();
        System.out.println("总耗时："+watch.getTotalTimeMillis());
    }
    @Test
    public void send(){
        kafkaTemplate.send("dongguo","person", new Person(1L,"张三"));
    }


}
@Data
@AllArgsConstructor
class Person{
    private Long id;
    private String name;
}
