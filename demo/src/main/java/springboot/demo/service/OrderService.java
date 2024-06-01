package springboot.demo.service;

import springboot.demo.domain.Order;

public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}