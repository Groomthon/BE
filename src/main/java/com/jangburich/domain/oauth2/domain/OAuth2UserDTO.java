package com.jangburich.domain.oauth2.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OAuth2UserDTO {
    private String userId;
    private String nickname;
    private String image;
    private String role;
    private LocalDateTime createdAt;
}
