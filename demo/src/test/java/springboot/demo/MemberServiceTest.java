package springboot.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springboot.demo.domain.Member;
import springboot.demo.repository.MemoryMemberRepository;
import springboot.demo.service.MemberService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }


    @Test
    void join() {
        //given
        Member member = new Member();
        member.setName("홍길동");

        //when
        memberService.join(member);

        //then
    }


}