package com.mall.menyou.member.service;

import com.mall.menyou.member.domain.CreateMemberForm;
import com.mall.menyou.member.domain.LoginForm;
import com.mall.menyou.member.domain.Member;
import com.mall.menyou.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    //회원가입
    private Long signUp(CreateMemberForm createMemberForm) {
        Member member = createMemberForm.createNember();
        memberRepository.save(member);
        return member.getId();
    }

    //로그인
    private Member login(LoginForm loginForm) {
      Member loginMember = memberRepository
                .findByMemberIdAndPassword(loginForm.getMemberId(), loginForm.getPassword())
              .orElseThrow(() -> new IllegalStateException("아이디와 비밀번호를 올바르지 않습니다."));
        return loginMember;
    }

    //정보조회
    @Transactional(readOnly = true)
    private Member findMember(Long id) {
        return memberRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("존재하지 않는 회원입니다. id = " + id));
    }

    //회원삭제
    private void deleteMember(Long id) {
        Member findMember = memberRepository.findById(id)
                .orElseThrow(() -> new IllegalStateException("존재하지 않는 회원입니다. id = " + id));
        memberRepository.delete(findMember);
    }

}
