package com.example.infoServer.config;

import com.example.infoServer.handler.InfoHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> router(InfoHandler infoHandler) {
        return RouterFunctions.route()
                .GET("/job", infoHandler::getResponseByJob)
                .build();
    }

}
