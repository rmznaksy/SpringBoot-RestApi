package com.spring.api;

import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User resultUser = userService.createUser(user);
        return ResponseEntity.ok(resultUser);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getUsers(){
       List<User> users = userService.getUsers();
       return ResponseEntity.ok(users);
    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        User user = (User) userService.getUser(id);
        return ResponseEntity.ok(user);
    }

}
