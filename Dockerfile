FROM openjdk:21-jdk
COPY target/ollama-chat-0.0.1-SNAPSHOT.jar    ollama-chat-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ollama-chat-0.0.1-SNAPSHOT.jar"]