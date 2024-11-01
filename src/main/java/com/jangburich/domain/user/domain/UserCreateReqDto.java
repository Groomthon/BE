package com.jangburich.domain.user.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateReqDto {
    private String userId;
    private String password;
    private String nickname;
    private String image;
}
