package com.userservice.User.service.service;

import com.userservice.User.service.entity.UserModel;
import com.userservice.User.service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserModel createUserModel(UserModel userModel){
        return userRepository.save(userModel);
    }
}
