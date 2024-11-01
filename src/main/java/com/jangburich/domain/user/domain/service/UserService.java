package com.jangburich.domain.user.domain.service;

import org.springframework.stereotype.Service;

import com.jangburich.domain.user.domain.User;
import com.jangburich.domain.user.domain.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(String userId, String nickname, String image) {
        User newUser = new User();
        newUser.setUserId(userId);
        newUser.setNickname(nickname);
        newUser.setImage(image);
        newUser.setRole("ROLE_USER");
        return userRepository.save(newUser);

    }

    public User findUserByUserId(String userId) {
        return userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("유저가 존재하지 않습니다."));
    }
}
