package ru.ermakovis.cicd.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public ResponseEntity<Mono<String>> getGreeting() {
        return ResponseEntity.ok(Mono.just("Hello, world"));
    }
}
