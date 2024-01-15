package com.example.inventoryfailover.web;

import com.example.inventoryfailover.model.BeerInventoryDto;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Component
public class InventoryHandler {

    public Mono<ServerResponse> listInventory(ServerRequest serverRequest) {
        return ServerResponse.ok()
                .contentType(MediaType.APPLICATION_STREAM_JSON)
                .body(Mono.just(Collections.singletonList(
                        new BeerInventoryDto(
                        UUID.randomUUID(),
                        OffsetDateTime.now(),
                        OffsetDateTime.now(),
                        UUID.fromString("00000000-0000-0000-0000-000000000000"),
                        "00000000",
                        999)
                )), List.class);
    }
}
