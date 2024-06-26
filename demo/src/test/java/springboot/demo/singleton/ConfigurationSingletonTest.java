package springboot.demo.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springboot.demo.AppConfig;
import springboot.demo.repository.MemberRepository;
import springboot.demo.service.MemberServiceImpl;
import springboot.demo.service.OrderServiceImpl;

public class ConfigurationSingletonTest {

    @Test
    void configuratuinTest() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class);
        OrderServiceImpl orderService = ac.getBean("orderService", OrderServiceImpl.class);
        MemberRepository memberRepository3 = ac.getBean("memberRepository", MemberRepository.class);

        MemberRepository memberRepository1 = memberService.getMemberRepository();
        MemberRepository memberRepository2 = orderService.getMemberRepository();

        System.out.println("memberService -> memberRepository1 = " + memberRepository1);
        System.out.println("orderService ->memberRepository2 = " + memberRepository2);
        System.out.println("memberRepository ->memberRepository3 = " + memberRepository3);

        Assertions.assertThat(memberService.getMemberRepository()).isSameAs(memberRepository3);
        Assertions.assertThat(orderService.getMemberRepository()).isSameAs(memberRepository3);
    }

    @Test
    void configurationDeep() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfig bean = ac.getBean(AppConfig.class);

        System.out.println("bean = " + bean.getClass());
    }
}
