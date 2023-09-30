package com.spring.service.impl;

import com.spring.entity.User;
import com.spring.repository.UserRepository;
import com.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
import java.util.Optional;

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

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }
    @Override
    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isPresent()){ // user var mı? varsa getir
            return user.get();
        }
        return null;  // yoksa null dön bişey yapma !!!
    }

}
