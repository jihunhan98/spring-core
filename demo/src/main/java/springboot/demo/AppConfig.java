package springboot.demo;

import springboot.demo.discount.FixDiscountPolicy;
import springboot.demo.repository.MemoryMemberRepository;
import springboot.demo.service.MemberService;
import springboot.demo.service.MemberServiceImpl;
import springboot.demo.service.OrderService;
import springboot.demo.service.OrderServiceImpl;

public class AppConfig {
   public MemberService memberService() {
       return new MemberServiceImpl(new MemoryMemberRepository());
   }

   public OrderService orderService() {
       return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
   }

}
