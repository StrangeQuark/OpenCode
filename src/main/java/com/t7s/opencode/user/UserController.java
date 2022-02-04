package com.t7s.opencode.user;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "{username}")
    public Optional<Users> getProject(@PathVariable("username") String username) {
        return userService.getUserByUsername(username);
    }
}