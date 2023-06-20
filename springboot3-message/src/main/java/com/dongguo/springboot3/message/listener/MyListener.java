package com.dongguo.springboot3.message.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

/**
 * @author dongguo
 * @date 2023/6/20
 * @description:
 */
@Component
public class MyListener {
    @KafkaListener(topics = "dongguo",groupId = "dongguo-service")
    public void listen(ConsumerRecord record){
        System.out.println("收到消息："+record); //可以监听到发给kafka的新消息，以前的拿不到
    }

    /**
     * 指定分区 偏移量
     * @param record
     */
    @KafkaListener(groupId = "dongguo-service2",topicPartitions = {
            @TopicPartition(topic = "dongguo",partitionOffsets = {
                    @PartitionOffset(partition = "0",initialOffset = "0")
            })
    })
    public void listenAll(ConsumerRecord record){
        System.out.println("收到partion-0消息："+record);
    }
}
