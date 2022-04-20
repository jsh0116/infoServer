package com.example.infoServer.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Optional;

@Component
public class InfoHandler {
    public Mono<ServerResponse> getResponseByJob(ServerRequest request) {
        Optional<String> query =  request.queryParam("name");
        HashMap<String, String> info = new HashMap<>();
        if (query.isPresent()) {
            String name = query.get();
            info.put("to", name);
            info.put("job", "BackEnd Developer");
            info.put("message","hello " + name);
            return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(info);
        } else {
            return ServerResponse.badRequest().build();
        }
    }
}
