package com.jangburich.domain.oauth2.domain;

public interface OAuth2Response {
    String getProvider();

    String getProviderId();

    String getNickname();

    String getImage();
}