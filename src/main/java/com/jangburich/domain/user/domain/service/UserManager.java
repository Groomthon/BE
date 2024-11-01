package com.jangburich.domain.user.domain.service;

import org.springframework.stereotype.Service;

import com.jangburich.domain.user.domain.User;
import com.jangburich.domain.user.domain.UserCreateReqDto;
import com.jangburich.utils.JwtUtil;

import jakarta.servlet.http.Cookie;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserManager {
    private final UserService userService;
    private final JwtUtil jwtUtil;

    public Cookie createUser(UserCreateReqDto dto) {
        User newUser = userService.createUser(dto.getUserId(), dto.getNickname(), dto.getImage());
        String token = jwtUtil.createToken(newUser.getUserId(), newUser.getRole());
        return jwtUtil.createCookie("Authorization", token);
    }

    public Cookie login(String userId) {
        User selectedUser = userService.findUserByUserId(userId);
        String token = jwtUtil.createToken(selectedUser.getUserId(), selectedUser.getRole());
        return jwtUtil.createCookie("Authorization", token);
    }

}
