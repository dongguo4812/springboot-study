package com.dongguo.springboot3.rpc.controller;

import com.dongguo.springboot3.rpc.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@RestController
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    /**
     * WebClient
     * @param city
     * @return
     */
    @GetMapping("/getWeatherWebClient")
    public Mono<String> getWeather(@RequestParam("city") String city){
       return weatherService.getWeather(city);
    }

    @GetMapping("/getWeatherInterface")
    public Mono<String> getWeatherInterface(@RequestParam("city") String city){
        return weatherService.getWeatherInterface(city);
    }

    @GetMapping("/getWeatherInterface7d")
    public Mono<String> getWeatherInterface7d(@RequestParam("city") String city){
        return weatherService.getWeatherInterface7d(city);
    }
}
