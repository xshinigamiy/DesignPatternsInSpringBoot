package com.project.designpatterns.service;

import com.project.designpatterns.pojos.OrderRequest;

public interface OrderService {
    Long processOrder(OrderRequest order);
    String getType(String type);
}
