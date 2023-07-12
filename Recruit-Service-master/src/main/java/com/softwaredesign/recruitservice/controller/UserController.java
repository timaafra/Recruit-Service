package com.softwaredesign.recruitservice.controller;

import com.softwaredesign.recruitservice.model.User;
import com.softwaredesign.recruitservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userService.CreateUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        userService.delete(user);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping("/")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updatedUser = userService.update(user);
        return new ResponseEntity<>(updatedUser, HttpStatus.OK);
    }

    @GetMapping("/account/{accountId}")
    public ResponseEntity<User> getUserByAccountId(@PathVariable("accountId") Long accountId) {

        User user = userService.getUserByAccountId(accountId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/{name}/{lastName}")
    public ResponseEntity<User> getUserByNameAndLastName(@PathVariable("name") String name, @PathVariable("lastName") String lastName) {
        User user = userService.getByNameAndLastName(name, lastName);
        if (user != null) {
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
