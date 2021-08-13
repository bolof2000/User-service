package com.userservice.User.service.Controller;

import com.userservice.User.service.entity.UserModel;
import com.userservice.User.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/")
    public UserModel createUser(@RequestBody UserModel userModel){

        return userService.createUserModel(userModel);
    }
}
