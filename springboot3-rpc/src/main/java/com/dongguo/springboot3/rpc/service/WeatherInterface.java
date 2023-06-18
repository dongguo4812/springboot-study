package com.dongguo.springboot3.rpc.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import reactor.core.publisher.Mono;

/**
 * @author dongguo
 * @date 2023/6/18
 * @description:
 */
@HttpExchange("http://getweather.market.alicloudapi.com")
public interface WeatherInterface {
    @GetExchange(url = "/lundear/weather1d",accept = "application/json")
    Mono<String> getWeather(@RequestParam("areaCn") String city);


    @GetExchange(url = "/lundear/weather7d",accept = "application/json")
    Mono<String> getWeather7d(@RequestParam("areaCn") String city);
}
