package com.haboutcafe.dto;

import com.haboutcafe.entity.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class AccessDto {

    @Getter
    @NoArgsConstructor
    public static class Join {
        private String email;

        private String nickName;

        private String password;

        @Builder
        public Join(String email, String nickName, String password) {
            this.email = email;
            this.nickName = nickName;
            this.password = password;
        }

        public User toEntity() {
            return User.builder()
                    .email(email)
                    .nickName(nickName)
                    .password(password)
                    .build();
        }
    }

    @Getter
    @NoArgsConstructor
    public static class Login {
        private String email;
        private String password;

        @Builder
        public Login(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public User toEntity() {
            return User.builder()
                    .email(email)
                    .password(password)
                    .build();
        }
    }
}
