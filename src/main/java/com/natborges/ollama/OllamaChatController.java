package com.natborges.ollama;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OllamaChatController {

    private final OllamaChatService service;

    public OllamaChatController(OllamaChatService service) {
        this.service = service;
    }

    @GetMapping("/health")
    public String health() {
        return "200";
    }

    @GetMapping("/ai/chat")
    public String chat(@RequestParam(value = "message", defaultValue = "Hello, who are you?") String message) {
        return service.generate(message);
    }
}