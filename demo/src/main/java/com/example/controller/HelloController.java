package com.example.controller;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

@Controller("/hello")
public class HelloController {
    @Get
    public String getHello() {
        return "Hello World";
    }

    @Post
    public String postHello(@Body String st) {
        return st;
    }
}
