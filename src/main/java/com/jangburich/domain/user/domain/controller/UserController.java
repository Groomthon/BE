package com.jangburich.domain.user.domain.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jangburich.domain.user.domain.UserCreateReqDto;
import com.jangburich.domain.user.domain.service.UserManager;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserManager userManager;

    @PostMapping("/join")
    public String createUser(HttpServletResponse response, UserCreateReqDto userCreateReqDto) {
        response.addCookie(userManager.createUser(userCreateReqDto));
        return "유저가 성공적으로 생성되었습니다.";
    }

    @PostMapping("/login")
    public String login(HttpServletResponse response, String userId) {
        response.addCookie(userManager.login(userId));
        return "로그인에 성공하였습니다.";
    }
}
