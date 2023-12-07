package com.chappy.sauna.aufguss.app.service;

import java.time.Instant;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chappy.sauna.aufguss.domain.auth.model.SigninUser;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthService {
  private final JwtEncoder encoder;
  private final UserDetailsManager users;
  private final PasswordEncoder passwordEncoder;

  public String issueToken(Authentication authentication) {
    Instant now = Instant.now();
    JwtClaimsSet claims = JwtClaimsSet.builder()
        .issuer("self") // トークン発行者
        .issuedAt(now) // トークン発行日時
        .expiresAt(now.plusSeconds(36000L)) // トークンの有効期限(1時間)
        .subject(authentication.getName()) // 認証ユーザーの名前
        .build();
    return this.encoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();
  }

  public void addUser(SigninUser signinUser) {
    UserDetails user = User.builder()
        .username(signinUser.getUsername())
        .password(passwordEncoder.encode(signinUser.getPassword()))
        .roles("USER")
        .build();
    users.createUser(user);
  }
}
