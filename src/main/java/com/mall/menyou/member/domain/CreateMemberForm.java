package com.mall.menyou.member.domain;

import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class CreateMemberForm {

    @NotEmpty
    private String memberId;

    @NotEmpty
    private String password;

    @NotEmpty
    private String name;

    @Email
    private String email;

    private String phone;

    private Address address;

    private Gender gender;

    //Dto를 Entity로  바꾸기
    @Builder
    public Member createNember() {
        return Member.builder()
                .memberId(memberId)
                .password(password)
                .name(name)
                .email(email)
                .phone(phone)
                .address(address)
                .gender(gender)
                .build();

    }
}
