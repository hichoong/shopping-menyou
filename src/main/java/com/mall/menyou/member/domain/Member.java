package com.mall.menyou.member.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Builder
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String memberId;

    private String password;

    private String name;

    private String email;

    private String phone;

    @Embedded
    private Address address;

    @Enumerated(EnumType.STRING)
    private Gender gender;


}
