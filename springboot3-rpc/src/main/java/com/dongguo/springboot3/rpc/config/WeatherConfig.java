package com.dongguo.springboot3.rpc.config;

import com.dongguo.springboot3.rpc.service.WeatherInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@Configuration
public class WeatherConfig {
    @Value("${aliyun.weather.appCode}")
    private String appCode;
    @Bean
    HttpServiceProxyFactory httpServiceProxyFactory(){
        System.out.println(appCode);
        WebClient client = WebClient
                .builder()
                .defaultHeader("Authorization", appCode)
                .build();
        HttpServiceProxyFactory factory = HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(client)).build();
    return factory;
    }
    @Bean
    WeatherInterface weatherInterface(HttpServiceProxyFactory factory){
        WeatherInterface weather = factory.createClient(WeatherInterface.class);
        return weather;
    }
}
