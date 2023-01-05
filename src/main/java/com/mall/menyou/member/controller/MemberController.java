package com.mall.menyou.member.controller;

import com.mall.menyou.member.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {

    @GetMapping("/sign-up")
    public String signForm() {
        return "member/memberForm";
    }
    @PostMapping("/sign-up")
    public String sign() {
        return "member/memberForm";
    }

    @GetMapping("/login")
    private String login() {
        return "member/loginForm";
    }

    @PostMapping("/login")
    public String login(Member member) {

        return "member/loginForm";
    }

}
