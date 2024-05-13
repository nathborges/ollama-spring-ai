# Spring AI with Ollama

This project contains a web service that will accept HTTP GET requests at
`http://localhost:8080/ai/chat`.

There is optional `message` parameter whose default value is "Hello, who are you?".

The response to the request is from the Ollama Service, using Mistral model.

## Prerequisites

Before using the project, make sure you have a instance of Ollama.

I created a script to start the project:

```shell
sh init.sh
```

## Access the endpoint

To get a response to the default request of "Hello, who are you?"

```shell 
curl localhost:8080/ai/chat
```

A sample response is 

```text
Sure, here's a classic one for you:

Why don't scientists trust atoms?

Because they make up everything!
```

Now using the `message` request parameter
```shell
curl --get  --data-urlencode 'message=Tell me something about airplanes' localhost:8080/ai/chat 
```

# Matrix challenge

This project contains a web service that will accept HTTP GET requests at
`http://localhost:8080/maxArea`.

Inside OllamaChatController class you can change the matrix, and this endpoint will give you the number of max area.


## Access the endpoint

```shell 
curl localhost:8080/maxArea
```
