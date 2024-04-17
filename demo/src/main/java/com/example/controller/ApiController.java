package com.example.controller;

import com.example.model.User;
import com.example.service.UserService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import java.util.List;

@Controller("/api/users")
public class ApiController {
    private final UserService userService;

    public ApiController(UserService userService) {
        this.userService = userService;
    }

    @Post
    public HttpResponse<User> getApiUser(@Body User body) {
        return HttpResponse.created(userService.createuser(body));
    }

    @Get
    public HttpResponse<List<User>> getAllUser() {
        return HttpResponse.ok(userService.getAllUser());
    }

    @Get("/{id}")
    public HttpResponse<User> getSingleUser(@PathVariable int id) {
        return HttpResponse.ok(userService.getUserById(id));
    }

    @Put("/{id}")
    public HttpResponse<User> updateUser(@PathVariable int id, @Body User user) {
        return HttpResponse.ok(userService.updatedUser(id, user));
    }

    @Delete("/{id}")
    public HttpResponse<?> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return HttpResponse.ok();
    }
}
