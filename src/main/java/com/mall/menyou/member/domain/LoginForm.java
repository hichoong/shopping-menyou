package com.mall.menyou.member.domain;


import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotEmpty;
import java.util.Optional;

@Getter
public class LoginForm {
    @NotEmpty(message = "아이디를 입력해주세요.")
    private String memberId;

    @NotEmpty(message = "비밀번호를 입력해주세요.")
    private String password;

    @Builder
    public LoginForm(String memberId, String password) {
        this.memberId = memberId;
        this.password = password;
    }
}
