package com.rahul.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.rahul.data.GreetingData;

import reactor.core.publisher.Mono;

@Component
public class GreetingHandler {
	
	@Value("${greetingMessage:Hello from k8s Sample App}")
	String greetingMessage;

	public Mono<ServerResponse> hello(ServerRequest request) {
		GreetingData greetingData = new GreetingData(greetingMessage);
		
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).body(BodyInserters.fromValue(greetingData));
	}

}
