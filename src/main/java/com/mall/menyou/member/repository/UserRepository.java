package com.mall.menyou.member.repository;

import com.mall.menyou.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<Member, Long> {

}
