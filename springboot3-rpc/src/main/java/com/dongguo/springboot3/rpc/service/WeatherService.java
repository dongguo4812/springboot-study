package com.dongguo.springboot3.rpc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@Service
public class WeatherService {

    @Autowired
    private WeatherInterface weatherInterface;
    public final static String URL = "http://getweather.market.alicloudapi.com/lundear/weather1d";
    public final static String APPCODE = "APPCODE 973e09131f1f4ec7b0cc7e60ae0eaaf4";

    public Mono<String> getWeather(String city) {

        Map<String, Object> params = new HashMap<>();
        params.put("areaCn", city);
        WebClient client = WebClient.create();

        return client.get()
                .uri(URL + "?areaCn={areaCn}" , params)
                .accept(MediaType.APPLICATION_JSON)
                .header("Authorization", APPCODE)
                .retrieve()
                .bodyToMono(String.class);
    }
    public Mono<String> getWeatherInterface(String city) {
        return weatherInterface.getWeather(city);
    }

    public Mono<String> getWeatherInterface7d(String city) {
        return weatherInterface.getWeather7d(city);
    }
}
