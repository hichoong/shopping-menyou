package com.mall.menyou.member.repository;

import com.mall.menyou.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByMemberIdAndPassword(String memberId, String password);
}
