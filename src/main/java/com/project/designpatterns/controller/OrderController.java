package com.project.designpatterns.controller;

import com.project.designpatterns.pojos.OrderRequest;
import com.project.designpatterns.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class OrderController {

    private final Map<String, OrderService> orderServiceMap;

    public OrderController(Map<String, OrderService> orderServiceMap) {
        this.orderServiceMap = orderServiceMap;
    }


    @PostMapping(value = "/process-order")
    public Long processOrder(@RequestBody OrderRequest order) {
        return orderServiceMap.get(order.getOrderType()).processOrder(order);
    }

}
