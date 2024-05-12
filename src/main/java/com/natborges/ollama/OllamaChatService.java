package com.natborges.ollama;

import org.springframework.ai.chat.ChatClient;
import org.springframework.stereotype.Service;

@Service
public class OllamaChatService {

    private final ChatClient ollamaChatClient;

    public OllamaChatService(ChatClient ollamaChatClient) {
        this.ollamaChatClient = ollamaChatClient;
    }

    public String generate(String message) {
        return ollamaChatClient.call(message);
    }
}