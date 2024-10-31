package com.jangburich.domain.user.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	@Id
	private String userId;
	private String nickname;
	private String image;
	private String role;
	private LocalDateTime createdAt = LocalDateTime.now();
}
