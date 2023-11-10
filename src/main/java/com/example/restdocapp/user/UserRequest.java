package com.example.restdocapp.user;

import lombok.Getter;
import lombok.Setter;

public class UserRequest {

    @Getter
    @Setter
    public static class JoinDTO {
        private Integer id;
        private String username;
        private String password;
        private String email;

        public User toEntity() {
            return User.builder()                    
                    .username(this.username)
                    .password(this.password)
                    .email(this.email)
                    .build();
        }
    }
}
