package springboot.demo.repository;

import springboot.demo.domain.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}