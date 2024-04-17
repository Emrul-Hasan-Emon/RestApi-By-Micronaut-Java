package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/post/api")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Post
    public HttpResponse<User> getApiUser(@Body User body) {
        System.out.println("Request Body: " + body);
        System.out.println("Id: " + body.getId());
        return HttpResponse.created(userService.createuser(body));
    }

    @Get
    public HttpResponse<List<User>> getUserList() {
        return HttpResponse.ok(userService.getAllUser());
    }

    @Get("/{id}")
    public HttpResponse<User> getSingleUser(@PathVariable int id) {
        return HttpResponse.ok(userService.getUserById(id));
    }
}
