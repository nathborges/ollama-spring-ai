package com.natborges.ollama;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Response;

@RestController
public class OllamaChatController {

    private final OllamaChatService service;
    private final ProblemSolverService problemSolverService;


    public OllamaChatController(OllamaChatService service, ProblemSolverService problemSolverService) {
        this.service = service;
        this. problemSolverService = problemSolverService;
    }

    @GetMapping("/health")
    public String health() {
        return "200";
    }

    @GetMapping("/maxArea")
    public String getMaxArea() {
        char[][] matrixChar = new char[][]{
                {'0', '1', '1', '0'},
                {'1', '1', '1', '1'},
                {'1', '1', '1', '1'},
                {'1', '1', '0', '0'},
                {'1', '1', '1', '1'},
        };

        int area = this.problemSolverService.calculateAreaMaxRectangle(matrixChar);
        return "The max area of the matrix is: " + area;
    }

    @GetMapping("/ai/chat")
    public String chat(@RequestParam(value = "message", defaultValue = "Hello, who are you?") String message) {
        return service.generate(message);
    }
}