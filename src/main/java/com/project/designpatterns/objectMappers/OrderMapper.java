package com.project.designpatterns.objectMappers;

import com.project.designpatterns.pojos.OrderRequest;
import com.project.designpatterns.repository.entities.Order;

public class OrderMapper {
    public static Order convertToOrderEntity(OrderRequest order) {
        return Order.builder()
                .orderType(order.getOrderType())
                .firstName(order.getFirstName())
                .lastName(order.getLastName())
                .build();
    }
}
