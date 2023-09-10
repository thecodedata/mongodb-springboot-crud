package com.gangforcode.mongodbcrud.controller;

import com.gangforcode.mongodbcrud.model.User;
import com.gangforcode.mongodbcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

// adding new user
    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return service.addUser(user);
    }


//    update user info
    @PutMapping("/update/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return service.updateUser(id,user);
    }

//    Get all users
    @GetMapping("/getAll")
    public List<User> getAllUsers(){
        return service.getAllUsers();
    }

//    Get user by id
    @GetMapping("/getById/{id}")
    public Optional<User> getUserById(@PathVariable String id){
        return service.getUserById(id);
    }

//    Delete user by id

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable String id){
        service.deleteById(id);
    }


}
