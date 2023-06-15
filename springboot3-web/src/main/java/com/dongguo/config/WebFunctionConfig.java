package com.dongguo.config;

import com.dongguo.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.RequestPredicate;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.web.servlet.function.RequestPredicates.accept;
import static org.springframework.web.servlet.function.RouterFunctions.route;

/**
 * @author dongguo
 * @date 2023/6/14
 * @description:
 */
@Configuration
public class WebFunctionConfig {

    private static final RequestPredicate ACCEPT_JSON = accept(MediaType.APPLICATION_JSON);
    @Bean
    public RouterFunction<ServerResponse> userRoute(UserHandler userHandler) {
        return route()
                .GET("/user/{id}", RequestPredicates.accept(MediaType.ALL), userHandler::getUser)
                .GET("/users",  userHandler::getUsers)
                .POST("/user", ACCEPT_JSON, userHandler::saveUser)
                .PUT("/user/{id}", ACCEPT_JSON, userHandler::updateUser)
                .DELETE("/user/{id}", userHandler::deleteUser)
                .build();
    }

}
