package com.skillswap.dora.User;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepository;

    // Constructor injection is better than @Autowired for testing
    public UserService(UserRepo userRepo) {
        this.userRepository = userRepo;
    }

    @Transactional
    public UserEntity createUser(UserEntity user) {
        // Here you can add logic: e.g., user.setPassword(hashPassword(user.getPassword()));
        return userRepository.save(user);
    }

    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}