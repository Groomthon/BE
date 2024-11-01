package com.jangburich.domain.user.domain.repository;

import com.jangburich.domain.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
