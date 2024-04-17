package com.example.exception;

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import jakarta.inject.Singleton;

@Singleton
@Requires(classes = {UserNotFoundExceptionHanlder.class, ExceptionHandler.class})
public class UserNotFoundExceptionHanlder implements ExceptionHandler<UserNotFoundException, HttpResponse> {

    @Override
    public HttpResponse handle(HttpRequest request, UserNotFoundException exception) {
        return HttpResponse.ok("User not found");
    }
}
