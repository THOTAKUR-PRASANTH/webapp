package com.skillswap.dora.User;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*") // Allow your Next.js app to call this API
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public UserEntity register(@RequestBody UserEntity user) {
        return userService.createUser(user);
    }

    @GetMapping
    public List<UserEntity> getUsers() {
        return userService.getAllUsers();
    }
}