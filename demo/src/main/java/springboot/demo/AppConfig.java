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
       return new MemberServiceImpl(new MemoryMemberRepository());
   }

   @Bean
   public OrderService orderService() {
       return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
   }

   @Bean
   public MemberRepository memberRepository() {
       return new MemoryMemberRepository();
   }

   @Bean
   public DiscountPolicy discountPolicy() {
       return new FixDiscountPolicy();
   }

}
