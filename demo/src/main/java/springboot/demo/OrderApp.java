package springboot.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springboot.demo.domain.Grade;
import springboot.demo.domain.Member;
import springboot.demo.domain.Order;
import springboot.demo.service.MemberService;
import springboot.demo.service.OrderService;

public class OrderApp {
    public static void main(String[] args) {
//        AppConfig appConfig = new AppConfig();
//        MemberService memberService = appConfig.memberService();
//        OrderService orderService = appConfig.orderService();

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 100000);

        System.out.println(order);
    }
}
