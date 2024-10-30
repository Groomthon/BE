package com.jangburich.domain.user.domain;

import com.jangburich.domain.user.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@RequiredArgsConstructor
class UserTest {

    private final UserRepository userRepository;

    @Test
    void getId() {
    }

}