package springboot.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springboot.demo.discount.DiscountPolicy;
import springboot.demo.discount.FixDiscountPolicy;
import springboot.demo.repository.MemberRepository;
import springboot.demo.repository.MemoryMemberRepository;
import springboot.demo.service.MemberService;
import springboot.demo.service.MemberServiceImpl;
import springboot.demo.service.OrderService;
import springboot.demo.service.OrderServiceImpl;

@Configuration
public class AppConfig {
    @Bean
   public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
   }

   @Bean
   public OrderService orderService() {
       System.out.println("call AppConfig.orderService");
       return new OrderServiceImpl(memberRepository(), new FixDiscountPolicy());
   }

   @Bean
   public MemberRepository memberRepository() {
       System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
   }

   @Bean
   public DiscountPolicy discountPolicy() {
       return new FixDiscountPolicy();
   }

}
