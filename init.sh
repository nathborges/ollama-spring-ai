#!/bin/bash

docker container stop ollama
docker container rm ollama
docker run -d -v ollama:/root/.ollama -p 11434:11434 --name ollama ollama/ollama
docker exec -it ollama ollama pull mistral

./mvnw spring-boot:run