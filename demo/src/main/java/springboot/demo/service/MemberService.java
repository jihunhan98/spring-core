package springboot.demo.service;

import springboot.demo.domain.Member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}