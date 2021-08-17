package com.project.designpatterns.dao;

import com.project.designpatterns.repository.OrderRepository;
import com.project.designpatterns.repository.entities.Order;
import org.springframework.stereotype.Component;

@Component
public class OrderDAO {
    private final OrderRepository orderRepository;

    public OrderDAO(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }
}
