package com.spring.service.impl;

import com.spring.entity.User;
import com.spring.repository.UserRepository;
import com.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User createUser(User user){
        user.setCreatedAt(new Date());
        user.setCreateBy("Admin");
        return userRepository.save(user);
    }

}
